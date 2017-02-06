//package week01;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Created by awo on 30/01/17.
// */
//public class ArrayStackTest {
//    @Test
//    public void pushPop() throws Exception {
//        Stack<String> s = new ArrayStackOld<>(1);
//        s.push("test01");
//        assertEquals("test01", s.pop());
//    }
//
//    @Test
//    public void pushPopMultiple() throws Exception {
//        Stack<String> s = new ArrayStackOld<>(2);
//        s.push("test01");
//        s.push("test02");
//
//        assertEquals("test02", s.pop());
//        assertEquals("test01", s.pop());
//    }
//
//    @Test
//    public void popTooMany() throws Exception {
//        Stack<String> s = new ArrayStackOld<>(1);
//        s.push("test01");
//        assertEquals("test01", s.pop());
//        assertEquals(null, s.pop());
//    }
//
//    @Test
//    public void pushTooMany() throws Exception {
//        Stack<String> s = new ArrayStackOld<>(1);
//        s.push("test01");
//        s.push("test02");
//        assertEquals("test01", s.pop());
//    }
//
//    @Test
//    public void empty() throws Exception {
//        Stack<String> s = new ArrayStackOld<>(1);
//        assertTrue(s.empty());
//        s.push("test");
//        assertFalse(s.empty());
//    }
//
//    @Test
//    public void full() throws Exception {
//        Stack<String> s = new ArrayStackOld<>(2);
//        assertFalse(s.full());
//        s.push("test01");
//        assertFalse(s.full());
//        s.push("test02");
//        assertTrue(s.full());
//    }
//}