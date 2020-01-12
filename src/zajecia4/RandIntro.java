package zajecia4;


import java.util.Random;

// http://www.jkozak.pl/przedmioty/java/zadania3.pdf
public class RandIntro {

  public static void main(String[] args) {
    Random rand = new Random();

    int losowaLiczba = rand.nextInt(10); // zakres: 0 - 9

    int losowaLiczba2 = rand.nextInt(10) + 1; // zakres: 1 - 10


    int[][] macierz = new int[3][5];
    // tablica 3 elementowa, w której każdym elementem jest tablica 5 elementowa
    // liczba wierszy x liczba kolumn

    for (int i = 0; i < macierz.length; i++) {
      for (int j = 0; j < macierz[0].length; j++) {
        int i1 = rand.nextInt(10);
        System.out.println(i1);
        macierz[i][j] = i1;
      }
    }

    for (int i = 0; i < macierz.length; i++) {
      for (int j = 0; j < macierz[0].length; j++) {
        System.out.print(macierz[i][j] + " ");
      }
      System.out.println();
    }

  }
}
