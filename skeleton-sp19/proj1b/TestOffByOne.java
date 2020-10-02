import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testEqualChars(){
        assertTrue(offByOne.equalChars('x', 'y'));
        assertTrue(offByOne.equalChars('z','y'));
        assertTrue(offByOne.equalChars('A','B'));
        assertTrue(offByOne.equalChars('!','@'));
        assertTrue(offByOne.equalChars('2','&'));
    }
}

//Uncomment this class once you've created your CharacterComparator interface and OffByOne class. *