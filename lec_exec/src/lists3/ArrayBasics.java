package lists3;

/*
* 人工智能应用
* 智能化
* 自动化的应用
* 灵活的写代码
* 智能提示
* 自动补全。。
* 代码片段。。
* 代码生成器。。
*
* */

public class ArrayBasics {
    public static void main(String[] args) {
        int[] z = null;
        int[] x, y;

        x = new int[]{1, 2, 3, 4, 5};
        y = x;
        x = new int[]{-1, 2, 5, 4, 99};
        y = new int[3];
        z = new int[0];

        String[] s = new String[6];
        s[4] = "ketchup";
        s[x[3] - x[1]] = "muffins" ;

        int[] b = {9, 10, 11};
        // 从第3个位置将b的两个元素拷贝到x数组当中。。
        System.arraycopy(b, 0, x, 3, 2);
    }
}
