package ch09_iterators_composite.iterator;

public class ArrayMenuIterator implements Iterator{
    MenuItem[] items;
    int pos = 0;

    public ArrayMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }

    @Override
    public Object next() {
        return items[pos++];
    }
}
