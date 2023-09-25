package arraysagain;

import java.util.ArrayList;
import java.util.Random;

public class ArrayDemo {
  public static void main(String[] args) {
    new ArrayDemo().run();
  }

  private void run() {
    int[] numbers = new int[10];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++)
      // numbers[i] = 'A' + i;
      numbers[i] = random.nextInt(3) + 1;

    int countTwos = 0;
    int count = 0;
    int sum = 0;
    int[] appearancesOfTwo = new int[10];
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
      System.out.print(numbers[i]);
      if (numbers[i] == 2) {
        System.out.print(" IS TWO!");
        appearancesOfTwo[countTwos++] = i;
        count++;
      }
      System.out.println();
    }
    System.out.println("COUNT: " + count);
    System.out.println("SUM = " + sum);
    System.out.println("AVG = " + ((double)sum / numbers.length));

    System.out.println("Wonderings where those twos were:");
    for (int i = 0; i < countTwos; i++)
      System.out.println(appearancesOfTwo[i]);

    // WRONG:
    int average = sum / numbers.length;

    double kommatal = 3.8;

    System.out.println(Math.round(kommatal));
    System.out.println(0);
  }
}
