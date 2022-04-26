package wk8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashTable<E> implements Set<E> {
    private LinkedList<E>[] buckets;
    private int size;
    private final static int DEFAULT_CAPACITY = 10;
    private final static double LOAD_FACTOR_THRESHOLD = 0.75;

    public static void main(String[] args) {
        HashTable<String> names = new HashTable<>();
        names.add("Ben");
        names.add("Avery");
        names.add("Kali");
        names.add("Ayden");
        names.add("Priya");
        names.add("Sofia");
        names.add("Jackson");
        names.add("Kyle");
        names.add("Josh");
        names.add("Carter");
        names.add("Hunter");
        names.add("Astin");
        names.add("Jack");
        names.add("Connor");
        System.out.println(names.size());
    }

    public HashTable(int capacity) {
        buckets = new LinkedList[capacity];
        size = 0;
    }

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    private double calculateLoadFactor() {
        return (double)size/buckets.length;
    }

    private void recapacity() {
        Object[] temp = toArray();
        buckets = new LinkedList[buckets.length*2];
        size = 0;
        for(Object element : temp) {
            add((E)element);
        }
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
    public void clear() {
        // TODO: argue with each other about what is best
        buckets = new LinkedList[buckets.length];
    }

    @Override
    public boolean contains(Object target) {
        if(target==null) {
            return false;
        }

        int bucketIndex = getBucketIndex(target);
        return buckets[bucketIndex] == null ? false : buckets[bucketIndex].contains(target);
    }

    private int getBucketIndex(Object target) {
        return Math.abs(target.hashCode() % buckets.length);
    }

    @Override
    public boolean add(E element) {
        boolean changed = false;
        if(calculateLoadFactor()>LOAD_FACTOR_THRESHOLD) {
            recapacity();
        }
        int bucketIndex = getBucketIndex(element);
        if(buckets[bucketIndex]==null) {
            buckets[bucketIndex] = new LinkedList<>();
        }
        if(!buckets[bucketIndex].contains(element)) {
            buckets[bucketIndex].add(element);
            size++;
            changed = true;
        }
        return changed;
    }

    @Override
    public boolean remove(Object target) {
        boolean changed = false;
        if(target!=null) {
            int bucketIndex = getBucketIndex(target);
            if (buckets[bucketIndex] != null) {
                changed = buckets[bucketIndex].remove(target);
                if(changed) {
                    size--;
                }
            }
        }
        return changed;
    }

    @Override
    public Object[] toArray() {
        Object[] values = new Object[size];
        int index = 0;
        for(LinkedList<E> bucket : buckets) {
            if(bucket!=null) {
                for(E element : bucket) {
                    values[index++] = element;
                }
            }
        }
        return values;
    }

    @Override
    public Iterator<E> iterator() {
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
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

}
