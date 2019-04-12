package ch08.LinkedList;

public class MyLinkedList {
    public Node head = null;

    public void addNode(int d) {
        if (head == null) {
            head = new Node(d);
            return;
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new Node(d);
        }
    }

    public Boolean delNode(int index) {
        if (index < 1 || index > length()) return false;
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 2;
        Node preNode = head;
        Node currNode = preNode.next;
        while (currNode != null) {
            if (index == i) {
                preNode.next = currNode.next;
                return true;
            }
            preNode = currNode;
            currNode = currNode.next;
            i++;
        }
        return true;
    }

    public int length() {
        if (head == null) return 0;
        int length = 1;
        Node pointer = head;
        while ( pointer.next != null) {
            pointer = pointer.next;
            length++;
        }
        return length;
    }

    public void printList() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.getData() + " ");
            pointer = pointer.getNext();
        }
        System.out.println();
    }
}
