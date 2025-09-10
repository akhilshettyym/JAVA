package akhilshettyym.JAVA.DSA.Advanced.Trees;

import java.util.Scanner;

public class Order {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildNode(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildNode(nodes);
            newNode.right = buildNode(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();

        int nodes[] = new int[s];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                nodes[i] = sc.nextInt();
            }
        }
        Node root = BinaryTree.buildNode(nodes);

        System.out.println("The root of the tree is : " + root.data);

        System.out.print("PreOrder : ");
        preOrder(root);
        System.out.print("\nInOrder : ");
        inOrder(root);
        System.out.print("\nPostOrder : ");
        postOrder(root);

        sc.close();
    }
}