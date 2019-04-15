package ch08.stackAndQueue;

public class MyStackLinkedList<E>{

    Node top;

    public MyStackLinkedList() {

    }

    public boolean isEmpty() {
        if (top == null) return true;
        return false;
    }

    public int peek() {
        return top.data;
    }

    public int pop() {
        int data = (int) peek();
        top = top.next;
        return data;
    }

    public int push(int item) {
        if (top == null) {
            top = new Node(item);
        } else {
            Node node = new Node((int)item);
            node.next = top;
            top = node;
        }
        return top.data;
    }
}
