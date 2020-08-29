package Intlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntListTest {

    /**
     * Example test that verifies correctness of the IntList.of static method.The main point of this is to
     * convince you that assertEquals knows how to handle IntLists just fine.
     */
    @Test
    public void testList(){
        IntList one = new IntList(1,null);
        IntList twoOne = new IntList(2, one);
        IntList threeTwoOne = new IntList(3,twoOne);

        IntList x = IntList.of(3,2,1);
        assertEquals(threeTwoOne,x);
    }

    @Test
    public void testdSquareList(){
        IntList L = IntList.of(1, 2, 3);
        IntList.dSquareList(L);
        assertEquals(IntList.of(1, 4, 9), L);
    }

    @Test
    public void testSquareListRecursive(){
        IntList L = IntList.of(1, 2, 3);
        IntList res = IntList.squareListRecursive(L);
        assertEquals(IntList.of(1, 2, 3), L);
        assertEquals(IntList.of(1, 4, 9), res);
    }
    @Test
    public void testDcatenate(){
        IntList A = IntList.of(1, 2, 3);
        IntList B = IntList.of(4, 5, 6);
        IntList exp = IntList.of(1, 2, 3, 4, 5, 6);
        assertEquals(exp, IntList.dcatenate(A, B));
        assertEquals(IntList.of(1, 2, 3, 4, 5,  6), A);
    }

    @Test
    public void testCatenate(){
        IntList A = IntList.of(1, 2, 3);
        IntList B = IntList.of(4, 5, 6);
        IntList exp = IntList.of(1, 2, 3, 4, 5, 6, 7);

        assertEquals(exp, IntList.catenate(A, B));
        assertEquals(exp, IntList.of(1, 2, 3), A);
    }


}
