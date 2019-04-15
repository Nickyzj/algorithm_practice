package ch08.LinkedList;

public class Node {
    public Node next = null;
    int data;

    public int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    Node(int data) {
        this.data = data;
    }
}
