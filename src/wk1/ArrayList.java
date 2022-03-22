package wk1;

import java.util.*;

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
        boolean found = false;
        for(int i=0; !found && i<size(); i++) {
            found = Objects.equals(data[i], o);
        }
        return found;
    }

    private class ArrayListIterator implements Iterator<E> {
        private int index = 0;
        private boolean removable = false;

        @Override
        public boolean hasNext() {
            return index<size();
        }

        @Override
        public E next() {
            removable = true;
            return (E)data[index++];
        }

        @Override
        public void remove() {
            if(!removable) {
                throw new IllegalStateException("Cannot remove right now, so sorry.");
            }
            removable = false;
            ArrayList.this.remove(--index);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
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
        int index = indexOf(o);
        if(index>=0) {
            remove(index);
        }
        return index>=0;
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
        data = new Object[0];
    }

    @Override
    public E get(int index) {
        return (E)data[index];
    }

    @Override
    public E set(int index, E element) {
        E replaced = (E)data[index];
        data[index] = element;
        return replaced;
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Haven't done this yet");

    }

    @Override
    public E remove(int index) {
        if(index<0 || index>=size()) {
            throw new IndexOutOfBoundsException("Invalid index of " + index + " when size of " + size());
        }
        Object[] temp = new Object[size()-1];
        for(int i=0; i<index; i++) {
            temp[i] = data[i];
        }
        for(int i=index+1; i<size(); i++) {
            temp[i-1] = data[i];
        }
        E removed = (E)data[index];
        data = temp;
        return removed;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for(int i=0; index==-1 && i<size(); i++) {
            if(Objects.equals(data[i], o)) {
                index = i;
            }
        }
        return index;
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
