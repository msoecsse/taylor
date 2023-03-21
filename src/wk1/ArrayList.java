package wk1;

import java.util.*;

public class ArrayList<E> implements List<E> {
    private E[] data;

    public ArrayList() {
        data = (E[])new Object[0];
    }

    @Override
    public boolean add(E e) {
        E[] biggerArray = (E[])new Object[data.length+1];
        for(int i=0; i<size(); i++) {
            biggerArray[i] = data[i];
        }
        biggerArray[size()] = e;
        data = biggerArray;
        return true;
    }

    @Override
    public String toString() {
        return "" + data.length;
    }

    @Override
    public void add(int index, E element) {
        // Potential quiz question
    }

    @Override
    public void clear() {
        data = (E[])new Object[0];
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
    public boolean contains(Object o) {
        boolean foundIt = false;
        for(int i=0; !foundIt && i<size(); i++) {
            foundIt = Objects.equals(data[i], o);
        }
        return foundIt;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        E previousValue = data[index];
        data[index] = element;
        return previousValue;
    }

    @Override
    public E remove(int index) {
        E removedElement = get(index);
        E[] smallerArray = (E[])new Object[size()-1];
        for(int i=0; i<index; i++) {
            smallerArray[i] = data[i];
        }
        for(int i=index+1; i<size(); i++) {
            smallerArray[i-1] = data[i];
        }
        data = smallerArray;
        return removedElement;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E> {
        private int nextElement = 0;

        @Override
        public boolean hasNext() {
            return nextElement<size();
        }

        @Override
        public E next() {
            return data[nextElement++];
        }
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
