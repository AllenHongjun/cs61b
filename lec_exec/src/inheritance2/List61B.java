package inheritance2;

public interface List61B<Item> {

    /**
     * Inserts X into the back of the lsit.
     */
    public void addLast(Item x);

    /**
     * Returns the item from the back of the list.
     * @return
     */
    public Item getLast();


    /**
     * Gets the ith item in the list(0 is the front).
     */
    public  Item get(int i);

    /**
     * Returns the number of items in the list.
     */
    public int size();

    /**
     * Delets item from back of the list and
     * returns deleted item.
     */
    public Item removeLast();

    /**
     * Inserts item into given position.
     * Code from discussion #3
     */
    public void insert(Item x, int position);

    /**
     * Inserts an item at the front.
     */
    public void addFirst(Item x);

    /**
     * Gtes an item from the front.
     */
    public Item getFirst();

    /**
     * Prints the list. Works for ANY kind of list.
     */

    default public void print(){
        for (int i = 0; i < size(); i = i + 1){
            System.out.print(get(i) + "  ");
        }
    }


}


/**
 * 1. 想过什么样生活
 * 2. 努力让自己过更好的生活
 * 3. 享受现在的生活。。
 */































