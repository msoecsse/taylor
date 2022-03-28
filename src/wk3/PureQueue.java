package wk3;

public interface PureQueue<E> {
    E dequeue();
    void enqueue(E element);
    E peek();
    boolean isEmpty();
}
