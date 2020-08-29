package byow.TileEngine;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;
import java.awt.Font;

/**
 * Utility class for renderding tiles. You do not need to modify this file. Yor'are welcom
 * to, but be careful. We strongly recommend getting everything else working before
 * messing with this renderer, unless you're trying to do something fancy like
 * allowing scrolling of the screen or tracking the avatar or something similar.
 */
public class TERenderer {
    /**
     * 学习还是一件最快乐的事情。因为自己想敲什么代码就可以敲什么代码
     * 学习也是最简单的一件事情。。
     */
    private static final int TILE_SIZE = 16;
    private int width;
    private int height;
    private int xOffset;
    private int yOffset;

    /**
     * Same functionality as the other initialization method. The only differnce is that the XOff
     * and yOff parameters will change where the renderFrame method starts drawing. For example,
     * if you select w = 60, h = 30, xOff = 3, yOff = 4 and then call renderFrame with a
     * TETile[50][25] array, the renderer will leave 3 tiles blank on the left, 7 titles blank
     * on the right, 4 tiles blank on the bottom, and 1 tile blank on the top.
     * @param w width of the window in tiles
     * @param h height of the window in tiles.
     * @param xOff
     * @param yOff
     */
    public void initialize(int w, int h, int xOff, int yOff){
        this.width = w;
        this.height = h;
        this.xOffset = xOff;
        this.yOffset = yOff;
        StdDraw.setCanvasSize(width * TILE_SIZE, height * TILE_SIZE);
        Font font = new Font("Monaco", Font.BOLD, TILE_SIZE - 2);
        StdDraw.setFont(font);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.clear(new Color(0, 0, 0));
        StdDraw.enableDoubleBuffering();
        StdDraw.show();
    }

    /**
     * Initializes StdDraw parameters and launches the StdDraw window. w and h are the
     * width and height of the world in number of tiles. If the TETile[][] array that you
     * pass to renderFrame is smaller than this, then extra blank space will be left
     * on the right and top edges of the frame.
     * 如果使用世界分享最优秀的课程。构建一个自学（学习）的平台
     * 夸平台。。课程保持更新。。不需要有重复的课程。。
     * 重复的课程 1-3门不能多。。
     * @param w
     * @param h
     */
    public void initialize(int w, int h){
        initialize(w, h, 0, 0);
    }

    /**
     * Takes in a 2d array of TETile objects and renders the 2d array to the screen. starting from
     * xOffset and yOffset.
     *
     * if the array is an N*M array. then the element displayed at positions would be as follows
     * given in units of tiles.
     * *              positions   xOffset |xOffset+1|xOffset+2| .... |xOffset+world.length
     *      *
     *      * startY+world[0].length   [0][M-1] | [1][M-1] | [2][M-1] | .... | [N-1][M-1]
     *      *                    ...    ......  |  ......  |  ......  | .... | ......
     *      *               startY+2    [0][2]  |  [1][2]  |  [2][2]  | .... | [N-1][2]
     *      *               startY+1    [0][1]  |  [1][1]  |  [2][1]  | .... | [N-1][1]
     *      *                 startY    [0][0]  |  [1][0]  |  [2][0]  | .... | [N-1][0]
     *
     * By varing xOffset, yOffset, and the size of the screen when initialized, you can leave
     * empty space in different places to leave room for other information, such as a GUI.
     * edx consour 卡 很多课程 对应在哪个网站上都有。。卡的问题需要解决一下。
     * This method assumes that the xScale and yScale have been set such that the max x value
     * is the width of the sceen in tiles, and max y value is the height of the screen in tiles.
     *
     * 弄一个网站维护一下 teachyourself的资源
     * 网站链接会更新。。
     * 软件 资源的的地址维护。。书籍的链接。。等等 找起来更加的方便一点。
     *
     * @param world the 2DTETile[][] array to render
     */
    public void renderFrame(TETile[][] world){
        int numXTiles = world.length;
        int numYTiles = world[0].length;
        StdDraw.clear(new Color(0, 0, 0));
        for (int x = 0; x < numXTiles; x += 1){
            for(int y = 0; y < numXTiles; y += 1){
                if(world[x][y] == null){
                    throw new IllegalArgumentException("Tile at position x=" + x + ", y=" + y +
                            " is null.");
                }
            }
        }
        StdDraw.show();
    }

}
