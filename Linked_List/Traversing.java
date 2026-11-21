package Linked_List;

class Node {
  Node next;
  int data;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Traversing {
  public static void main(String[] args) {
    // Creating 5 Node
    Node first = new Node(100);
    Node second = new Node(200);
    Node third = new Node(300);
    Node fourth = new Node(400);
    Node fifth = new Node(500);

    // set References :
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    // set head :
    Node head = first;

    // temp for traversing
    Node temp = head;

    // traverse nodes using loop
    while (temp.next != null) {
      temp = temp.next;
      System.out.print(temp.data + "-->");
    }
    System.out.print("NULL");
  }
}
