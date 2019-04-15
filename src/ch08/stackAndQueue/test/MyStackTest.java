package ch08.stackAndQueue.test;

import ch08.stackAndQueue.MyStack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

    private MyStack<Integer> myStack = new MyStack<>();

    @Before
    public void before() {
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        System.out.println(String.format("Stack size = %d", myStack.getSize()));
    }

    @After
    public void after() {

    }

    @Test
    public void testPush() {
        for (int i = 0; i < 100; i++) {
            myStack.push(i);
        }
        System.out.println(String.format("Stack size = %d", myStack.getSize()));
    }
}
