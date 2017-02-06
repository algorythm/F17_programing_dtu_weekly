package week01;

import java.util.Collection;

/**
 * Created by awo on 30/01/17.
 */
// TODO: Fix this class!!
public class ArrayStackOld<E> /*implements Stack<E>*/ {
    private Object[] stack;

    public ArrayStackOld(int stakSize) {
        stack = new Object[stakSize];
    }

    public ArrayStackOld(Object... o) {
        stack = o;
    }

    // Push will add an object to the end of the list, if it is possible.
//    @Override
    public void push(Object element) {
        for (int i = 0; i < stack.length; i++)
            if (!this.full() && stack[i] == null) {
                stack[i] = element; break;
            }
    }

    // This will pop out the last object of the list, and remove it from the list.
//    @Override
    public Object pop() {
        for (int i = 0; i < stack.length; i++) {
            if (!this.empty() && stack[i] == null) {
                Object result = stack[i - 1];
                stack[i -1] = null;
                return result;
            } else if (this.full()) {
                Object result = stack[stack.length - 1];
                stack[stack.length - 1] = null;
                return result;
            }
        }
        return null;
    }

    // Returns true if the list is empty
//    @Override
    public boolean empty() {
        int nullStrCount = 0;
        for (Object o : stack)
            if (o == null)
                nullStrCount++;
        return (nullStrCount == stack.length);
    }

    // Returns true is the list is full
//    @Override
    public boolean full() {
        int setStrCount = 0;
        for (Object o : stack)
            if (o != null)
                setStrCount++;
        return (setStrCount == stack.length);
    }

    // Will return the value of the toString() method of each object in the list in reverse order.
//    @Override
    public void show() {
        for (int i = stack.length - 1; i >= 0; i--)
            System.out.print(stack[i].toString() + " ");
    }
}
