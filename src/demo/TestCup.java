package demo;

public class TestCup {
  public static void main(String[] args) {
    new TestCup().run();
  }

  private void run() {
    // Cup coffeeCop;
    Cup cup = new Cup();
    cup.color = "Yellow";
    cup.sizeMl = 300;

    System.out.println(cup); // demo.Cup@7b23ec81
    System.out.println(cup.sizeMl + ", " + cup.color);

    System.out.println();
    System.out.println(cup);
  }

}
