package simple;

/**
 * created on 2019/11/17
 *
 * @author dailinfu
 */

public class 猜数字 {
    public int game(int[] guess, int[] answer) {
        int result = 0;
        for (int i = 0; i < guess.length; ++i) {
            if (guess[i] == answer[i]){
                result++;
            }
        }
        return result;
    }
}
