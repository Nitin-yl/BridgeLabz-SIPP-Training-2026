package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.*;

public class DictionaryBST {

    static class Node {
        String word;
        Node left, right;

        Node(String word) {
            this.word = word;
        }
    }

    static int count = 0;

    // Insert
    static Node insert(Node root, String word) {

        if (root == null)
            return new Node(word);

        if (word.compareTo(root.word) < 0)
            root.left = insert(root.left, word);

        else if (word.compareTo(root.word) > 0)
            root.right = insert(root.right, word);

        return root;
    }

    // Search
    static boolean search(Node root, String word) {

        while (root != null) {

            int cmp = word.compareTo(root.word);

            if (cmp == 0)
                return true;

            if (cmp < 0)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }

    // Delete
    static Node delete(Node root, String word) {

        if (root == null)
            return null;

        int cmp = word.compareTo(root.word);

        if (cmp < 0)
            root.left = delete(root.left, word);

        else if (cmp > 0)
            root.right = delete(root.right, word);

        else {

            // Leaf Node
            if (root.left == null && root.right == null)
                return null;

            // One Child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Two Children
            Node successor = root.right;

            while (successor.left != null)
                successor = successor.left;

            root.word = successor.word;

            root.right = delete(root.right, successor.word);
        }

        return root;
    }

    // Inorder
    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.word + " ");
        inorder(root.right);
    }

    // Kth Smallest
    static String kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();

        Node current = root;
        count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            count++;

            if (count == k)
                return current.word;

            current = current.right;
        }

        return null;
    }

    // Validate BST
    static boolean validate(Node node, String min, String max) {

        if (node == null)
            return true;

        if ((min != null && node.word.compareTo(min) <= 0) ||
                (max != null && node.word.compareTo(max) >= 0))
            return false;

        return validate(node.left, min, node.word)
                && validate(node.right, node.word, max);
    }

    static boolean isValidBST(Node root) {
        return validate(root, null, null);
    }

    // Lowest Common Ancestor
    static Node lowestCommonAncestor(Node root, String w1, String w2) {

        while (root != null) {

            if (w1.compareTo(root.word) < 0 &&
                    w2.compareTo(root.word) < 0)
                root = root.left;

            else if (w1.compareTo(root.word) > 0 &&
                    w2.compareTo(root.word) > 0)
                root = root.right;

            else
                return root;
        }

        return null;
    }

    public static void main(String[] args) {

        String[] words = {
                "Mango","Apple","Banana","Orange","Grapes",
                "Kiwi","Cherry","Peach","Pear","Lemon",
                "Guava","Plum","Papaya","Berry","Coconut",
                "Fig","Date","Melon","Apricot","Lychee"
        };

        Node root = null;

        // Insert 20 Words
        for (String word : words)
            root = insert(root, word);

        System.out.println("Dictionary (Inorder):");
        inorder(root);

        // Search
        System.out.println("\n\nSearch Apple: " + search(root, "Apple"));
        System.out.println("Search Tomato: " + search(root, "Tomato"));

        // Delete Leaf Node
        root = delete(root, "Fig");

        // Delete One Child Node
        root = delete(root, "Date");

        // Delete Two Children Node
        root = delete(root, "Orange");

        System.out.println("\nDictionary After Deletion:");
        inorder(root);

        // Kth Smallest
        System.out.println("\n\n5th Alphabetical Word: "
                + kthSmallest(root, 5));

        // Validate BST
        System.out.println("Valid BST: "
                + isValidBST(root));

        // Lowest Common Ancestor
        Node lca = lowestCommonAncestor(root, "Apple", "Cherry");

        System.out.println("LCA of Apple and Cherry: "
                + lca.word);
    }
}
