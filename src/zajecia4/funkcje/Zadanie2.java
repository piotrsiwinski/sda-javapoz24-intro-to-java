package zajecia4.funkcje;

import java.util.Scanner;

public class Zadanie2 {


  static String reverseString(String text) {
    String result = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      result = result + text.charAt(i);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj napis: ");
    String napis = scanner.nextLine();

    String text = reverseString(napis);

    System.out.println("Nowy napis to: " + text);
  }
}
