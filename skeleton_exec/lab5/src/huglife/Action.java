package huglife;

/**
 * Actions are creaed by Creatures to signify intend, and take effect via
 * the Huglife simulaor.
 * <p>
 * Note there are three Action consturcotrs, each with their own semantics!
 * They are:
 * 1. Action(ActionType at): Used for creating actins that dont'nt invole movement.
 * 2. Action(ActionType at , Directio d): Used for creating actions that
 * involve relative movement.
 * 3. Action(ActionType at, int x, int y): Used for creation actions that involue
 * absolute movement. NOT NECESSARY FOR THIS LAB, but inclued in case you
 * want to do anything fancy.
 * 可以参加一个java 高级培训课程。。高并发。。算法的课程等等
 * There are five ActionTypes: MOVE, REPLICATE, ACCTACK ,STAY AND DIE. IF your
 * specify move, replicate, attack, you must use one of the movement
 * constructors.
 *
 * if you specify stay or die , you must use one the non-movement contructor.
 */
public class Action {
    // 一般来说是先定义 字段 再定义构造函数

    /**
     * There are exactly five possible actions. MOVE ,Replicate, and ATTACK
     * are movement based. STAY and DIE are non-movement actions.
     *
     */
    public enum ActionType{
        MOVE,
        REPLICATE,
        ATTACK,
        STAY,
        DIE
    }

    /**
     * Actions without absolute position should use UNDEFINED position
     */
    private static final int UNDEFINED = -126;

    /**
     * Create an action involving no movement, A little strange to throw
     * a runtime error here if the ActionType is a movemnet based action.
     * since in principle we can catch this at complie time. However, doing
     * so would require nested enums and there is enough new syntax in this lab
     * as it is. Result is of type AT.
     * @param at
     */
    public Action(ActionType at){
        if (isMoveAction(at)) {
            throw new IllegalArgumentException("Attemped to create action "
            + "of type " + at + "with no direction. ");
        }
        // 这里不加 this和有this  的效果其实是一样的。
        type =at;
        dir = null;
        x = UNDEFINED;
        y = UNDEFINED;
    }

    public Action(ActionType at, Direction d){
        if(!isMoveAction(at)){
            throw new IllegalArgumentException("Attempted to create action " + "of type" + at + " with a direction.");
        }
        this.type = at;
        this.dir = d;
        this.x = UNDEFINED;
        this.y = UNDEFINED;
    }

    /**
     * Create action of type AT and target location X and Y.
     * @param at
     * @param x
     * @param y
     */
    public Action(ActionType at, int x, int y){
        if(!isMoveAction(at)){
            throw new IllegalArgumentException("Attempted to create action" +
                     "of type " + at + " with a location.");
        }

        type = at;
        dir = null;
        this.x = x;
        this.y = y;
    }

    /**
     * The type of the action.
     */
    public final ActionType type;

    /**
     * The direction of the action(if applicable).
     */
    public final Direction dir;

    /**
     * The x target of the action（if applicable）.
     */
    public final int x;

    /**
     * The y target of the action
     */
    public final int y;

    /**
     * Returns whether the action AT is a move action.
     * @param at
     * @return
     */
    public boolean isMoveAction(ActionType at){
        return ((at == ActionType.MOVE) || (at == ActionType.REPLICATE) || (at == ActionType.ATTACK));
    }

    /**
     * Returns whether this Action is equal to OTHER.
     * @param other
     * @return
     */
    public boolean equals(Object other){
        if(other == this){
            return true;
        }

        if(other == null){
            return false;
        }

        if(other.getClass() != this.getClass()){
            return false;
        }
        Action that = (Action) other;
        return this.x == that.x && this.y == that.y && this.dir == that.dir && this.type == that.type;

    }

    /**
     * Returns string representation of this action.
     * @return
     */
    public String toString(){
        if((dir == null) && (x != UNDEFINED)){
            return String.format("Action: " + type + " at " + x
            + ", " + y + ".");
        }else if(dir != null){
            return String.format("Action: " + type + "in direction " + dir + ".");
        }else{
            return String.format("Action: " + type + ".");
        }
    }


}



























