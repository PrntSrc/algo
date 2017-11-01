import java.math.BigInteger;

/**
 * Created by Yue on 2017/10/13.
 */
public class Main {
    public static void main(String[] args) {
        int[] bits = new int[] {1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1)
                i += 1;
            else if (i == bits.length - 1)
                return true;
        }
        return false;
    }
}
