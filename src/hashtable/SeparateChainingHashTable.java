package hashtable;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yue on 2017/10/26.
 */
public class SeparateChainingHashTable<T> {

    private static final int DEFAULT_TABLE_SIZE = 101;
    private List[] lists;
    private int curSize;

    public SeparateChainingHashTable() {
        this(DEFAULT_TABLE_SIZE);
    }

    public  SeparateChainingHashTable(int size) {
        lists = new LinkedList[nextPrime(size)];
        for (int i = 0; i < lists.length; i++)
            lists[i] = new LinkedList();
    }

    public void insert(T x) {
        List<T> list = lists[myhash(x)];
        if (!list.contains(x)) {
            list.add(x);
            if (++curSize > lists.length)
                rehash();
        }
    }

    private int nextPrime(int n) {
        while (!isPrime(n)) n++;
        return n;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    private int myhash(T x) {
        int hashVal = x.hashCode();
        hashVal %= lists.length;
        if (hashVal < 0)
            hashVal += lists.length;
        return hashVal;
    }

    private void rehash() {
        List<T> [] oldLists = lists;
        lists = new List[nextPrime(2 * lists.length)];
        for (int j = 0; j < lists.length; j++)
            lists[j] = new LinkedList<>();
        curSize = 0;
        for (int i = 0; i < oldLists.length; i++)
            for (T item : oldLists[i])
                insert(item);

    }
}
