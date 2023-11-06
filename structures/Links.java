package structures;

public class Links {
    private Node firstNode;
    private Node lastNode;

    public Links() {
        firstNode = null;
        lastNode = null;
    }

    private void add(Node node) {
        if (firstNode == null) {
            firstNode = lastNode = node;
        } else if (lastNode == firstNode) {
            lastNode = node;
            firstNode.setNextNode(lastNode);
        } else {
//            Node swap = lastNode;
            lastNode.setNextNode(node);
            lastNode = node;
        }
    }

    public void add(int value) {
        add(new Node(value));
    }

    @Override
    public String toString() {
        String values = "";
        Node cursor = firstNode;
        do {
            values += cursor.getValue() + " ";
            cursor = cursor.getNextNode();
        } while (cursor.getNextNode() != null);
        values += cursor.getValue();
        return values;
    }
}

//Helloo
