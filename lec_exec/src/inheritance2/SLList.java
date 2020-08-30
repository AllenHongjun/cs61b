package inheritance2;

/**
 *
 */
public class SLList<Blorp> implements List61B<Blorp> {

    public class Node{
        public Blorp item; /*Equivalent of first*/
        public Node next; /*Equivalent of rest*/

        public Node(Blorp i, Node h){
            item = i;
            next = h;
        }
    }

    private Node sentinel;
    private int size;

    /**
     * Creates an empty list
     */

    public SLList(){
        size = 0;
        sentinel = new Node(null, null);
    }

    public SLList(Blorp x){
        size = 1;
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
    }

    /**
     * Inserts X into the back of the lsit.
     *
     * @param x
     */
    @Override
    public void addLast(Blorp x) {
        size += 1;
        Node p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        p.next = new Node(x, null);
    }

    /**
     * Returns the back node of our list.
     * @return
     */
    private Node getLastNode(){
        Node p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        return p;
    }

    /**
     * Returns the item from the back of the list.
     *
     * @return
     */
    @Override
    public Blorp getLast() {
        Node back = getLastNode();
        return back.item;
    }

    /**
     * Gets the ith item in the list(0 is the front).
     *
     * @param position
     */
    @Override
    public Blorp get(int position) {
        if (position == 0){
            return getFirst();
        }
        Node currentNode = sentinel.next.next;
        while (position > 1 && currentNode.next != null){
            position -= 1;
            currentNode = currentNode.next;
        }
        return currentNode.item;
    }

    /**
     * Returns the number of items in the list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Delets item from back of the list and
     * returns deleted item.
     */
    @Override
    public Blorp removeLast() {
        Node back = getLastNode();
        if (back == sentinel){
            return  null;
        }
        size = size - 1;
        Node p = sentinel;
        while (p.next != back){
            p = p.next;
        }
        p.next = null;
        return back.item;
    }

    /**
     * Inserts item into given position.
     * Code from discussion #3
     *
     * 感觉这种插入的方法。。可能效率不太高
     * 一定要循环找到那个位置一步一步的。
     * ？？ 留个疑问 看看有没有效率更加高的写法。。
     *
     * @param item
     * @param position
     */
    @Override
    public void insert(Blorp item, int position) {
        if(sentinel.next == null || position == 0){
            addFirst(item);
            return;
        }
        Node currentNode = sentinel.next.next;
        while (position > 1 && currentNode.next != null){
            position -= 1;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(item, currentNode.next);
        currentNode.next = newNode;
    }

    /**
     * Inserts an item at the front.
     *
     * @param x
     */
    @Override
    public void addFirst(Blorp x) {
        Node oldFrontNode = sentinel.next;
        Node newNode = new Node(x, oldFrontNode);
        sentinel.next = newNode;
        size += 1;
    }

    /**
     * Gtes an item from the front.
     */
    @Override
    public Blorp getFirst() {
        return sentinel.next.item;
    }


}
