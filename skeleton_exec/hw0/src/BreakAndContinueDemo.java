public class BreakAndContinueDemo {

    public static  void main(String[] args){
        String[] a = {"cat", "dog", "laser horse", "ketchup","horse","horbse"};

        for (int i = 0; i< a.length; i+= 1){
            if(a[i].contains("horse")){
                continue;
            }
            for (int j = 0; j < 3; j += 1){
                System.out.println(a[i]);
            }
        }

        System.out.println("================分割线=========================");
        breakDemo();
    }


    public static void breakDemo(){
        String[] a = {"cat", "dot", "laser horse","ketchup","horse","horbse"};
        for (int i = 0; i < a.length; i += 1){
            for(int j = 0; j < 3; j += 1){
                System.out.println(a[i]);
                if(a[i].contains("horse")){
                    break;
                }
            }
        }
    }


}
