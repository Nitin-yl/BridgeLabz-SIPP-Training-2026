package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.BST;

public class BSTInsert {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int value) {

        if (root == null)
            return new Node(value);

        if (value < root.val)
            root.left = insert(root.left, value);
        else if (value > root.val)
            root.right = insert(root.right, value);

        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 40);

        inorder(root);
    }
}