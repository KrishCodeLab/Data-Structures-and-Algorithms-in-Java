package Linked_List;

class Node {
  Node next;
  int data;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Count_Nodes {
  public static void main(String[] args) {

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

    // counter to count number of nodes in Linked List
    int counter = 0;

    // traverse nodes using loop
    while (temp != null) {

      System.out.print(temp.data + "-->");
      temp = temp.next;
      counter++;
    }
    System.out.print("NULL");

    System.out.println();
    System.out.println("Number of Nodes count : " + counter);

  }

}
