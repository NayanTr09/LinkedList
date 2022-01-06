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
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.insertAfter(llist.head.next, 8);
        System.out.println("\nCreated Linked list is: ");
        llist.printList();

        llist.deleteNode(70); // Delete node with data 1

        System.out.println(
                "\nLinked List after Deletion :");
        llist.printList();

        if (llist.search(llist.head, 30))
            System.out.println(" \n Yes. Element is Found");
        else
            System.out.println("\n No. Element is not found");
    }
}
