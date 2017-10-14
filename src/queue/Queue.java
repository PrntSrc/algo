package queue;

/**
 * Created by Yue on 2017/10/13.
 */
public class Queue<T> {

    private static class Node<T> {

        public Node(T element) {
            this.element = element;
        }

        Node<T> next;
        T element;
    }

    private Node<T> front = null;
    private Node<T> rear = null;

    public boolean isEmpty() {
        return front == rear;
    }

    public void add(T element) {
        Node<T> node = new Node<>(element);
        if (front == null && rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = rear.next;
        }

    }

    public T remove() throws Exception {
        if (isEmpty())
            throw new Exception("queue is empty");
        T element = front.element;
        front = front.next;
        return element;
    }

    public int size() {
        int size = 0;
        Node<T> node = front;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public void printQueue() {
        if (isEmpty())
            System.out.println("queue is empty");
        else {
            Node<T> node = front;
            printQueue(node);
        }
    }

    private void printQueue(Node<T> node) {
        if (node != null) {
            System.out.println(node.element);
            printQueue(node.next);
        }
    }



}
