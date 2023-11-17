class TreeTraversal {
    public static void inOrderTraversal(BinaryTree root, Callback callback) {
        if (root == null) {
            return;
        }

        BinaryTree current = root;
        BinaryTree predecessor;

        while (current != null) {
            if (current.left == null) {
                callback.execute(current);
                current = current.right;
            } else {
                predecessor = current.left;

                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    callback.execute(current);
                    current = current.right;
                }
            }
        }
    }
}
