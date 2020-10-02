import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * ArrayDeque
 * implemented in circular way  循环定义
 */
public class ArrayDeque<T> {

    private T[] items;
    private int nextFirst;
    private int nextLast;
    private int size;

    /**
     * Create an empty ArrayDeque
     */
    public ArrayDeque(){
        // Java does not all to create new generic array directly. So need cast.
        items = (T[]) new Object[8];
        nextFirst = 0;
        nextLast = 1;
        size = 0;
    }

    /**
     * Return true if deque is full, false otherwise.
     * @return
     */
    private boolean isFull(){
        return size == items.length;
    }

    /**
     * Whether to downsize the deque.  稀疏矩阵，在数值分析中，是其元素大部分为零的矩阵。反之，如果大部分元素都非零，则这个矩阵是稠密的
     * @return
     */
    private boolean isSparse(){
        return items.length >= 16 && size < (items.length / 4);
    }

    /**
     * Minus one circularly
     *
     * 余数 remainder
     * 在算术中，当两个整数相除的结果不能以整数商表示时，余数便是其“余留下的量”。当余数为零时，被称为整除
     *
     * 模除 (Modulo operation)
     * 模除得到的是一个数除以另一个数的余数。 给定两个正整数：被除数 a 和除数n，a modulo n 得到的是使用欧几里德除法时 a/n 的余数。
     * @param index
     * @return
     */
    private int plusOne(int index){
        return (index + 1) % items.length;
    }

    private int minusOne(int index){

        /**
         * unlike Python
         * Math.floorMod(x, y)
         */
        return (index - 1 + items.length) % items.length;
    }

    private void resize(int capacity){
        T[] newDeque = (T[]) new Object[capacity];
        int oldIndex = plusOne(nextFirst); // the index of the first item in orignal deque
        for (int newIndex = 0; newIndex < size; newIndex++){
            newDeque[newIndex] = items[oldIndex];
            oldIndex = plusOne((oldIndex));
        }
        items = newDeque;
        nextFirst = capacity - 1; // since the new deque is start from true 0 index
        nextLast = size;
    }

    private void upSize(){
        resize(size * 2);
    }

    private void downSize(){
        resize(items.length / 2);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    /**
     * Print the items in the deque from first to last, separated by a space.
     * Once all the items have been printed, print out a new line.
     */
    public void printDeque(){
        for (int i = plusOne(nextFirst); i != nextLast; i = plusOne(i)){
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public void addFirst(T x){
        if (isFull()){
            upSize();
        }
        items[nextFirst] = x;
        nextFirst = minusOne(nextFirst);
        size += 1;
    }

    public void addLast(T x){
        if (isFull()){
            upSize();
        }
        items[nextLast] = x;
        nextLast = plusOne(nextLast);
        size += 1;
    }


    /**
     * Remove and return the item at the front of the deque.
     * If no such item exist, return null.
     */
    public T removeFirst() {
        if (isSparse()) {
            downSize();
        }
        nextFirst = plusOne(nextFirst);
        T toRemove = items[nextFirst];
        items[nextFirst] = null;
        if (!isEmpty()) {
            size -= 1;
        }
        return toRemove;
    }

    /**
     * Remove and return the item at the back oc the deque.
     * If no such item exist, return null.
     */
    public T removeLast() {
        if (isSparse()) {
            downSize();
        }
        nextLast = minusOne(nextLast);
        T toRemove = items[nextLast];
        items[nextLast] = null;
        if (!isEmpty()) {
            size -= 1;
        }
        return toRemove;
    }

    /**
     * Get the item at the given index, where 0 is the front,
     * 1 is the next item, and so forth. If no such item exists,
     * returns null. Must not alter the deque.
     */
    public T get(int index) {
        if (index >= size) {
            return null;
        }
        int start = plusOne(nextFirst);
        return items[(start + index) % items.length];
    }

    /**
     * Create a deep copy of other.
     */
    public ArrayDeque(ArrayDeque other) {
        items = (T[]) new Object[other.size];
        nextFirst = other.nextFirst;
        nextLast = other.nextLast;
        size = other.size;

        System.arraycopy(other.items, 0, items, 0, other.size);
    }

}


































