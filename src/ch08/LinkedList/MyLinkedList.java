package ch08.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyLinkedList {
    private Node head = null;

    public void addNode(int d) {
        if (head == null) {
            head = new Node(d);
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

    public Node orderList() {
        if (head == null) return null;
        Node currentNode = head;
        int temp;
        while (currentNode.next != null) {
            Node nextNode = currentNode.next;
            while (nextNode != null) {
                if (currentNode.data > nextNode.data) {
                    temp = nextNode.data;
                    nextNode.data = currentNode.data;
                    currentNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            currentNode = currentNode.next;
        }
        return head;
    }

    public void deleteDuplicate() {
        Set set = new HashSet();
        if (head == null || head.next == null) return;
        Node currentNode = head;
        Node nextNode = currentNode.next;
        set.add(currentNode.data);
        while (nextNode != null) {
            if (set.contains(nextNode.data)) {
                currentNode.next = nextNode.next;
                nextNode = currentNode.next;
            } else {
                set.add(nextNode.data);
                currentNode = currentNode.next;
                nextNode = nextNode.next;
            }
        }
    }

    public void deleteDuplicate2() {
        Map<Integer, Integer> map = new HashMap<>();
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            if (map.containsKey(currentNode.data)){
                previousNode.next = currentNode.next;
            } else {
                map.put(currentNode.data, 1);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void deleteDuplicate3() {
        Node p1 = head;
        Node p2;
        while (p1 != null) {
            p2 = p1.next;
            while (p2 != null){
                if (p1.data == p2.data) {
                    p1.next = p2.next;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
    }

    public Node findElement(int k) {
        if (head == null) return null;
        Node node = head;
        Node nodeK = node;
        for (int i = 0; i < k; i++) {
            if (nodeK.next != null) {
                nodeK = nodeK.next;
            } else {
                System.out.println(String.format("List is less than k = %d", k));
                return null;
            }
        }
        while (nodeK.next != null) {
            node = node.next;
            nodeK = nodeK.next;
        }
        return node;
    }
}
