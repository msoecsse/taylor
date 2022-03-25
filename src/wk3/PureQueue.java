package wk3;

public interface PureQueue<E> {
    E poll();
    void offer(E element);
    E peek();
    boolean isEmpty();
}
