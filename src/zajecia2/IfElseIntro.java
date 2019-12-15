package zajecia2;

import java.util.Scanner;

public class IfElseIntro {

  public static void main(String[] args) {

    Scanner czytnik = new Scanner(System.in);
    System.out.println("Podaj swoj wiek");
    int wiek = czytnik.nextInt();

    if (wiek >= 18) {
      System.out.println("Jestes pelnoletni");
    } else {
      System.out.println("Nie jestes pelnoletni");
    }

    System.out.println("Koncze prace...");

  }
}
