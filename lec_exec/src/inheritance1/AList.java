package inheritance1;

/**
 * Array based list.
 * 这些代码 看过敲过之后 都要保存记录下来。。
 * 之前敲的。。很多有用的代码 也是需要有一个记录
 * invariant 不变的   variable 变化的
 */
public class AList<Item> implements List61B<Item> {
    private Item[] items;
    private int size;

    /**
     * Creates an empty list.
     */
    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }

    /**
     * Inserts item into given positioin.
     * Code from discussion
     */
    @Override
    public void insert(Item x, int position) {
        Item[] newItems = (Item[]) new Object[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, position);
        newItems[position] = x;
        System.arraycopy(items, position, newItems, position + 1, items.length - position);
        items = newItems;
    }

    /**
     * Resizes the underlying array to the target capacity.
     * @param capacity
     */
    private void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
    }


    /**
     * Inserts an item at the front
     * @param x
     */
    @Override
    public void addFirst(Item x) {
        insert(x, 0);
    }

    @Override
    public void addLast(Item x) {
        if(size == items.length){
            resize(size + 1);
        }
        items[size] = x;
        size = size + 1;
    }

    @Override
    public Item getFirst() {
        return get(0);
    }

    @Override
    public Item getLast() {
        return items[size - 1];
    }

    @Override
    public Item get(int i) {
        return items[i];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }

//    @Override
//    public void print() {
//
//    }
}
