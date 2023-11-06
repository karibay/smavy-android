package ktln

class LinkedList {
    private var firstNode: Node? = null
    private var lastNode: Node? = null
    private fun add(node: Node) {
        if (firstNode == null) {
            firstNode = node
            lastNode = firstNode
        } else if (lastNode == null) {
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
        while (i < index){
            cursor = cursor?.nextNode
            i++
        }
        cursor.apply { this?.nextNode = this?.nextNode?.nextNode }
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
