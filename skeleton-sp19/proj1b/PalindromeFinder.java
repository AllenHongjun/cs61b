/** This class outputs all palindromes in the words file in the current directory. */
// 找出 ../library-sp19-master/data/word.txt 中所有具有回文结构的单词 并且打印出来
// 并且写一些单元测试的方法来测试 方法的正确 与否。。
// 实现一些方法来 完成这个功能。。
public class PalindromeFinder {
    public static void main(String[] args) {
        int minLength = 4;
        In in = new In("../../library-sp19-master/data/words.txt");
        Palindrome palindrome = new Palindrome();

        while (!in.isEmpty()) {
            String word = in.readString();
            if (word.length() >= minLength && palindrome.isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
}

//Uncomment this class once you've written isPalindrome.