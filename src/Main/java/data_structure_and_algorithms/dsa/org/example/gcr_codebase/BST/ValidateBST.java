package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.BST;

public class ValidateBST {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static boolean validate(Node node, long min, long max) {

        if (node == null)
            return true;

        if (node.val <= min || node.val >= max)
            return false;

        return validate(node.left, min, node.val)
                && validate(node.right, node.val, max);
    }

    static boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println(isValidBST(root));
    }
}