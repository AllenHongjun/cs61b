import sun.awt.image.ImageWatched;

/**
 * LinkedListDeque
 * @param <T>
 */
public class LinkedListDeque<T> {
    private class TNode{
        private T item;
        private TNode prev;
        private TNode next;

        /**
         * 初始化一个节点。节点的类型是一个泛型 可以可以是 int string object course person dog
         *网速慢。 开发环境用的也不太爽。。这个搜狗输入法也有不过 相当于 节点 是有一个链条一样。。没一个节点都可以指向 下一个节点。
         * 一直到指向的最后一个节点是null
         * 也可以指向前面的节点。。可以一直指向到哨兵那个节点。。。  TNode 存放一个类型的变量 可以比较的灵活。。
         * LinkedListDeque 这个对象 里面有处理 List的方法。。
         * @param x
         * @param p 存放对上一个节点的引用 可以理解位C语言里面的指针 这个是一个引用类型的变量 相当于 这个和 上一个节点其实是同样的东西
         * @param n
         */
        private TNode(T x, TNode p, TNode n){
            item = x;
            prev = p;
            next = n;
        }
    }

    /**
     * The first item (if it exists) int the deque is the sentinel.next
     */
    private TNode sentinel;

    private int size;

    /**
     * Create an empty deque  double enable quene  deck
     */
    public LinkedListDeque(){
        sentinel = new TNode(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    /**
     * Return the number of the items in the deque
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * Return true if deque is empty, false otherwise
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(T item){
        // 不能所有的步骤都是按照书上说的来做。。没有那么多的时间
        // 也没有专门一个些老师来教你。。重点是按照自己的学习方法。。来掌握和学习自己需要的那些知识
        // 我可以吧 project hw 当做是 实例代码来看。。需要练习的时候。。另外再去做。。
        // 关键 sentinel 是被第一个节点指向的。。第一个节点 的下一个节点 其实是 为null的
        // 创建第一个节点的时候。。注意 为 prev item next 节点都要赋值正确
        sentinel.next = new TNode(item, sentinel, sentinel.next);
        // 为第二个节点的 prev 属性 赋值 指向 第一个节点。。 这种写法 感觉 有点low
        sentinel.next.next.prev = sentinel.next;
        size += 1;
    }

    public void addLast(T item){
        // sentinel.prev 指向的是链表的最后一个节点。
        // last.next 指向的是 sentinel 这个节点 slide-lec5-19的ppt图片中有对double linked lists 的图示比较清楚
        sentinel.prev = new TNode(item, sentinel.prev, sentinel);
        sentinel.prev.prev.next = sentinel.prev;
        size += 1;
    }

    /**
     * Remove and return the item at the front of the deque
     * If no such item exists. return null
     * @return
     */
    public T removeFirst(){
        T toRemove = sentinel.next.item;
        // 前面的. 一直都是在找需要的对象。。最后一个点出来的一个一个属性 或者是 对象。。看情况给他赋值
        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
        if (!isEmpty()){
            size -= 1;
        }
        return toRemove;
    }

    /**
     * Remove  and return the item at the back of the deque
     * If no such item exists , return null
     * @return
     */
    public T removeLast(){
        // 自学的需要自己去看图示。看文字。一点点的理解 。。效率相对而言有点繁琐
        // 找打最后一个节点
        T toRemove = sentinel.prev.item;
        // 将倒数第二个节点的next属性指向 哨兵节点
        sentinel.prev.prev.next = sentinel;
        //将哨兵的prev属性指向倒数第二个节点。也就是移除了最后一个节点之后的当前最后一个节点
        sentinel.prev = sentinel.prev.prev;
        if (!isEmpty()){
            size -= 1;
        }
        // 重点 这些都是别人走过的路。。别人能够学会。你也是能够学会的。。
        // 你所有遇到过的问题。。别人也都遇到过。。不用气馁
        return toRemove;
    }

    /**
     * 源码 文档 开发工具 调试。 敲一遍。理解一遍。。自己写一遍
     * Print the items in the deque from first to last, separated by a space
     * Once all the items have been printed, print out a new line
     */
    public void printDeque(){
        TNode toPrint = sentinel.next;
        for (int i = 0; i < size; i++){
            System.out.print(toPrint.item + "");
            toPrint = toPrint.next;
        }
        System.out.println();
    }

    /**
     * Get the item at the given index, where 0 is the front,
     * 1 is the next item, and so forth, I fno such item exists,
     * return null, Must not alter the deque
     * 现在这些方法是最简单的实现。。但是肯定不是最完美的方法。。有些性能和效率不太高。
     * 但是有助于理解基础的算法和数据结构。。
     * @param index
     * @return
     */
    public T get(int index){
        TNode toGet = sentinel.next;
        for (int i = 0; i < index; i++){
            toGet = toGet.next;
        }
        return  toGet.item;
    }

    /**
     * 理解递归 不要每一步 一步的都去想。。要相信 递归方法的运行。。和 递归的出口在哪里。。能够理解
     * @param index
     * @param curr
     * @return
     */
    private T getRecursive(int index, TNode curr){
        if (index == 0){
            return curr.item;
        }
        return getRecursive(index - 1, curr.next);
    }

    public T getRecursive(int index){
        return getRecursive(index, sentinel.next);
    }


    /**
     * Create a deep copy of other
     * this funciton is a bit of trick, do not think to much about it..
     *
     * @param other
     */
    public LinkedListDeque(LinkedListDeque other){
        sentinel = new TNode(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;

        for (int i = 0; i < other.size(); i++){
            addLast((T) other.get(i)); // (T) is cast, sice type of other is unknown
        }
    }







}

































