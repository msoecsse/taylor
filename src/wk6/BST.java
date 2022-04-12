package wk6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class BST<E extends Comparable<? super E>> implements Set<E> {
    private static class Node<E extends Comparable<? super E>> {
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

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.add(3);
        tree.add(1);
        tree.add(4);
        tree.add(2);
        tree.add(5);
        tree.inOrder();
        System.out.println(tree.contains(-5));
    }

    private Node<E> root;

    public BST() {
        root = null;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node<E> subroot) {
        if(subroot!=null) {
            inOrder(subroot.lKid);
            System.out.println(subroot.value);
            inOrder(subroot.rKid);
        }
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void clear() {
        root = null;
    }

    public int height() {
        return height(root);
    }

    private int height(Node<E> subroot) {
        return subroot==null ? -1
                :
                1 + Math.max(height(subroot.lKid), height(subroot.rKid));
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
        return target instanceof Comparable<?> && contains(root, (E) target);
    }

    private boolean contains(Node<E> subroot, E target) {
        boolean found = false;
        if(subroot!=null) {
            found = Objects.equals(subroot.value, target);
            if(!found) {
                if(subroot.value.compareTo(target)<0) {
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
            root = new Node<>(element);
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
                    subroot.rKid = new Node<>(element);
                    changed = true;
                } else {
                    changed = add(subroot.rKid, element);
                }
            } else {
                if(subroot.lKid==null) {
                    subroot.lKid = new Node<>(element);
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
