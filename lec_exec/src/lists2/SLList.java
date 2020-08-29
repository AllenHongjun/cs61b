package lists2;

/**
 * An SLList is a list of intergers. which hides the terrible true
 * of the nakeness within
 */
public class SLList {
    private static class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
            System.out.println(size);
        }
    }

    /**
     * The first item(if it exists) is at sentinel.next
     * sentinel 哨兵。。第一个。。
     * 这个vitualizer 真的是学习数据结构的好东西呀。。
     * 这样的 链表。。图 树 的数据结构就能形象haul的 很好理解了。
     * 注意 对象的赋值。其实全部都是 说 这个变量名称 指向的是哪个对象。
     * 指针变量。。指向的是哪个变量（可以看做是一个对象。）
     */
    private IntNode sentinel;
    private static int size;

    private static void lectureQuestion(){
        SLList L = new SLList();
        //IntNode n = IntNode(5, null);
    }

    /**
     * Creates an empty SLList.
     */
    public SLList(){
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x){
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    /**
     * Returns the first item in the list.
     * @return
     */
    public int getFirst(){
        return sentinel.next.item;
    }

    /**
     * Adds x to the end of the list.
     * @param x
     */
    public void addLast(int x){
        size = size + 1;
        IntNode p = sentinel;

        /*Advance p to the end of the list.*/
        while (p.next != null){
            p = p. next;
        }
        p.next = new IntNode(x, null);
    }


    /*Returns the size of the list.
    * 比较关键的就是这个引用关系的理解
    * */
    public int size(){
        return size;
    }

    public static void main(String[] args){
        // Creates a list of one integer, namely 10
        SLList L = new SLList();
        L.addLast(20);
        L.addLast(25);
        L.addLast(35);
        System.out.println(L.size());
    }













}
