package byow.Core;

import  byow.TileEngine.TERenderer;
import  byow.TileEngine.TETile;



/**
 * 2 周时间完成的一个小项目
 * 有一点交互。。
 * 有一些界面来话。。
 * 会移动 会走。。
 * 不停地重复渲染界面。。
 */
public class Engine {

    TERenderer ter = new TERenderer();

    /**
     * Feel free to change the width and height.
     */
    public static final int WIDTH = 80;
    public  static final int HEIGHT = 30;


    /**
     * Method used for exploring a fresh world. This method should handle all inputs,
     * including inputs from the main menu.
     * 只有你真的喜欢这么课。。并且觉得这么课好的时候。。你才会学习的进去
     */
    public void interactWidthKeyboard(){

    }

    /**
     * Method used for autograding and testing your code. The input string will be a series
     * of characters(for example. "n123sswwdasdasdfdsf", "n123sss:q", "wwww") The engine should
     * behave exactly as if the user typed these characters into the engine using interactWithKeyboard.
     *
     * Recall that strings ending in ":q" should cause the game to quite save. For ecample.
     * if we do interactWithInputString("n123sss:q"), we expect the game to run the first 7 commands
     * (n123sss) and then quit and save. If we then do interactWithInputString("1"), we should be back in the
     * exact same stae.
     *
     * in other words, both of these calls:
     * - interactWithInputString("n123ss:q")
     *
     * should yield the exact same world sate as:
     *  - interactWithInputString("n123sssww")
     * @param input the input string to feed to your program
     * @return the 2D TETile[][] representing the state of the world
     */
    public TETile[][] interactWithInputString(String input){
        //TODO: Fill out this method so that it run the engine using the input
        /**
         *
         * passed in as an argument, and return a 2D tile representation of the
         * world that would have been drawn if the same inputs had been given
         * to interactWith Keyboard().
         *
         * See proj3.byow.InputDemo for a demo of how you can make a nice clean interface
         * that works for many different input types.
         */
        TETile[][] finalWorldFrame = null;
        return finalWorldFrame;

    }
}


















