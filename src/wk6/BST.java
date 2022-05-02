package wk6;

import java.util.*;
import java.util.function.Consumer;

public class BST<E extends Comparable<? super E>> implements Set<E> {
    private static class Node<E extends Comparable<? super E>> {
        E value;
        Node<E> parent;
        Node<E> rKid;
        Node<E> lKid;

        Node(E value) {
            this(value, null, null, null);
        }

        Node(E value, Node<E> parent) {
            this(value, parent, null, null);
        }

        Node(E value, Node<E> parent, Node<E> lKid, Node<E> rKid) {
            this.value = value;
            this.parent = parent;
            this.rKid = rKid;
            this.lKid = lKid;
        }
    }

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.leftRotate(tree.root.rKid);
        System.out.println(tree);
    }

    private Node<E> root;

    public BST() {
        root = null;
    }


    public List<E> expPostOrder() {
        final List<E> list = new LinkedList<>();
        Consumer<E> add = e -> list.add(e);
        postOrder(root, add);
        return list;
    }

    private void postOrder(Node<E> subroot, Consumer<E> consumer) {
        if(subroot!=null) {
            postOrder(subroot.lKid, consumer);
            postOrder(subroot.rKid, consumer);
            consumer.accept(subroot.value);
        }
    }

    public BST<E> clone() {
        final BST<E> bst = new BST<>();
        Consumer<E> add = e -> bst.add(e);
        preOrder(root, add);
        return bst;
    }

    private void preOrder(Node<E> subroot, Consumer<E> consumer) {
        if(subroot!=null) {
            consumer.accept(subroot.value);
            preOrder(subroot.lKid, consumer);
            preOrder(subroot.rKid, consumer);
        }
    }

    public void printInOrder() {
        Consumer<E> print = e -> System.out.println(e);
        inOrder(root, print);
    }

    public List<E> getSortedList() {
        final List<E> list = new LinkedList<>();
        Consumer<E> add = e -> list.add(e);
        inOrder(root, add);
        return list;
    }

    private void inOrder(Node<E> subroot, Consumer<E> consumer) {
        if(subroot!=null) {
            inOrder(subroot.lKid, consumer);
            consumer.accept(subroot.value);
            inOrder(subroot.rKid, consumer);
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
                    subroot.rKid = new Node<>(element, subroot);
                    changed = true;
                } else {
                    changed = add(subroot.rKid, element);
                }
            } else {
                if(subroot.lKid==null) {
                    subroot.lKid = new Node<>(element, subroot);
                    changed = true;
                } else {
                    changed = add(subroot.lKid, element);
                }
            }
        }
        return changed;
    }

    /*
              P                            P <--
              |                            |
              B                            A <--
            /   \                        /   \
          A      C      <-------        w     B <--
         / \    / \     LR on A              / \
        w  x   y  z                     --> x    C
                                                / \
                                               y   z
     */
    private Node<E> leftRotate(Node<E> A) {
        if(A==null || A.rKid == null) {
            throw new IllegalArgumentException("Can't rotate without node and its right child.");
        }
        Node<E> B = A.rKid;
        Node<E> x = B.lKid;
        Node<E> P = A.parent;
        A.parent = B;
        A.rKid = x;
        if(x != null) {
            x.parent = A;
        }
        B.parent = P;
        if(P == null) {
            root = B;
        } else {
            if(P.lKid == A) {
                P.lKid= B;
            } else {
                P.rKid = B;
            }
        }
        B.lKid = A;
        return B;
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
