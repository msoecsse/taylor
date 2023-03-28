package wk4;

public interface PureStack<E> {
    boolean push(E element);
    E pop();
    E peek();
}
