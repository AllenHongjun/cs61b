package Intlist;
import java.util.Formatter;

/**
 * A naked recursive list of intergers, similar to what we saw in lecture 3,
 * but with a largee number of additional methods.
 *
 * 课程可以学习。模仿。
 * 但是项目 作业 和实验。需要自己独立去完成（可以查资料）
 */
public class IntList {

    /**
     * First elemnt of list
     */
    public int first;
    /**
     * Remaining elments of list.
     * 链表当中剩余的元素
     */
    public IntList rest;

    /**
     * A List with fist FIRST0 and rest REST0
     * @param first0
     * @param rest0
     */
    public  IntList(int first0, IntList rest0){
        first = first0;
        rest = rest0;
    }

    /**
     * A LIst with null rest, and first = 0.
     */
    public IntList(){
        /*NOTE: public IntList(){} would also work*/
        this(0,null);
    }

    /**
     * Returns a list equal to L with all elements squared.
     * Destructive.
     * 定义了一个属性 是他自身的引用。
     *
     * os. database .complier . 分布式系统 这几门课程 需要（ cs61a cs61b cs61c  的技术）
     * 计算机网络。
     * 有时间可以深入学习一下。。比如算法的理论就有1,2,3,4
     * 数据库。。某一个方面升入学习一下。
     * 软件架构的。。
     * @param L
     */
    public static void dSquareList(IntList L){
        while (L != null){
            L.first = L.first * L.first;
            L = L.rest;
        }
    }

    public static IntList squareListIterative(IntList L){
        if(L == null){
            return null;
        }
        IntList res = new IntList(L.first * L.first, null);
        IntList ptr = res;
        L = L.rest;
        while(L != null){
            ptr.rest = new IntList(L.first* L.first, null);
            L = L.rest;
            ptr = ptr.rest;
        }

        return res;
    }

    /**
     * Returns a list equal to L with all elemnts squared.
     * Non-destructive.
     * java里面的引用就有点类似于c语言里面的指针。。但是没有一个专门的变量类型 使用起来相对简单。。
     * 一个变量名指向 存放的变量值
     * 多个变量名可以指向同一个存放的变量值
     * @param L
     * @return
     */
    public  static IntList squareListRecursive(IntList L){
        if(L == null){
            return null;
        }

        return new IntList(L.first * L.first, squareListRecursive(L.rest));
    }

    /**
     * Returns a list consisting of the elements of A followd by the elemnts of B. May modify items of A. Dont't use 'new'.
     * @param A
     * @param B
     * @return
     */
    public static IntList dcatenate(IntList A, IntList B){

        //TODO: fill in method
        return null;
    }


    /**
     * Returns a  list consisting of the elemnets of a followe by the elments of B. May NOT modify items of A. Use 'new'.
     *
     * @param A
     * @param B
     * @return
     */
    public static IntList catenate(IntList A, IntList B){

        //TODO: fill in method
        return null;
    }

















}
