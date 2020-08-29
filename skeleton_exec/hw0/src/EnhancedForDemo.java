public class EnhancedForDemo {

    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        for (String s : a){
            for (int j = 0; j < 3; j += 1){
                System.out.println(s);
                // 包含  horse的代码只是打印一次 其他的 元素打印3次

                /*
                *理解代码 将代码 转化为意思
                *
                * 理解问题。。将问题转化代码
                * */
                if (s.contains("horse")){
                    break;
                }
            }
        }
    }


    public static  void windowPosSum(int[] a, int n){
        /**/
    }


    public static void breakContinue(){
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        // Should print 4. 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }

}
