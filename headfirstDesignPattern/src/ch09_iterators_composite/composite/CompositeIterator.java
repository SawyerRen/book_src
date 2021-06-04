package ch09_iterators_composite.composite;

import ch09_iterators_composite.iterator.Iterator;

import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) return false;
        Iterator iterator = stack.peek();
        if (iterator.hasNext()) return true;
        stack.pop();
        return hasNext();
    }

    @Override
    public Object next() {
        if (!hasNext()) return null;
        Iterator iterator = stack.peek();
        MenuComponent next = (MenuComponent) iterator.next();
        if (next instanceof Menu) {
            stack.push(next.createIterator());
        }
        return next;
    }
}
