package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.*;

public class FamilyTree {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    static void levelOrder(Node root) {

        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            Node node = queue.poll();

            System.out.print(node.val + " ");

            if (node.left != null)
                queue.offer(node.left);

            if (node.right != null)
                queue.offer(node.right);
        }
    }

    static void inorderIterative(Node root) {

        Stack<Node> stack = new Stack<>();

        Node curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            System.out.print(curr.val + " ");

            curr = curr.right;
        }
    }

    static void preorderIterative(Node root) {

        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();

            System.out.print(node.val + " ");

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }
    }

    static void postorderIterative(Node root) {

        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {

            Node node = stack1.pop();
            stack2.push(node);

            if (node.left != null)
                stack1.push(node.left);

            if (node.right != null)
                stack1.push(node.right);
        }

        while (!stack2.isEmpty())
            System.out.print(stack2.pop().val + " ");
    }

    static void levelOrderIterative(Node root) {
        levelOrder(root);
    }

    static int height(Node root) {

        if (root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static void countNodesAtEachLevel(Node root) {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            System.out.println("Level " + level + " : " + size + " nodes");

            for (int i = 0; i < size; i++) {

                Node node = queue.poll();

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            level++;
        }
    }

    static int diameter = 0;

    static int heightForDiameter(Node root) {

        if (root == null)
            return -1;

        int left = heightForDiameter(root.left);
        int right = heightForDiameter(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }

    static int getDiameter(Node root) {

        diameter = 0;

        heightForDiameter(root);

        return diameter;
    }

    static boolean isBalanced(Node root) {

        if (root == null)
            return true;

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Recursive Inorder: ");
        inorder(root);

        System.out.print("\nRecursive Preorder: ");
        preorder(root);

        System.out.print("\nRecursive Postorder: ");
        postorder(root);

        System.out.print("\nRecursive Level Order: ");
        levelOrder(root);

        System.out.print("\n\nIterative Inorder: ");
        inorderIterative(root);

        System.out.print("\nIterative Preorder: ");
        preorderIterative(root);

        System.out.print("\nIterative Postorder: ");
        postorderIterative(root);

        System.out.print("\nIterative Level Order: ");
        levelOrderIterative(root);

        System.out.println("\n\nHeight = " + height(root));

        System.out.println("\nNodes at Each Level:");
        countNodesAtEachLevel(root);

        System.out.println("\nDiameter = " + getDiameter(root));

        System.out.println("Balanced = " + isBalanced(root));
    }
}