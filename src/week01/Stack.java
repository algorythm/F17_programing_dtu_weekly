package week01;

/**
 * Created by awo on 30/01/17.
 */
public interface Stack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean empty();
    boolean full();
    void show();
}
