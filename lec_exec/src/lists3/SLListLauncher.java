package lists3;

public class SLListLauncher {
    public static void main(String[] args) {

        // 之前是只知道 调用 addFirst这个方法。。现在只是 addFirst方法里面是如何实现的。
        SLList<String> s1 = new SLList<>("bone");
        s1.addFirst("thugs");
        s1.addFirst("time");
        s1.addFirst("jim");
    }
}
