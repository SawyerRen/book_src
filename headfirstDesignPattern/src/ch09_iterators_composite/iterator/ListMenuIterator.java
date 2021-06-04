package ch09_iterators_composite.iterator;

import java.util.List;

public class ListMenuIterator implements Iterator{
    List<MenuItem> items;
    int index;

    public ListMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public Object next() {
        return items.get(index++);
    }
}
