public class WhileDemo {

    public static void main(String[] args) {
        /**
         * The while keyword lets you repeat a block of code
         * as long as some condiftion is true.
         */

        int bottles = 99;
        while (bottles > 0){
            System.out.println(bottles + "bottles of beer on the wall.");
            bottles = bottles - 1;
        }


    }
}
