package wk4;

public interface PureQueue<E> {
    boolean offer(E element);
    E poll();
    E peek();
}
