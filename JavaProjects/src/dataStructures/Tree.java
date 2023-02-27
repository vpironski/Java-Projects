package dataStructures;

import java.util.Scanner;

public class Tree {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

    }
    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value); }
            else {
                System.out.println("Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            }
            else {
                System.out.println("Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of nodes in the Binary Tree");
        int len = scan.nextInt();
        System.out.println("---------------------");
        Tree tree = new Tree();

        System.out.println("Enter the root node of the tree: ");
        int root_node = scan.nextInt();
        Node root = new Node(root_node);
        System.out.println("---------------------");
        for (int i = 0; i < len; i++) {
            System.out.println("Input the values of the tree");
            int input = scan.nextInt();
            tree.insert(root, input);
            System.out.println("---------------------");
        }

        System.out.println("Binary Tree Example");
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
        System.out.println("---------------------");

        System.out.println("\nTravels tree in pre order");
        tree.traversePreOrder(root);
        System.out.println("---------------------");

        System.out.println("\nTravels tree in post order");
        tree.traversePostOrder(root);
        System.out.println("---------------------");

    }
}