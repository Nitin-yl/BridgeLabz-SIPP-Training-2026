package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Trees;

public class TreeDiameter {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static int diameter = 0;

    static int height(Node node) {

        if (node == null)
            return -1;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }

    static int longestCommunicationPath(Node root) {

        diameter = 0;
        height(root);

        return diameter;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        System.out.println(longestCommunicationPath(root));
    }
}