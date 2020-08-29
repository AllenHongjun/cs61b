package lists3;

/**
 * An SLList is a list of intergers. which hides the terrible true
 * of the nakedness within.
 *
 * 第一个类 是只有int 类型的
 * 现在item 可以是任意的类型。。类型参数是一个 泛型参数
 */
public class SLList<LochNess> {
    private class StuffNode{
        public LochNess item;
        public StuffNode next;


        public StuffNode(LochNess i, StuffNode n) {
            this.item = i;
            this.next = next;
        }
    }

    private StuffNode  first;
    private int size;

    public SLList(LochNess x){
        first = new StuffNode(x, null);
        size = 1;
    }

    /**
     * Adds x to the front of the list.
     * @param x
     */
    public void addFirst(LochNess x){
        first = new StuffNode(x, first);
        size += 1;
    }

    /**
     * Returns the first item in the list.
     * @return
     */
    public LochNess getFirst(){
        return first.item;
    }

    /**
     * Adds an item to the end of the list.
     * @param x
     */
    public void addLast(LochNess x){
        size += 1;
        StuffNode p = first;

        while(p.next != null){
            p = p.next;
        }
        p.next = new StuffNode(x, null);

    }

    public int size(){
        return size;
    }
}



























