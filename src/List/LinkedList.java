package List;

/**
 * Created by Yue on 2017/10/14.
 */
public class LinkedList {

    private static class Node {

        public Node(int val) {
            this.val = val;
        }

        public Node next;
        public int val;
    }

    private Node head;

    public int size() {
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public void add(int val) {
        Node node = new Node(val);
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Boolean remove(int i) {
        if (i < 0 || i >= size())
            return false;
        else {
            if (i == 0)
                head = head.next;
            else {
                Node node = head;
                while (i > 1) node = node.next;
                node.next = node.next.next;
            }
        }
        return true;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
