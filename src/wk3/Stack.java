package wk3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack<E> implements PureStack<E> {
    private List<E> worker;

    public Stack() {
        worker = new LinkedList<>();
    }

    @Override
    public E pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return worker.remove(worker.size()-1);
    }

    @Override
    public void push(E element) {
        {
            int i = 3;
        }
        worker.add(element);
    }

    @Override
    public E peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return worker.get(worker.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return worker.isEmpty();
    }
}
