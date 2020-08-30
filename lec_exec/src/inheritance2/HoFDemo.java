package inheritance2;

/**
 * Demostrates highter order functions in Java.
 */
public class HoFDemo {
    // 每一个类都可以有 main 方法。
    // 分布式系统 的资料更加的丰富。。
//

    /**
     * 对象 是接口的类型 传递进入一个方法。。然后调用这个对象的方法。。
     * @param f
     * @param x
     * @return
     */
    public static int do_twice(IntUnaryFunction f, int x){
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        IntUnaryFunction tenX = new TenX();
        System.out.println(do_twice(tenX, 2));
    }

}
