public class BinaryTree<T> {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if(node == null) {
            node = new Node(value);
        } else {
            if(node.getRight() == null) {
                node.setRight(insert(node.getRight(), value));
            } else {
                node.setLeft(insert(node.getLeft(), value));
            }
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node node) {
        if(node == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(node.getLeft());
            l += countNodes(node.getRight());
            return l;
        }
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if(node.getValue() == value)
            return true;
        if(node.getLeft() != null)
            if(search(node.getLeft(), value))
                return true;
        if(node.getRight() != null)
            if(search(node.getRight(), value))
                return true;
        return false;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if(node != null) {
            inorder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inorder(node.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node node) {
        if(node != null) {
            System.out.print(node.getValue() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node node) {
        if(node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }


}
