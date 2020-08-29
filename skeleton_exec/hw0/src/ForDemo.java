public class ForDemo {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        whileSum(a);

        System.out.println("==================这是一条分割线===================");
        forDemo();
    }

    public static int whileSum(int[] a){
        int i = 0;
        int sum = 0;
        while (i < a.length){
            sum = sum + a[i];
            i = i + 1;
            System.out.println(sum);
        }
        return  sum;
    }

    public static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i = i + 1){
            sum = sum + a[i];
        }
        return sum;
    }

    public static void forDemo(){
        for(int i = 0, j = 10; i < j; i += 1){
            System.out.println(i + j);
        }
    }




}
