package huglife;

import java.awt.Color;

/**
 * Represents possible occupants of the grid world.
 * Intended for extension by:
 * Creature. Empty. and Impassible only.
 */
public abstract class Occupant {
    /**
     * Name for this type of Occupant.
     */
    protected final String name;

    public Occupant(String n){
        name =n;
    }

    /**
     * Returns the name of this occupant.
     * @return
     */
    public String name(){
        return name;
    }

    /**
     * Returns a Color object given R, G, and B values.
     * Intended for use by subtypes so they don't have to import or
     * think about colors.
     * @param r
     * @param g
     * @param b
     * @return
     */
    protected static Color color(int r, int g, int b){
        return new Color(r, g, b );
    }

    /**
     * Required method that returns a color.
     * @return
     */
    public abstract Color color();
}








































