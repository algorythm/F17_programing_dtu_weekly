package week01;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Created by awo on 30/01/17.
 */
public class LinkedStack<E> implements Stack<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public LinkedStack() {}

    private void linkFirst(E e) {
        final Node<E> first = this.first;
        final Node<E> newNode = new Node<>(null, e, first);
        this.first = newNode;

        if (first == null) this.last = newNode;
        else               first.next = newNode;

        size++;
    }

    private void linkLast(E e) {
        final Node<E> last = this.last;
        final Node<E> newNode = new Node<>(last, e, null);
        this.last = newNode;
        if (last == null) this.first = newNode;
        else              last.next = newNode;

        size++;
    }

    private E unlinkLast(Node<E> last) {
        final E element = last.item;
        final Node<E> prev = last.prev;
        last.item = null;
        last.prev = null;
        if (prev == null)
            this.first = null;
        else
            prev.next = null;
        size--;
        return element;
    }

    @Override
    public void push(E e) {
        if (this.size == 0 && this.first == null)
            linkFirst(e);
        else
            linkLast(e);
    }

    @Override
    public E pop() {
        final Node<E> last = this.last;
        return (last == null) ? null : unlinkLast(last);
    }

    @Override
    public E peek() {
        final Node<E> first = this.first;
        return (first == null) ? null : first.item;
    }

    @Override
    public boolean empty() {
        return this.size == 0;
    }

    @Override
    public boolean full() {
        throw new NotImplementedException();
    }

    @Override
    public void show() {
        for (Node<E> x = this.first; x != null; x = x.next) {
            System.out.println(x.item.toString());
        }
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
