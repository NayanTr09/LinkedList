package com.simplelinkedlist;

public class LinkedListMain {
    public static void main(String[] args)
    {
        Node head = null;
        LinkedList llist = new LinkedList();
        llist.push(70);
        llist.push(30);
        llist.push(56);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.append(56);
        llist.append(30);
        llist.append(70);

        llist.insertAfter(llist.head.next, 8);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.deleteNode(56); // Delete node with data 1

        System.out.println(
                "\nLinked List after Deletion of 1:");
        llist.printList();
    }
}
