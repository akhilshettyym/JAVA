package akhilshettyym.JAVA.DSA.LinkedList;

public class LinkedListt {
    Node head;
    private int size;

    LinkedListt() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // -----------------------------------------------------------------------------------
    // addFirst
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // -----------------------------------------------------------------------------------
    // DeleteFirst
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // DeleteLast
    public void DeleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    // -----------------------------------------------------------------------------------
    //SIZE
    public int getSize() {
        return size;
    }
    // -----------------------------------------------------------------------------------
    // Print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // -----------------------------------------------------------------------------------

    public static void main(String[] args) {
        LinkedListt list = new LinkedListt();
        list.addFirst("Linked");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();

        list.addLast("List");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.DeleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}

/*
 * When Insertion - LinkedList, When Search - ArrayList
 * Variable size, Non-contiguous Memory
 * Insert in O(1), Search in O(n)
 */