package test.ch08.LinkedList;

import ch08.LinkedList.MyLinkedList;
import ch08.LinkedList.Node;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class MyLinkedListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addNode(int d)
     */
    @Test
    public void testAddNode() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);
        assert list.length() == 4;
        System.out.println("ListLen = " + list.length());
        list.printList();
        list.delNode(2);
        assert list.length() == 3;
        list.printList();
    }


} 
