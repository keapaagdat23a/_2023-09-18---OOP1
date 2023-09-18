package demo.objectreferences;

public class ObjectReferencesDemo {
  public static void main(String[] args) {
    new ObjectReferencesDemo().run();
  }

  private void run() {
    int numA = 5;
    int numB = 7;
    printNums(numA, numB);

    numB = numA;
    printNums(numA, numB);

    Lion leo = new Lion();
    Lion leona = new Lion();
    leo.name = "Leo";
    leo.age = 8;
    leona.name = "Leona";
    leona.age = 31;
    printLions(leo, leona);

    leo = leona; // This copies  the REFERENCE - not the object with its attributes!
    printLions(leo, leona);

    leo.name = "LEON";
    leo.age++;
    printLions(leo, leona);
  }

  private void printLions(Lion l1, Lion l2) {
    System.out.println("Lion 1:" + l1 + "\nLion 2: " + l2);
  }

  void printNums(int a, int b) {
    System.out.printf("A: %d%nB: %d%n", a, b);
  }
}
