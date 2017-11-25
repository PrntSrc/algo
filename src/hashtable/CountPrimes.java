package hashtable;

public class CountPrimes {
    public static void main(String[] args) {
        Boolean[] is = new Boolean[5];
        for (boolean b : is)
            System.out.println(b == false);
//        System.out.println(isPrime(25));
        System.out.println(countPrimes(25));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (isPrime(i))
                count++;
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
