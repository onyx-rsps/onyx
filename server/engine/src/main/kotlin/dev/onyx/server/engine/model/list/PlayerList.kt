package dev.onyx.server.engine.model.list

import dev.onyx.server.engine.model.entity.Player
import java.util.*
import kotlin.random.Random

class PlayerList(val capacity: Int) : Iterable<Player> {

    private val players = arrayOfNulls<Player>(capacity)
    private val occupiedIndexes = mutableListOf<Int>()
    private val freeIndexes = Stack<Int>()
    private val iterator = PidIterator()

    init {
        for(index in capacity downTo 1) {
            freeIndexes.push(index)
        }
    }

    val size: Int get() = occupiedIndexes.size

    override fun iterator(): PidIterator = PidIterator()

    fun add(player: Player) {
        val index = freeIndexes.pop()
        val pid = Random.nextInt(occupiedIndexes.size + 1)
        player.index = index
        player.pid = pid
        players[player.index] = player
        occupiedIndexes.add(pid, player.index)
    }

    fun remove(player: Player) {
        players[player.index] = null
        occupiedIndexes.remove(player.index)
        freeIndexes.add(player.index)
    }

    fun randomizePid() {
        occupiedIndexes.shuffle()
        for(index in occupiedIndexes) {
            players[index]!!.pid = iterator.currentIndex
        }
    }

    operator fun get(index: Int): Player? = players[index]

    /**
     * The player list iterator implementation based on the player's PID
     *
     * @property currentIndex Int
     */
    inner class PidIterator : MutableIterator<Player> {

        internal var currentIndex: Int = 0

        override fun hasNext(): Boolean {
            return currentIndex < occupiedIndexes.size
        }

        override fun next(): Player {
            return players[occupiedIndexes[currentIndex++]] ?: next()
        }

        override fun remove() {
            players[currentIndex] = null
            occupiedIndexes.remove(currentIndex)
            freeIndexes.add(currentIndex)
        }
    }
}