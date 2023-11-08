package ktln

class LinkedList {
    private var firstNode: Node? = null
    private var lastNode: Node? = null
    private fun add(node: Node) {
        if (firstNode == null) {
            firstNode = node
            lastNode = firstNode
        } else if (lastNode == firstNode) {
            lastNode = node
            firstNode.apply {
                this?.nextNode = node
            }
        } else {
            lastNode.apply { this?.nextNode = node }
            lastNode = node
        }
    }

    fun del(index: Int){
        var i: Int = 0
        var cursor: Node? = firstNode

        while (i < index-1){
            cursor = cursor?.nextNode
            i++
        }

        if (cursor == firstNode){
            firstNode.apply { this?.nextNode = null }
            firstNode = firstNode?.nextNode
        } else if (cursor?.nextNode == lastNode){
            lastNode = cursor
            cursor.apply { this?.nextNode = null }
        } else {
            cursor.apply { this?.nextNode = this?.nextNode?.nextNode }
        }

    }
    fun add(value: Int) {
        add(Node(value))
    }

    override fun toString(): String {
        var result: String = ""
        var cursor: Node? = firstNode
        do{
            result += cursor?.value
            result += " "
            cursor = cursor?.nextNode
        }while (cursor != null)
        return result
    }


}
