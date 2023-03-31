package wk4;

import java.util.Queue;

public class CircularQueue<E> implements PureQueue<E> {
    private E[] buffer;
    private int frontIndex;
    private int backIndex;
    private boolean isFull;
    private static final int DEFAULT_CAPACITY = 4;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity) {
        buffer = (E[])new Object[capacity];
        isFull = capacity == 0;
        frontIndex = 0;
        backIndex = 0;
    }

    @Override
    public boolean offer(E element) {
        element.hashCode();
        boolean added = false;
        if(!isFull) {
            buffer[backIndex] = element;
            backIndex = (backIndex+1)%buffer.length;
            added = true;
            isFull = backIndex == frontIndex;
        }
        return added;
    }

    @Override
    public E poll() {
        E returnValue = null;
        if(isFull || frontIndex!=backIndex) {
            returnValue = buffer[frontIndex];
            buffer[frontIndex] = null;
            frontIndex = (frontIndex+1)%buffer.length;
            isFull = false;
        }
        return returnValue;
    }

    @Override
    public E peek() {
        return (!isFull && frontIndex==backIndex) ? null : buffer[frontIndex];
    }
}






