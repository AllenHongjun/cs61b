import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {

    public static CharacterComparator offBy5 = new OffByN(5);

    @Test
    public void testEqualChars(){
        assertTrue(offBy5.equalChars('a','f'));
        assertTrue(offBy5.equalChars('f', 'a'));
        assertTrue(offBy5.equalChars('b','r'));
        assertTrue(offBy5.equalChars('3','8'));
    }
}
