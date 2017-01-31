package week01;

import java.util.Collection;

/**
 * Created by awo on 30/01/17.
 */
public class ArrayStack<T> implements Stack {
    private Object[] stack;

    public ArrayStack(int stakSize) {
        stack = new String[stakSize];
    }

    public ArrayStack(Object... o) {
        stack = o;
    }

    @Override
    public void push(Object o) {
        for (int i = 0; i < stack.length; i++)
            if (!this.full() && stack[i] == null) {
                stack[i] = o; return;
            }
    }

    @Override
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

    @Override
    public boolean empty() {
        int nullStrCount = 0;
        for (Object o : stack)
            if (o == null)
                nullStrCount++;
        return (nullStrCount == stack.length);
    }

    @Override
    public boolean full() {
        int setStrCount = 0;
        for (Object o : stack)
            if (o != null)
                setStrCount++;
        return (setStrCount == stack.length);
    }

    @Override
    public void show() {
        for (int i = stack.length - 1; i >= 0; i--)
            System.out.print(stack[i].toString() + " ");
    }
}
