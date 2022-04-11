package wk6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class BST<E extends Comparable<E>> implements Set<E> {
    private static class Node<E extends Comparable<E>> {
        E value;
        Node<E> rKid;
        Node<E> lKid;

        Node(E value) {
            this(value, null, null);
        }

        Node(E value, Node<E> rKid, Node<E> lKid) {
            this.value = value;
            this.rKid = rKid;
            this.lKid = lKid;
        }
    }

    private Node<E> root;

    public BST() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node<E> subroot) {
        int size = 0;
        if(subroot!=null) {
            size = 1 + size(subroot.rKid) + size(subroot.lKid);
        }
        return size;
    }

    @Override
    public boolean contains(Object target) {
        // TODO Don't do this... should figure out how to cast safely instead
        E targ = null;
        try {
            targ = (E) target;
        } catch (ClassCastException e) {
            return false;
        }
        return contains(root, targ);
    }

    private boolean contains(Node<E> subroot, E target) {
        boolean found = false;
        E targ = null;
        targ = (E)target;
        if(subroot!=null) {
            found = Objects.equals(subroot.value, target);
            if(!found) {
                if(subroot.value.compareTo(targ)<0) {
                    found = contains(subroot.rKid, target);
                } else {
                    found = contains(subroot.lKid, target);
                }
            }
        }
        return found;
    }

    @Override
    public boolean add(E element) {
        if(element==null) {
            throw new IllegalArgumentException("Nulls not allowed here.");
        }
        boolean changed = false;
        if(root==null) {
            root = new Node(element);
            changed = true;
        } else {
            changed = add(root, element);
        }
        return changed;
    }

    private boolean add(Node<E> subroot, E element) {
        boolean changed = false;
        if(!Objects.equals(subroot.value, element)) {
            if(subroot.value.compareTo(element)<0) {
                if(subroot.rKid==null) {
                    subroot.rKid = new Node(element);
                    changed = true;
                } else {
                    changed = add(subroot.rKid, element);
                }
            } else {
                if(subroot.lKid==null) {
                    subroot.lKid = new Node(element);
                    changed = true;
                } else {
                    changed = add(subroot.lKid, element);
                }
            }
        }
        return changed;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("homework");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("homework");
    }

}
