package inheritance3;


/**
 * dotnet 平台就是什么要用的东西
 * 都给你实现好了。
 * 不需要去管怎么实现。。
 * 有好处 也有不好。。
 *
 *
 * java调试的时候 如何不单步骤调试进入不是自己写的代码
 *
 *
 */
public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("Sture", 9);
        Dog d3 = new Dog("Benjamin", 15);
        Dog[] dogs = new Dog[]{d1, d2, d3};

        Dog d = (Dog) Maximizer.max(dogs);
        System.out.println(d.name);
    }
}
