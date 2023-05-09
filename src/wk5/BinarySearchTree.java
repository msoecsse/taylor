package wk5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BinarySearchTree<E extends Comparable> implements Set<E> {
    private static class Node<E> {
        E value;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        Node(E value) {
            this(value, null, null, null);
        }

        public Node(E value, Node<E> parent, Node<E> left, Node<E> right) {
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }

    private Node<E> root;

    /*
                    Z
                  /   \                    Y
                Y      d   RR on Z      /     \
              /   \         ====>      X       Z
             X     c                  / \     / \
            / \                      a   b   c   d
           a   b
     */
    public Node<E> rightRotate(Node<E> Z) {
        if(Z==null || Z.left==null) {
            throw new IllegalArgumentException("Cannot rotate right on that argument.");
        }
        Node<E> Y = Z.left;
        Node<E> c = Y.right;
        Node<E> parent = Z.parent;
        Z.left = c;
        if(c!=null) {
            c.parent = Z;
        }
        Y.right = Z;
        Z.parent = Y;
        Y.parent = parent;
        if(parent!=null) {
            if(parent.right==Z) {
                parent.right = Y;
            } else {
                parent.left = Y;
            }
        }
        return Y;
    }

    public int height() {
        return height(root);
    }

    private int height(Node<E> subroot) {
        return subroot==null ? 0 : 1 + Math.max(height(subroot.right), height(subroot.left));
    }

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
    public void clear() {

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
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

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public Node<E> rotateRightDeMastri(Node<E> Z) {
        if(Z==null || Z.left==null) {
            throw new IllegalArgumentException("Can't rotate null node or node with null left child");
        }
        Node<E> Y = Z.left;
        Node<E> X = Y.left;
        Node<E> c = Y.right;
        Node<E> parent = Z.parent;
        return null;
    }
}
