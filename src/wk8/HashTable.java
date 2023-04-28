package wk8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashTable<E> implements Set<E> {
    private LinkedList<E>[] table;
    private int size;
    public static int DEFAULT_TABLE_SIZE = 13;

    public HashTable() {
        this(DEFAULT_TABLE_SIZE);
    }

    public HashTable(int tableSize) {
        table = new LinkedList<>[tableSize];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object target) {
        int index = target.hashCode()%table.length;
        LinkedList<E> bucket = table[index];
        return bucket!=null && bucket.contains(target);
    }

    @Override
    public boolean add(E e) {
        int index = e.hashCode()%table.length;
        if(table[index]==null) {
            table[index] = new LinkedList<>();
        }
        LinkedList<E> bucket = table[index];
        return !bucket.contains(e) && bucket.add(e);
        // must size++ if added
    }

    @Override
    public boolean remove(Object target) {
        int index = target.hashCode()%table.length;
        LinkedList<E> bucket = table[index];
        return bucket != null && bucket.remove(target);
        // must size-- if removed
    }

    @Override
    public void clear() {
        table = new LinkedList<>[table.length];
        size = 0;
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
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

}
