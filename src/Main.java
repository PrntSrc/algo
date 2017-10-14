import queue.Queue;

/**
 * Created by Yue on 2017/10/13.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<>();
        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.printQueue();
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
