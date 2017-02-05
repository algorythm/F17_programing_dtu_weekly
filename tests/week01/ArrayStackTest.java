package week01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by awo on 30/01/17.
 */
public class ArrayStackTest {
    @Test
    public void pushPop() throws Exception {
        Stack<String> s = new ArrayStack<>(1);
        s.push("test 01");
        assertEquals("test 01", s.pop());
    }

    @Test
    public void pushPopOverride() throws Exception {
        Stack<String> s = new ArrayStack<>(2);
        s.push("test 01");
        s.push("test 02");

        assertEquals("test 02", s.pop());
        assertEquals("test 01", s.pop());
    }

    @Test
    public void popTooMany() throws Exception {
        Stack<String> s = new ArrayStack<>(1);
        s.push("test 01");
        assertEquals("test 01", s.pop());
        assertEquals(null, s.pop());
    }

    @Test
    public void pushTooMany() throws Exception {
        Stack<String> s = new ArrayStack<>(1);
        s.push("test 01");
        s.push("test 02");
        assertEquals("test 01", s.pop());
    }

    @Test
    public void empty() throws Exception {
        Stack<String> s = new ArrayStack<>(1);
        assertTrue(s.empty());
        s.push("test");
        assertFalse(s.empty());
    }

    @Test
    public void full() throws Exception {
        Stack<String> s = new ArrayStack<>(2);
        assertFalse(s.full());
        s.push("Test 01");
        assertFalse(s.full());
        s.push("Test 02");
        assertTrue(s.full());
    }
}