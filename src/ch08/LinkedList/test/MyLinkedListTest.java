package ch08.LinkedList.test;

import ch08.LinkedList.MyLinkedList;
import ch08.LinkedList.Node;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class MyLinkedListTest {

    private MyLinkedList list = null;
    @Before
    public void before() {
        list = new MyLinkedList();
        list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
//        list.addNode(1);
    }

    @After
    public void after() {
        list = null;
    }

    @Test
    public void testAddNode(){
        assert list.length() == 6;
        System.out.println("ListLen = " + list.length());
        list.printList();
        list.delNode(2);
        assert list.length() == 5;
        list.printList();
    }

    @Test
    public void testOrderList(){
        list.orderList();
        list.printList();
    }

    @Test
    public void testDeleteDuplicate(){
        list.deleteDuplicate();
        list.printList();
    }

    @Test
    public void testDeleteDuplicate2(){
        list.deleteDuplicate2();
        list.printList();
    }

    @Test
    public void testDeleteDuplicate3(){
        list.deleteDuplicate3();
        list.printList();
    }

    @Test
    public void testFindElement(){
        Node testNode = list.findElement(10);
        assert testNode == null;
        testNode = list.findElement(1);
        assert testNode.getData() == 3;
    }

    @Test
    public void testReverseIteratively() {
        Node node = list.reverseIteratively();
        list.printMyList(node);
    }

    @Test
    public void testReverseIteratively2() {
        Node node = list.reverseIteratively2();
        list.printMyList(node);
    }

}
