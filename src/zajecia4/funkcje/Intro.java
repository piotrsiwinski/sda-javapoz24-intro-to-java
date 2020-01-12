package zajecia4.funkcje;

public class Intro {

  // prosta funkcja pobierająca 2 argumenty i zwracająca ich sumę
  // funkcje / metody definiujemy w ciele KLASY, a więc nie w mainie

  static int dodaj(int a, int b) {
    return a + b;
  }

  // funkcja która nic nie zwraca, ale wypisuje zawartosc tablicy

  static void printArray(String[] array) {
    System.out.print("[ ");
    for (String i : array) {
      System.out.print(i + ", ");
    }
    // kasujemy ostatni przecinek
    // na przyszłość: eleganckie rozwiązanie z użyciem StringBuilder
    System.out.print('\b');
    System.out.print('\b');

    System.out.print(" ]");
  }

  // funkcja do obliczania n-tego wyrazu ciągu fibonacciego

  static int fibonacci(int n) {
    int fib1 = 1;
    int fib2 = 1;
    int suma = 0;
    for (int i = 3; i <= n; i++) {
      suma = fib1 + fib2;
      fib1 = fib2;
      fib2 = suma;
    }
    return suma;
  }


  public static void main(String[] args) {
    int pierwszaLiczba = 10;
    int drugaLiczba = 20;

    int wynik = dodaj(pierwszaLiczba, drugaLiczba);
    System.out.println("Wynik dodawania to: " + wynik);


    //

    String[] imiona = {"Jan", "Tomek", "Piotr"};
    printArray(imiona);

    // wywolaj funkcję fibonacci
    System.out.println();
    int liczba = fibonacci(10);
    System.out.println("fibonacci(10) to: " + liczba);
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(6));
    System.out.println(fibonacci(7));

  }
}
