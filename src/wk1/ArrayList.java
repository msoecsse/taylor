package wk1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<E> implements List<E> {

    private Object[] data;

    public ArrayList() {
        data = new Object[0];
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean add(E e) {
        Object[] temp = new Object[size()+1];
        for(int i=0; i<size(); i++) {
            temp[i] = data[i];
        }
        temp[temp.length-1] = e;
        data = temp;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Haven't done this yet");

    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Haven't done this yet");

    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Haven't done this yet");
    }
}
