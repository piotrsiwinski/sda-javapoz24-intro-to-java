package zajecia4;

import java.util.Random;

public class Zadanie3 {
  public static void main(String[] args) {
    int[][] macierz = new int[3][5];


    System.out.println("Liczba wierszy: " + macierz.length); // zwraca liczbę wierszy
    System.out.println("Liczba kolumn: " + macierz[0].length); // zwraca liczbę kolumn

    Random r = new Random();
    // wypełnianie macierzy wartosciami losowymi
    for (int i = 0; i < macierz.length; i++) {
      for (int j = 0; j < macierz[0].length; j++) {
        macierz[i][j] = r.nextInt(10);
      }
    }

    // wyświetlanie macierzy:


    for (int i = 0; i < macierz.length; i++) {
      for (int j = 0; j < macierz[0].length; j++) {
        System.out.print(macierz[i][j] + ", ");
      }
      // po wypisaniu całego wiersza przejdź do nowej linii
      System.out.println();
    }

    // szukanie Maximum w wierszach
    int[] maxWWierszach = new int[macierz.length];
    for (int i = 0; i < macierz.length; i++) {
      int max = macierz[i][0];
      for (int j = 0; j < macierz[0].length; j++) {
        // w petli wewnetrzenej przechodzimy cały wiersz, tutaj szukamy max
        if (max < macierz[i][j]) {
          max = macierz[i][j];
        }
      }
      // po przejsciu calego wiersza znalezlismy maxa, wiec wpisujemy go do tablicy
      maxWWierszach[i] = max;
    }

    // wyswietlanie max w wierszach
    System.out.println("Maksymalne wartości w wierszach: ");
    for (int wWierszach : maxWWierszach) {
      System.out.print(wWierszach + ", ");
    }



  }
}
