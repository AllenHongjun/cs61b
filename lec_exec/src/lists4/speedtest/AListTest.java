package lists4.speedtest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the AList class.
 * 编写单元测试的代码。。
 * 根据具体的需要。。来编写
 */
public class AListTest {

    @Test
    public void testEmptySize(){
        AList L = new AList();
        assertEquals(0, L.size());
    }

    @Test
    public void testAddAndSize(){
        AList L = new AList();
        L.addLast(99);
        L.addLast(99);
        assertEquals(2, L.size());
    }

    public void testAddAndGetLast(){
        /**
         *  调用自己写好的类或者方法。
         *  假设自己写好的方法 返回值 和我们预想的值需要一致
         */
        AList L = new AList();
        L.addLast(99);
        assertEquals(99, L.getLast());

        L.addLast(36);
        assertEquals(36, L.getLast());
    }

    @Test
    public void testGet(){
        AList L = new AList();
        L.addLast(99);
        assertEquals(99, L.get(0));

        L.addLast(36);
        assertEquals(99, L.get(0));
        assertEquals(36,L.get(1));
    }


    @Test
    public void testRemove(){
        AList L = new AList();
        L.addLast(99);
        assertEquals(99, L.get(0));

        L.addLast(36);
        assertEquals(99, L.get(0));

        L.removeLast();
        assertEquals(99,L.getLast());

        L.addLast(100);
        assertEquals(100, L.getLast());
        assertEquals(2, L.size());
    }


    public static void main(String[] args){
        jh61b.junit.TestRunner.runTests("all",AListTest.class);
    }

}































