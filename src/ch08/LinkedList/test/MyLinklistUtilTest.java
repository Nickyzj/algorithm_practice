package ch08.LinkedList.test;

import ch08.LinkedList.MyLinkedList;
import ch08.LinkedList.MyLinklistUtil;
import ch08.LinkedList.Node;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class MyLinklistUtilTest {

    private MyLinkedList list = null;

    @Before
    public void before() throws Exception {
        list = new MyLinkedList();
        list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
//        list.addNode(1);
    }

    @After
    public void after() throws Exception {
        list = null;
    }

    @Test
    public void testPrintListReversely() throws Exception {
        MyLinklistUtil.printListReversely(list.head);

    }

    @Test
    public void testSearchMid() {
        Node node = MyLinklistUtil.searchMid(list.head);
        assert node.getData() == 4;
    }

} 
