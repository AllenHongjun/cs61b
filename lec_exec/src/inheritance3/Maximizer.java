package inheritance3;

public class Maximizer {

    public  static Comparable max(Comparable[] items){
        int maxDex = 0;
        /**
         * 循环比较数组当中的每一个元素
         * 找出最大的哪个袁术。。一开始假设第0个元素是最大的
         * 每次比较后。。把大哪个元素的下标记录下来。。
         */
        for (int i = 0; i < items.length; i += 1){
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0){
                maxDex = i;
            }
        }

        return items[maxDex];
    }
}
