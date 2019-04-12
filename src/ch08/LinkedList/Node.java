package ch08.LinkedList;

public class Node {
    Node next = null;
    private int data;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node(int data) {
        this.data = data;
    }
}
