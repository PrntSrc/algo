package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yue on 2017/10/27.
 * 575. Distribute Candies
 */
public class DistributeCandies {
    public static int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int c : candies)
            set.add(c);
        return set.size() <= candies.length / 2 ? set.size() : candies.length / 2;
    }

    public static void main(String[] args) {
        int[] candies = new int[] {1, 2, 3, 4, 5, 6, 7, 5, 3, 4, 2, 6, 10};
        System.out.println(distributeCandies(candies));
    }
}
