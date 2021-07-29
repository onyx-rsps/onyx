import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import java.net.URL
import javax.swing.*
import kotlin.system.exitProcess

object ClientLauncher {

    internal val CODEBASE = "http://127.0.0.1/"
    internal val MODULUS = ""

    private val params = mutableMapOf<String, String>()

    init {
        params["title"] = "Onyx"
        params["codebase"] = CODEBASE
        params["cachedir"] = "oldschool"
        params["storebase"] = "0"
        params["applet_minwidth"] = "765"
        params["applet_minheight"] = "503"
        params["1"] = "1"
        params["2"] = "https://payments.jagex.com/"
        params["3"] = "false"
        params["4"] = "62473"
        params["5"] = "0"
        params["6"] = "0"
        params["7"] = "0"
        params["8"] = "true"
        params["9"] = "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw"
        params["10"] = "5"
        params["11"] = "https://auth.jagex.com/"
        params["12"] = "1"
        params["13"] = ""
        params["14"] = "0"
        params["15"] = "0"
        params["16"] = "false"
        params["17"] = CODEBASE
        params["18"] = ""
        params["19"] = "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com"
        params["20"] = "https://token-auth.production.jxp.aws.jagex.com/"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        /*
         * Setup and install Swing LAF theme.
         */
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        FlatOneDarkIJTheme.setup()

        val icons = listOf(
            "logo-64.png",
            "logo-128.png",
            "logo-256.png",
            "logo-400.png"
        ).map { ImageIcon(ClientLauncher::class.java.classLoader.getResource(it)).image }

        val applet = client()
        applet.background = Color.BLACK
        applet.preferredSize = Dimension(params["applet_minwidth"]!!.toInt(), params["applet_minheight"]!!.toInt())
        applet.minimumSize = applet.preferredSize
        applet.size = applet.preferredSize
        applet.layout = null
        applet.setStub(applet.createStub())
        applet.isVisible = true
        applet.init()

        val menuBar = JMenuBar().also { menuBar ->
            JMenu("File").also { menu ->
                JMenuItem("Exit").also { item ->
                    item.addActionListener {
                        exitProcess(0)
                    }
                    menu.add(item)
                }
                menuBar.add(menu)
            }

            JMenu("Edit").also { menu ->
                JMenuItem("Preferences").also { item ->
                    menu.add(item)
                }
                menuBar.add(menu)
            }

            JMenu("View").also { menu ->
                JMenuItem("Developer Tools").also { item ->
                    menu.add(item)
                }
                menuBar.add(menu)
            }

            JMenu("Help").also { menu ->
                JMenuItem("About").also { item ->
                    menu.add(item)
                }
                menuBar.add(menu)
            }
        }

        val frame = JFrame("Onyx")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.iconImages = icons
        frame.jMenuBar = menuBar
        frame.layout = GridLayout(1, 0)
        frame.add(applet)
        frame.pack()
        frame.minimumSize = frame.size
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }

    private fun Applet.createStub(): AppletStub = object : AppletStub {
        override fun isActive(): Boolean = true
        override fun getAppletContext(): AppletContext? = null
        override fun getCodeBase(): URL = URL(params["codebase"])
        override fun getDocumentBase(): URL = URL(params["codebase"])
        override fun getParameter(name: String): String? = params[name]
        override fun appletResize(width: Int, height: Int) { this@createStub.setSize(width, height) }
    }
}