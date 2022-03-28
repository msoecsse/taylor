package wk3;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<E> implements PureQueue<E> {
    private List<E> worker;

    public Queue() {
        worker = new LinkedList<>();
    }

    @Override
    public E dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return worker.remove(0);
    }

    @Override
    public void enqueue(E element) {
        worker.add(element);
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return worker.get(0);
    }

    @Override
    public boolean isEmpty() {
        return worker.isEmpty();
    }
}
