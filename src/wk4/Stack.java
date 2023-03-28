package wk4;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> implements PureStack<E> {
    private List<E> workhorse;

    public Stack() {
        this(new ArrayList<>());
    }

    public Stack(List<E> emptyList) {
        workhorse = emptyList;
        workhorse.clear();
    }

    public boolean push(E element) {
        return workhorse.add(element);
    }

    public E pop() {
        return workhorse.remove(workhorse.size()-1);
    }

    public E peek() {
        return workhorse.get(workhorse.size()-1);
    }
}
