package Linked_List;

class Node {
  Node next;
  int data;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Inroduction {

  public static void main(String[] args) {
    // Introduction to Linked List
    // What is Linked List ?
    // A LL is linear data structure in which elements are stored in separate
    // objects called nodes.
    // Node contains two parts :
    // Data and next :
    // Data : Stores actual data
    // Next : Reference of next
    // last node always points null
    Node first = new Node(100);
    Node second = new Node(200);
    Node third = new Node(300);
    Node fourth = new Node(400);

    first.next = second;
    second.next = third;
    third.next = fourth;

    System.out.println(first.data);
    System.out.println(first.next.data);
    System.out.println(first.next.next.data);
    System.out.println(first.next.next.next.data);

  }
}
