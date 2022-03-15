package wright;

import java.util.*;

public class LinkedList<E> implements List<E> {
    private Node<E> head;

    private static class Node<E> {
        private E value;
        private Node<E> next;

        private Node(E value) {
            this(value, null);
        }

        private Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public int size() {
        int size = 0;
        if(head!=null) {
            Node<E> walker = head;
            while(walker!=null) {
                size++;
                walker = walker.next;
            }
        }
        return size;
    }

    @Override
    public boolean add(E e) {
        if(head==null) {
            head = new Node<>(e);
        } else {
            Node<E> walker = head;
            while(walker.next!=null) {
                walker = walker.next;
            }
            walker.next = new Node<>(e);
        }
        return true;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        boolean found = false;
        Node<E> walker = head;
        while(!found && walker!=null) {
            index++;
            found = Objects.equals(o, walker.value);
            walker = walker.next;
        }
        if(!found) {
            index = -1;
        }
        return index;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
