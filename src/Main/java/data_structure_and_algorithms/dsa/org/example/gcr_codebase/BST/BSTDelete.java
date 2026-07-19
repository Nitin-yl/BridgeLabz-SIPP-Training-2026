package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.BST;

public class BSTDelete {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node delete(Node root, int value) {

        if (root == null)
            return null;

        if (value < root.val)
            root.left = delete(root.left, value);

        else if (value > root.val)
            root.right = delete(root.right, value);

        else {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node successor = root.right;

            while (successor.left != null)
                successor = successor.left;

            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root = delete(root, 30);

        inorder(root);
    }
}