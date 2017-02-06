package week01;

/**
 * Created by awo on 06/02/17.
 */
public class ArrayStack<E> implements Stack<E> {
    private E[] stack;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
//        this.stack = new E[DEFAULT_CAPACITY]; // TODO: Find the issue with this line
    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public void show() {

    }
}
