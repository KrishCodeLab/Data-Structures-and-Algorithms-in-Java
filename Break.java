public class Break {
  public static void main(String[] args) {
    // Break :- Terminates loop after any particular condition satisfied.
    for (int i = 0; i < 10; i++) {
      if (i == 6) {
        System.out.println("The 6 number terminates loop..");
        break;

      } else {
        System.out.println(i);
      }
    }
  }
}
