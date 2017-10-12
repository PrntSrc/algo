package tree;

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
}

