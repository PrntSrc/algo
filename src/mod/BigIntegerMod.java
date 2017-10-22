package mod;

import java.math.BigInteger;

public class BigIntegerMod {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("5");
        BigInteger exponent = new BigInteger("100");
        BigInteger m = new BigInteger("7");
        System.out.println(i.modPow(exponent, m));
    }
}
