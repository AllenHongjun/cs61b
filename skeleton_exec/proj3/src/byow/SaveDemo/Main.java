package byow.SaveDemo;

import edu.princeton.cs.introcs.StdDraw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*If an editor has been saved before, we first load it*/
        Editor e = loadEditor();
        e.initialize();

        /*
        * Loop to run the Editor with the following commands:
        * $: Saves the current screen
        * @: Exits the editor
        * !: Fred suggests the gang splits up(agian...)
        *
        * 有很多是垃圾代码 学会远离这些垃圾代码
        * 这台笔记本应该还能再战斗两年。。两年后 需要换一台新的
        * Any other character will be added to a String which
        * is displayed in the center of the screen
        *
        * */

        while (true){
            if(StdDraw.hasNextKeyTyped()){
                char c = StdDraw.nextKeyTyped();
                switch (c){
                    case '$':
                        saveEditor(e);
                        break;
                    case '@':
                        System.exit(0);
                        break;
                    case '!':
                        e.tend();
                        break;
                    default:
                        e.addChar(c);
                }
            }
            e.show();
        }



    }

    private static Editor loadEditor(){
        File f = new File("./save_data");
        if (f.exists()){
            try {
                FileInputStream fs = new FileInputStream(f);
                ObjectInputStream os = new ObjectInputStream(fs);
                return (Editor) os.readObject();
            }catch (FileNotFoundException e){
                System.out.println("file not found");
            }catch (IOException e){
                System.out.println(e);
                System.exit(0);
            }catch (ClassNotFoundException e){
                System.out.println("class not found");
                System.exit(0);
            }
        }

        /*In the case no Editor has been saved yet, we return a new one.*/
        return new Editor();
    }




    private static void saveEditor(Editor editor){

        /*
        *每个人的时间都是平等的。。
        * 谁也不能阻止你上进。。努力 和学习。。
        * */
        File f = new File("./save_data");
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            FileOutputStream fs = new FileOutputStream(f);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(editor);


        }catch (FileNotFoundException e){
            System.out.println("file not found");
            System.exit(0);
        }catch (IOException e){
            System.out.println(e);
            System.exit(0);
        }

    }

}
























