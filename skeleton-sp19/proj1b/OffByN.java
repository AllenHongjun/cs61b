//
public class OffByN implements CharacterComparator{

    private int diff;

    public OffByN(int N){
        diff = N;
    }

    /**
     * 比较 x y 两个字母是否刚好 距离是否刚好相差 N
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean equalChars(char x, char y) {
        return  x - y == diff || y - x == diff;
    }
}
