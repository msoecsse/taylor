package wk3;

public interface PureStack<E> {
    E pop();
    void push(E element);
    E peek();
    boolean isEmpty();
}
