import java.math.BigInteger;

/**
 * Created by Yue on 2017/10/13.
 */
public class Main {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("5");
        BigInteger exponent = new BigInteger("100");
        BigInteger m = new BigInteger("7");
        System.out.println(i.modPow(exponent, m));
    }
}
