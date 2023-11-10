package ktln

import interfaces.Animal
import java.util.Objects


class LinkedList<T: Animal>: Queue<T>, Stack<T>{
    private var size: Int = 0
    private var firstNode: Node<T>? = null
    private var lastNode: Node<T>? = null

    private fun addFirst(node: Node<T>) {
        firstNode = node
        lastNode = firstNode
    }

    private fun addSecond(node: Node<T>) {
        lastNode = node
        firstNode.apply {
            this?.nextNode = node
        }
    }

    private fun addRegular(node: Node<T>) {
        lastNode.apply { this?.nextNode = node }
        lastNode = node
    }

    private fun add(node: Node<T>) {
        if (firstNode == null) {
            addFirst(node)
        } else if (lastNode == firstNode) {
            addSecond(node)
        } else {
            addRegular(node)
        }
        size++;
    }

    fun del(index: Int) {
        if (index >= size) {
            throw IndexOutOfBoundsException("Max index is " + size)
        }
        var i: Int = 0
        var cursor: Node<T>? = firstNode

        while (i < index - 1) {
            cursor = cursor?.nextNode
            i++
        }

        if (cursor == firstNode) {
            firstNode.apply { this?.nextNode = null }
            firstNode = firstNode?.nextNode
        } else if (cursor?.nextNode == lastNode) {
            lastNode = cursor
            cursor.apply { this?.nextNode = null }
        } else {
            cursor.apply { this?.nextNode = this?.nextNode?.nextNode }
        }

    }

    override fun add(value: T) {
        add(Node(value))
    }

    override fun pop(): T {
        TODO("Not yet implemented")
    }

    override fun remove(): T {
        val toRemove = firstNode
        firstNode = toRemove?.nextNode
        toRemove.apply {
            this?.nextNode = null
        }
        return toRemove!!.value
    }

    override fun toString(): String {
        var result: String = ""
        var cursor: Node<T>? = firstNode
        do {
            result += cursor?.value
            result += " "
            cursor = cursor?.nextNode
        } while (cursor != null)
        return result
    }


}
