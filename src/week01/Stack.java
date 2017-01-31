package week01;

/**
 * Created by awo on 30/01/17.
 */
public interface Stack<T> {
    void push(T t);
    T pop();
    boolean empty();
    boolean full();
    void show();
}
