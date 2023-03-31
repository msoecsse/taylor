package wk4;

import java.util.LinkedList;

public class Queue<E> implements PureQueue<E> {
    private LinkedList<E> workhorse;

    public Queue() {
        workhorse = new LinkedList<>();
    }

    @Override
    public boolean offer(E element) {
        if(element==null) {
            throw new NullPointerException();
        }
        return workhorse.offer(element);
    }

    @Override
    public E poll() {
        return workhorse.poll();
    }

    @Override
    public E peek() {
        return workhorse.peek();
    }
}
