package wk5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BinarySearchTree<E extends Comparable> implements Set<E> {
    private static class Node<E> {
        E value;
        Node<E> left;
        Node<E> right;

        Node(E value) {
            this(value, null, null);
        }

        public Node(E value, Node<E> left, Node<E> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private Node<E> root;

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node<E> subroot) {
        return subroot==null ? 0 : 1 + size(subroot.left) + size(subroot.right);
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object target) {
        return contains(root, target);
    }

    private boolean contains(Node<E> subroot, Object target) {
        boolean found = false;
        if(subroot != null) {
            if(subroot.value.equals(target)) {
                found = true;
            } else {
                if(subroot.value.compareTo(target)<0) {
                    found = contains(subroot.right, target);
                } else {
                    found = contains(subroot.left, target);
                }
            }
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
    public boolean add(E e) {
        boolean changed = false;
        if(isEmpty()) {
            root = new Node(e);
            changed = true;
        } else {
            changed = add(root, e);
        }
        return changed;
    }

    private boolean add(Node<E> subroot, E e) {
        boolean changed = false;
        if(!subroot.value.equals(e)) {
            if(subroot.value.compareTo(e)<0) {
                if(subroot.right==null) {
                    subroot.right = new Node(e);
                    changed = true;
                } else {
                    changed = add(subroot.right, e);
                }
            } else {
                if(subroot.left==null) {
                    subroot.left = new Node(e);
                    changed = true;
                } else {
                    changed = add(subroot.left, e);
                }
            }
        }
        return changed;
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
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
