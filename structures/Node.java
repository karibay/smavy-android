package structures;

public class Node {
    private int value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
        nextNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
