package ch08.stackAndQueue.test;

import ch08.stackAndQueue.MyStackLinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStackLinkedListTest {

    MyStackLinkedList myStackLinkedList = new MyStackLinkedList();

    @Before
    public void before() {}

    @After
    public void after() {}

    @Test
    public void testPush() {
        assert myStackLinkedList.isEmpty() == true;
        myStackLinkedList.push(1);
        assert myStackLinkedList.isEmpty() == false;
        assertEquals(myStackLinkedList.peek(), 1);
        assertEquals(myStackLinkedList.pop(), 1);
        assert myStackLinkedList.isEmpty() == true;
        for (int i = 0; i < 5; i++) {
            myStackLinkedList.push(i);
        }
        for (int i = 4; i >= 0; i--) {
            assertEquals(myStackLinkedList.pop(), i);
        }
    }
}
