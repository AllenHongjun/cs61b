public class Palindrome {

    /**
     * Return a Deque where the characters appear in the same
     * order as in the String
     * @param word
     * @return
     */
    public Deque<Character> wordToDeque(String word){
        Deque<Character> wordInDeque = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++){
            wordInDeque.addLast(word.charAt(i));
        }
        return wordInDeque;
    }

    /**
     * To determine whether a word is palindrome or not
     * @param wordInDeque
     * @return
     */
    private boolean isPalindrome(Deque<Character> wordInDeque){
        while (wordInDeque.size() > 1){
            return wordInDeque.removeFirst() == wordInDeque.removeLast() && isPalindrome(wordInDeque);
        }
        return true;
    }

    public boolean isPalindrome(String word){
        return isPalindrome(wordToDeque(word));
    }

    /**
     * To determine whether a word is a off-by-one palindrome
     * @param wordInDeque
     * @param cc
     * @return
     */
    private boolean isPalindrome(Deque<Character> wordInDeque, CharacterComparator cc){
        while (wordInDeque.size() > 1){
            return cc.equalChars(wordInDeque.removeFirst(), wordInDeque.removeLast()) && isPalindrome(wordInDeque, cc);
        }
        return true;
    }

    public boolean isPalindrome(String word, CharacterComparator cc){
        return isPalindrome(wordToDeque(word), cc);
    }
}





































