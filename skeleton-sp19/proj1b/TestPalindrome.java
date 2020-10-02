import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    // A palindrome is a word or a sentence which can be read from both sides!
    // Palindrome: NO MELON, NO LEMON
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    public void testIsPalindrome(){
        assertTrue(palindrome.isPalindrome("madam"));
        assertTrue(palindrome.isPalindrome("racecar"));
        assertTrue(palindrome.isPalindrome("a"));
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("dog"));
        assertTrue(palindrome.isPalindrome("AAAaAAA"));
        assertTrue(palindrome.isPalindrome("ACDC"));
    }


    public void testIsPalindromeCc(){
        OffByOne obo = new OffByOne();
        assertTrue(palindrome.isPalindrome("", obo));
        assertTrue(palindrome.isPalindrome("a", obo));
        assertTrue(palindrome.isPalindrome("flake", obo));
        assertTrue(palindrome.isPalindrome("zyzy",obo));
    }



}

//Uncomment this class once you've created your Palindrome class.




























