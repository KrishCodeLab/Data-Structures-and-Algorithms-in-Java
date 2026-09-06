public class Loops_All {
  public static void main(String[] args) {
    // Loops in java

    // while loop :- Entry controlled , checks condition before execution ,
    // initialization outside the loop ,
    // updation inside loop , best for unknown repetitions

    // Use while loop when you don't know exactly how many times the operations will
    // happen.

    // print 1 to 100
    int i = 0;
    while (i <= 100) {
      // System.out.println(i);
      i++;
    }

    int n = 0;
    // print even numbers between 1 to 20
    while (n <= 20) {
      // System.out.println(n);
      n = n + 2;
    }

    // print your name 10 times
    int count = 0;
    while (count <= 5) {
      System.out.println("Krishna!!!");
      count++;
    }

    // for loop :- Entry controlled , checks condtion before
    // exectution,initialization within loop declaration also upadtion.

    // print 1 to 10
    for (int a = 0; a < 5; a++) {
      // System.out.println(a);
    }

    // print a to z
    for (char ch = 'a'; ch <= 'z'; ch++) {
      // System.out.println(ch);
    }

    // do while :- Exit controlled , Initialize outside loop , updation inside the
    // loop
    int k = 0;
    do {
      System.out.println(k);
      k++;
    } while (k <= 100);

  }
}
