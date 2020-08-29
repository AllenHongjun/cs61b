package lists1;

import edu.princeton.cs.algs4.In;

public class IntList {
    public int first;
    public IntList rest;

    /**
     * 引用关系就相当于是一个指针。。
     * 引用对象的赋值。。就相当于。。这个变量指向的是哪一个变量。。
     * @param f
     * @param r
     */
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    /**
     * Return the size of the list using... recursion!
     * @return
     */
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * Return the size of the list using no recursion!
     * @return
     */
    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while (p != null){
            totalSize += 1;
            p = p.rest;
        }
        return  totalSize;
    }

    /**
     * 递归链表回去第哪一个元素
     * @param i
     * @return
     */
    public int get(int i){
        if(i == 0){
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println(L.get(2));
    }
}






















