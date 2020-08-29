package byow.InputDemo;

import edu.princeton.cs.introcs.StdDraw;

public class KeyboardInputSource implements InputSource {
    private static final boolean PRINT_TYPED_KEYS = false;

    public KeyboardInputSource(){
        StdDraw.text(0.3,0.3,"press m to moo, q to quit");
    }

    public char getNextKey(){
        while(true){
            /*
            * 弄一个无线的循环。。
            * 然后调用类库。。一直监听 键盘的输入。。
            * 写开发。开发之前
            * 需要思考好应该如何来写。。
            * 没有思路。。这么写也都是乱写。。也写不好 。写不出。
            *
            * */
            if (StdDraw.hasNextKeyTyped()){
                char c = Character.toUpperCase(StdDraw.nextKeyTyped());
                if (PRINT_TYPED_KEYS){
                    System.out.print(c);
                }
                return c;
            }
        }
    }

    public boolean possibleNextInput(){
        return true;
    }

}
