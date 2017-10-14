import List.LinkedList;

/**
 * Created by Yue on 2017/10/13.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        list.printList();
        System.out.println(list.remove(1));
        list.printList();
    }
}
