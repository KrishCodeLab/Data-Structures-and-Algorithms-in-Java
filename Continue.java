public class Continue {
  public static void main(String[] args) {
    // Continue :- To skip an iteration,TO jump next iteration and skips ongoing
    // iteration

    for (int i = 0; i <= 20; i++) {

      if (i == 11) {
        continue;
      } else {
        System.out.println(i);
      }
    }
  }
}
