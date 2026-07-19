package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Trees;

public class PostorderTraversal {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static void deleteFolderTree(Node node) {

        if (node == null)
            return;

        deleteFolderTree(node.left);
        deleteFolderTree(node.right);

        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        deleteFolderTree(root);
    }
}