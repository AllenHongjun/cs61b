public class DoubleAndStringDemo {
    public static void main(String[] args) {
        /**
         * double stroes approximations of real numbers
         * and String stores string of characters
         *
         * 看一作业和代码
         * 有很多同学 一起在学习这么课程的
         */

//        String a = "Achilles";
//        String t = "Torotise";
//        double aPos = 0;
//        double tPos = 100;
//        double aSpeed = 20;
//        double tSpeed = 10;
//        double totalTime = 0;
//        while (aPos < tPos){
//            System.out.println("At time: " + totalTime);
//            System.out.println("     " + a + " is at position " + aPos);
//            System.out.println("       " + t + "is at psotion" + tPos);
//            double timeToReach = (tPos - aPos) / aSpeed;
//            totalTime = totalTime + timeToReach;
//            aPos = aPos + timeToReach * aSpeed;
//            tPos = tPos + timeToReach * tSpeed;
//        }


        /**
         * 总共打印5行
         * 每一行打印的* 的数量和他的行数是一样的。。col  其实就是每一行star的数量。
         */

        int col = 0;
        int row = 0;
        while ((row < 5) && (row >= col)) {
            if (row != col) {
                // 在同一行打印  另外开始一行答应
                System.out.print('*');
                col += 1;
            } else {
                System.out.println('*');
                row += 1;
                col = 0;
            }
        }


        System.out.println(max(10, 15));


        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 7;
        numbers[2] = 10;
        System.out.println(numbers[1]);

        int[] numbers2 = new int[]{4, 7, 10};
        System.out.println(numbers2[1]);
        System.out.println(numbers2.length);




    }


    public static int max(int x, int y){
        if(x > y){
            return x;
        }
        return y;
    }

}
