package wk2;

import java.util.*;

public class LinkedList<E> implements List<E> {
    private Node<E> head;
    private Node<E> tail;

    public static void main(String[] args) {
        List<String> words = null;
        for(int i=0; i< words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        Node(E value) {
            this(value, null);
        }
    }

    public LinkedList() {
        head = null;
    }

    @Override
    public E remove(int index) {
        if(index<0 || index>=size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " invalid for size: " + size());
        }
        E removed = null;
        if(index==0) {
            removed = head.value;
            head = head.next;
            if(head==null) {
                tail = null;
            }
        } else {
            Node<E> walker = head;
            for(int i=0; i<index-1; i++) {
                walker = walker.next;
            }
            removed = walker.next.value;
            walker.next = walker.next.next;
            if(walker.next==null) {
                tail = walker;
            }
        }
        return removed;
    }

    @Override
    public int size() {
        int size = 0;
        Node<E> walker = head;
        while(walker!=null) {
            size++;
            walker = walker.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public boolean add(E e) {
        if(isEmpty()) {
            head = new Node<>(e);
            tail = head;
        } else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o)>=0;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if(index>=0) {
            remove(index);
        }
        return index>=0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    private Node<E> walkTo(int index) {
        if(index<0 || index>=size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " invalid for size: " + size());
        }
        Node<E> walker = head;
        for(int i=0; i<index; i++) {
            walker = walker.next;
        }
        return walker;
    }

    @Override
    public E get(int index) {
        return walkTo(index).value;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = walkTo(index);
        E replaced = node.value;
        node.value = element;
        return replaced;
    }

    @Override
    public void add(int index, E element) {
        if(index==0) {
            head = new Node<>(element, head);
            if(tail==null) {
                tail = head;
            }
        } else {
            Node<E> before = walkTo(index-1);
            before.next = new Node<>(element, before.next);
            tail = tail.next;
        }
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
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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
