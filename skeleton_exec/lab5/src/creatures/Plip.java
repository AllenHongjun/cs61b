package creatures;

import huglife.Creature;
import huglife.Direction;
import huglife.Action;
import huglife.Occupant;


import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * An implementation of a motile pacifist photosynthesizer.
 */
public class Plip extends Creature{

    /*
    * ideal 的操作老王培训的那一节课还是说了很多的
    * 方法往下面指向那一步如何来操作
    * 底层的方法在哪里
    * 如何调用数据 mybetis 的使用。。
    * 软件的生命周期。。运行管道的过程。。
    * */
    /**
     * red color
     */
    private int r;

    /**
     * greencolor
     */
    private int g;
    /**
     * blue color.
     */
    private int b;

    public Plip(double e){
        super("plip");
        r = 0;
        g = 0;
        b = 0;
        energy = e;

    }


    public Plip(){
        this(1);
    }


    /**
     * Shuld return a color with red = 99, blue = 76, and green
     * that varies
     * linearly based on the energy of the Plip. If the plip has zero energy,
     * it should have a green value of 63/ If it has max energy. it should
     * have a green value of 255. The green value should vary with energy linearly
     * in between these two extremes. It's not absolutely vital
     * that you get this exactly correct.
     * php javascript C# sql java python
     * @return
     */
    public Color color(){
        g = 63;
        return color(r, g, b);
    }


    public void attack(Creature c){
        // do nothing.
    }

    public void move(){
        //TODO
    }

    public  void stay(){
        //TODO
    }

    /**
     * Plips and their offsping each get 50% of the energy,with none
     * lost to the precess. Now that's efficiency! Returns a baby Plip
     * @return
     */
    public Plip replicate(){
        return this;
    }

    public Action chooseAction(Map<Direction, Occupant> neightbors){
        // Rule 1
        Deque<Direction> emptyNeighbors = new ArrayDeque<>();
        boolean anyClorus = false;
        // TODO
        // (Google: enhanced for-loop over keys of NEIGHbors?)
        // FOR(){...}

        if(false){

        }

        // Rule 2

        // Rule 3

        return new Action(Action.ActionType.STAY);
    }





















}

