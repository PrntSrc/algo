package array;

/**
 * 605. Can Place Flowers
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = new int[] {1, 0, 0, 0, 0, 1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1)
            return true;
        int twiceZero = 0;
        for (int i = 0; i < flowerbed.length - 1; i++) {
            twiceZero = (flowerbed[i] | flowerbed[i + 1]) == 0 ? twiceZero + 1 : 0;
            if ((i == 0 || i == flowerbed.length - 2) && twiceZero == 1 || twiceZero == 2) {
                n--;
                twiceZero = 0;
            }
        }
        return n <= 0;
    }
}
