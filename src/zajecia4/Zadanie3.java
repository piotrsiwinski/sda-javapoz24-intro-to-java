package zajecia4;

import java.util.Random;

public class Zadanie3 {
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
      for (int j = 0; j < macierz[0].length; j++) {
        System.out.print(macierz[i][j] + ", ");
      }
      // po wypisaniu całego wiersza przejdź do nowej linii
      System.out.println();
    }

  }
}
