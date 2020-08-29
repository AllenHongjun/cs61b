package huglife;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;

/**
 * A class that represents living creatures. You should
 * extend this class to populate your world.
 */
public abstract class Creature extends Occupant{

    /**
     * energy for this creatures.
     */
    protected double energy;

    /**
     * Creates a creature with the name N. The intention is that this
     * name should be shared between all creatures of the same type.
     * @param n
     */
    public Creature(String n){
        super(n);
    }

    /**
     * Called when this creature moves.
     */
    public abstract void move();

    /**
     * Called when this creature attacks C.
     * @param c
     */
    public abstract void attack(Creature c);

    /**
     * Called when this creature chooses replicate.
     * Must return a creature of the same type.
     * @return
     */
    public abstract Creature replicate();


    /**
     * Called when this creature chooses stay.
     */
    public abstract void stay();

    /**
     * Returns an action. The creatures is provided information about its
     * immediate NEIGHBORS   with which to make a decision
     * @param neighbors
     * @return
     */
    public abstract Action chooseAction(Map<Direction,Occupant> neighbors);

    /**
     * Return the current energy.
     * @return
     */
    public double energy(){
        return energy;
    }

}



























