package Linked_List;

import java.util.*;

class Node {
  Node next;
  int data;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter key to search : ");
    int key = sc.nextInt();

    // Creating nodes
    Node first = new Node(100);
    Node second = new Node(200);
    Node third = new Node(300);
    Node fourth = new Node(400);
    Node fifth = new Node(500);
    Node sixth = new Node(600);
    Node seventh = new Node(700);
    Node eigth = new Node(800);
    Node ninth = new Node(900);
    Node tenth = new Node(1000);

    // set References :
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    seventh.next = eigth;
    eigth.next = ninth;
    ninth.next = tenth;

    // set head :
    Node head = first;

    // temp for traversing
    Node temp = head;

    // counter to count node number
    int counter = 0;
    boolean isPresent = false;
    // traverse nodes using loop
    while (temp != null) {
      if (temp.data == key) {
        counter++;
        isPresent = true;
        System.out.println("The Node found  at :) " + counter);
        ;
        break;
      }
      temp = temp.next;
      counter++;
    }
    if (isPresent == false) {
      System.out.println("The Node not exist :| ");
    }

    sc.close();
  }
}
