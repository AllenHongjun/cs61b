public class ElseDemo {

    public static void main(String[] args) {
        /**
         * The else keyword allows you to specify behavior that should occor if
         * a condition's result is false
         */
        int x = 9;
        if (x -3 > 8){
            System.out.println("x - 3 is greater than 8");
        }else{
            System.out.println("x -3 is not greater than 8");
        }

        int dogSize = 20;
        if (dogSize >= 50){
            System.out.println("woof!");
        }else if (dogSize >= 10){
            System.out.println("bark!");
        }else{
            System.out.println("yip!");
        }
    }
}
