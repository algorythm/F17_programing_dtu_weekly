package week01;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;

/**
 * Created by AndersWOlsen on 05-02-2017.
 */
public class LinkedStackTest {
    @Test
    public void pushPop() throws Exception {
        Stack<String> s = new LinkedStack<>();
        s.push("test01");
        assertEquals("test01", s.pop());
    }

    @Test
    public void pushPopMultiple() throws Exception {
        Stack<String> s = new LinkedStack<>();
        s.push("test01");
        s.push("test02");
        assertEquals("test02", s.pop());
        assertEquals("test01", s.pop());
    }

    @Test
    public void peek() throws Exception {
        Stack<String> s = new LinkedStack<>();
        s.push("test01");
        s.push("test02");
        assertEquals("test02", s.peek());
        assertEquals("test02", s.peek());
    }

    @Test
    public void empty() throws Exception {
        Stack<String> s = new LinkedStack<>();
        assertTrue(s.empty());
    }

    @Test
    public void emptyPopEmpty() throws Exception {
        Stack<String> s = new LinkedStack<>();
        s.push("test01");
        String test01 = s.pop();
        assertTrue(s.empty());
    }

    @Test
    public void popToEmpty() throws Exception {
        Stack<String> s = new LinkedStack<>();
        s.push("test01");
        assertEquals("test01", s.pop());
        assertEquals(null, s.pop());
    }

    @Test
    public void full() throws Exception {
        Stack<String> s = new LinkedStack<>();
        boolean fails = true;
        try {
            boolean test = s.full();
            fails = false;
        } catch (NotImplementedException e) {
            fails = true;
        }
        assertTrue(fails);
    }
}