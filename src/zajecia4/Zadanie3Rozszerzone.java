package zajecia4;

import java.util.Random;

// zadanie z szukaniem max w wierszach i kolumnach - rozszerzone...
public class Zadanie3Rozszerzone {
  public static void main(String[] args) {
    int[][] macierz = new int[3][5];


    System.out.println(macierz.length); // zwraca liczbę wierszy
    System.out.println(macierz[0].length); // zwraca liczbę kolumn

    Random r = new Random();
    // wypełnianie macierzy wartosciami losowymi
    for (int i = 0; i < macierz.length; i++) {
      for (int j = 0; j < macierz[0].length; j++) {
        macierz[i][j] = r.nextInt(10);
      }
    }

    // wyświetlanie macierzy:
    int[] maxWWierszach = new int[macierz.length];

    for (int i = 0; i < macierz.length; i++) {
      int max = macierz[i][0];
      for (int j = 0; j < macierz[0].length; j++) {
        if (max < macierz[i][j]) {
          max = macierz[i][j];
        }
        System.out.print(macierz[i][j] + ", ");
      }
      maxWWierszach[i] = max;
      // po wypisaniu całego wiersza przejdź do nowej linii
      System.out.println();
    }

    System.out.println("Max w wierszach: ");
    for (int wWierszach : maxWWierszach) {
      System.out.print(wWierszach + ", ");
    }


    System.out.println();
    System.out.println();
    // przejscie po kolumnach
    int[] maxWKolumnach = new int[macierz[0].length];
    for (int i = 0; i < macierz[0].length; i++) {
      int max = macierz[0][i];
      System.out.print(max + " - max        ");
      for (int j = 0; j < macierz.length; j++) {
        if (max < macierz[j][i]) {
          max = macierz[j][i];
        }
        System.out.print(macierz[j][i] + ", ");
      }
      maxWKolumnach[i] = max;
      System.out.println();
    }
    System.out.println("Max w kolumnach: ");
    for (int wWierszach : maxWKolumnach) {
      System.out.print(wWierszach + ", ");
    }

  }
}
