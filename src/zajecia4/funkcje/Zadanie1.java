package zajecia4.funkcje;

import java.util.Scanner;

//http://www.jkozak.pl/przedmioty/java/zadania4.pdf
public class Zadanie1 {

  static int countLastLetter(String text) {
    // pobieramy ostatnia litere w napisie
    text = text.toLowerCase();
    char lastLetter = text.charAt(text.length() - 1);
    int counter = 0;

    for (int i = 0; i < text.length(); i++) {
      char litera = text.charAt(i);
      if (lastLetter == litera) {
        // jezeli ostatnia litera (lastLetter) zgadza się z aktualną literą (letter)
        // to zwiększ licznik
        counter++;
      }
    }
    return counter;
  }
  

  public static void main(String[] args) {
    System.out.println("Podaj dowolny napis, a ja policzę ilość wystąpień ostatniej litery");
    Scanner scanner = new Scanner(System.in);

    String napis = scanner.nextLine();

    // wywołujemy funkcję

    int liczbaWystapien = countLastLetter(napis);

    System.out.println("Ostatnia litera w wyrazie wystapila " + liczbaWystapien + " razy");

  }

}
