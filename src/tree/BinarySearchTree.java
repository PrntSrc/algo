package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yue on 2017/10/12.
 */
public class BinarySearchTree<T extends Comparable<? super T>> {

    private static class BinaryNode<T> {

        BinaryNode(T element) {
            this(element, null, null);
        }

        public BinaryNode(T element, BinaryNode<T> left, BinaryNode<T> right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }

        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;
    }

    private BinaryNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public boolean contains(T x) {
        return contains(x, this.root);
    }

    private boolean contains(T x, BinaryNode<T> root) {
        if (root == null)
            return false;
        int compareResult = x.compareTo(root.element);

        if (compareResult < 0)
            return contains(x, root.left);
        else if (compareResult > 0)
            return contains(x, root.right);
        else
            return true;
    }

    public T findMin() throws Exception {
        if (isEmpty())
            throw new Exception("tree is empty");
        return findMin(this.root).element;
    }

    private BinaryNode<T> findMin(BinaryNode<T> root) {
        if (root.left == null)
            return root;
        return findMin(root.left);
    }

    public T findMax() throws Exception {
        if (isEmpty())
            throw new Exception("tree is empty");
        return findMax(this.root).element;
    }

    private BinaryNode<T> findMax(BinaryNode<T> root) {
        if (root.right == null)
            return root;
        return findMax(root.right);
    }

    public void insert(T x) {
        this.root = insert(x, this.root);
    }

    private BinaryNode<T> insert(T x, BinaryNode<T> root) {
        if (root == null)
            return new BinaryNode<>(x);
        int compareResult = x.compareTo(root.element);
        if (compareResult < 0)
            root.left = insert(x, root.left);
        else if (compareResult > 0)
            root.right = insert(x, root.right);
        return root;
    }

    public void remove(T x) {
        this.root = remove(x, this.root);
    }

    private BinaryNode<T> remove(T x, BinaryNode<T> root) {
        if (root == null)
            return null;
        int compareResult = x.compareTo(root.element);
        if (compareResult < 0)
            root.left = remove(x, root.left);
        else if (compareResult > 0)
            root.right = remove(x, root.right);
        else if (root.left != null && root.right != null) {
            root.element = findMin(root.right).element;
            root.right = remove(root.element, root.right);
        }
        else
            root = root.left != null ? root.left : root.right;
        return root;
    }

    public int height() {
        return height(this.root);
    }

    private int height(BinaryNode<T> root) {
        if (root == null)
            return -1;
        else
            return 1 + Math.max(height(root.left), height(root.right));
    }

    public void preOrderWalk() {
        if (isEmpty())
            System.out.println("tree is empty");
        else
            preOrderWalk(this.root);
    }

    private void preOrderWalk(BinaryNode<T> root) {
        if (root != null) {
            System.out.println(root);
            preOrderWalk(root.left);
            preOrderWalk(root.right);
        }
    }

    public void inOrderWalk() {
        if (isEmpty())
            System.out.println("tree is empty");
        else
            inOrderWalk(this.root);
    }

    private void inOrderWalk(BinaryNode<T> root) {
        if (root != null) {
            inOrderWalk(root.left);
            System.out.println(root);
            inOrderWalk(root.right);
        }
    }

    public void postOrderWalk() {
        if (isEmpty())
            System.out.println("tree is empty");
        else
            postOrderWalk(this.root);
    }

    private void postOrderWalk(BinaryNode<T> root) {
        if (root != null) {
            postOrderWalk(root.left);
            postOrderWalk(root.right);
            System.out.println(root);
        }
    }

    public void layerOrderWalk() {
        if (isEmpty())
            System.out.println("tree is empty");
        else
            layerOrderWalk(this.root);
    }

    private void layerOrderWalk(BinaryNode<T> root) {
        Queue<BinaryNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode<T> node = queue.poll();
            System.out.println(node.element);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }
}

