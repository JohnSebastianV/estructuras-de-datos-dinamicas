public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.left.right = new BinaryTree(9);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

        Callback callback = new SomeCallback();

        TreeTraversal.inOrderTraversal(tree, callback);
    }
}