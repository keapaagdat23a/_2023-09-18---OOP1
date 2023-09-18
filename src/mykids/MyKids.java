package mykids;

import java.time.LocalDateTime;

public class MyKids {
  Kid kid1;
  Kid kid2;
  Kid kid3;

  public static void main(String[] args) {
    new MyKids().run();
  }

  private void run() {
    initKids();
    printKids();
    changeKidsData();
    System.out.println("\nChanged kids:");
    printKids();
  }

  void initKids() {
    kid1 = new Kid();
    kid1.name = "Alice";
    kid1.yearOfBirth = 2010;

    kid2 = new Kid();
    kid2.name = "Beth";
    kid2.yearOfBirth = 2015;

    kid3 = new Kid();
    kid3.name = "Carrie";
    kid3.yearOfBirth = 2020;
  }

  void printKids() {
    printKid(kid1);
    printKid(kid2);
    printKid(kid3);
  }

  void changeKidsData() {
    System.out.println("\nChanging Carrie's name to Coco.");
    kid3.name = "Coco";
    printKid(kid3);

    System.out.println("\nChanging Coco's birthyear to one year earlier.");
    kid3.yearOfBirth--;
    printKid(kid3);
  }

  private void printKid(Kid kid) {
    System.out.println(kid); // kid.toString() is optional in a print statement
  }
}
