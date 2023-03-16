package wk2;

import java.util.*;

public class LinkedList<E> implements List<E> {
    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(E value) {
            this(value, null);
        }

    }

    private Node<E> head;

    public LinkedList() {
        head = null;
    }

    @Override
    public boolean add(E e) {
        if(isEmpty()) {
            head = new Node(e);
        } else {
            Node<E> walker = head;
            while(walker.next != null) {
               walker = walker.next;
            }
            walker.next = new Node(e);
        }
        return true;
    }

    @Override
    public void add(int index, E element) {
        if(index<0 || index>size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        if(index==0) {
            head = new Node(element, head);
        } else {
            Node<E> walker = head;
            while(index>1) {
                walker = walker.next;
                --index;
            }
            walker.next = new Node(element, walker.next);
        }
    }

    @Override
    public int size() {
        int count = 0;
        Node<E> walker = head;
        while(walker!=null) {
            ++count;
            walker = walker.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public boolean contains(Object target) {
        Node<E> walker = head;
        boolean found = false;
        while(!found && walker!=null) {
            found = Objects.equals(target, walker.value);
            walker = walker.next;
        }
        return found;
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
    public void clear() {
        head = null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        Node<E> walker = head;
        while (index > 0) {
            walker = walker.next;
            --index;
        }
        E value = walker.value;
        walker.value = element;
        return value;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        E value = null;
        if(index==0) {
            value = head.value;
            head = head.next;
        } else {
            Node<E> walker = head;
            while(index>1) {
                walker = walker.next;
                --index;
            }
            value = walker.next.value;
            walker.next = walker.next.next;
        }
        return value;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
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
