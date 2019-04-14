package ch08.LinkedList;

public class Node {
    Node next = null;
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
