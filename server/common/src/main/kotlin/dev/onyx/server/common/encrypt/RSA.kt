package dev.onyx.server.common.encrypt

import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.bouncycastle.util.io.pem.PemObject
import org.bouncycastle.util.io.pem.PemReader
import org.bouncycastle.util.io.pem.PemWriter
import org.tinylog.kotlin.Logger
import java.math.BigInteger
import java.nio.file.Files
import java.nio.file.Paths
import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.Security
import java.security.interfaces.RSAPrivateKey
import java.security.interfaces.RSAPublicKey
import java.security.spec.PKCS8EncodedKeySpec
import kotlin.io.path.deleteIfExists

object RSA {

    private const val KEY_SIZE = 2048
    private const val RADIX = 16

    lateinit var exponent: BigInteger
    lateinit var modulus: BigInteger

    private val directory = Paths.get("data/rsa/")

    private val privateKeyPath = directory.resolve("private.pem")
    private val publicKeyPath = directory.resolve("public.pem")
    private val modulusPath = directory.resolve("modulus.txt")

    fun exists(): Boolean {
        return listOf(publicKeyPath, privateKeyPath, modulusPath).all { Files.exists(it) }
    }

    fun load() {
        Logger.info("Loading RSA keys.")

        if(!exists()) {
            Logger.info("Failed to read or open either the private or public RSA key files. Generating new key-pair.")
            generateKeyPair()
        }

        PemReader(Files.newBufferedReader(privateKeyPath)).use { reader ->
            val pem = reader.readPemObject()
            val keySpec = PKCS8EncodedKeySpec(pem.content)

            Security.addProvider(BouncyCastleProvider())

            val factory = KeyFactory.getInstance("RSA", "BC")
            val privateKey = factory.generatePrivate(keySpec) as RSAPrivateKey

            exponent = privateKey.privateExponent
            modulus = privateKey.modulus
        }

        Logger.info("Successfully loaded RSA keys.")
    }

    fun generateKeyPair() {
        Logger.info("Generating new RSA private-public key-pair...")

        privateKeyPath.deleteIfExists()
        publicKeyPath.deleteIfExists()
        modulusPath.deleteIfExists()

        Security.addProvider(BouncyCastleProvider())

        val generator = KeyPairGenerator.getInstance("RSA", "BC")
        generator.initialize(KEY_SIZE)

        val keyPair = generator.generateKeyPair()

        val privateKey = keyPair.private as RSAPrivateKey
        val publicKey = keyPair.public as RSAPublicKey

        println("")
        println("------------------------------------------------------------------")
        println("public exponent: ${publicKey.publicExponent.toString(RADIX)}")
        println("public modulus: ${publicKey.modulus.toString(RADIX)}")
        println("")
        println("The key-pair information has be saved to the directory: 'data/rsa/'.")
        println("------------------------------------------------------------------")

        PemWriter(Files.newBufferedWriter(publicKeyPath)).use { writer ->
            writer.writeObject(PemObject("RSA PUBLIC KEY", publicKey.encoded))
        }

        PemWriter(Files.newBufferedWriter(privateKeyPath)).use { writer ->
            writer.writeObject(PemObject("RSA PRIVATE KEY", privateKey.encoded))
        }

        Files.newBufferedWriter(modulusPath).use { writer ->
            writer.write(publicKey.modulus.toString(RADIX))
        }
    }
}