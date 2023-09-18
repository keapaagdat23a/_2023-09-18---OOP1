package hellomyobject;

public class Run {
  public static void main(String[] args) {
    new Run().run();
  }

  private void run() {
    MyObject object1 = new MyObject();
    object1.color = "Red";
    object1.size = 42;

    MyObject object2 = new MyObject();
    object2.color = "Green";
    object2.size = 56;

    printObjects(object1, object2);

    object1.color = "Purple";
    object1.size = 210;

    printObjects(object1, object2);
  }

  private void printObjects(MyObject object1, MyObject object2) {
    System.out.println();
    System.out.println("Object 1 size: " + object1.size);
    System.out.println("Object 1 color: " + object1.color);
    System.out.println("Object 2 size: " + object2.size);
    System.out.println("Object 2 color: " + object2.color);
  }
}
