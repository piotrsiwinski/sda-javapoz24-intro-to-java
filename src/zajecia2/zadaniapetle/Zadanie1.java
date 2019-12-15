package zajecia2.zadaniapetle;


// program ktory wypisuje wszystkie liczby parzyste z zakresu 1 - 100
public class Zadanie1 {

  public static void main(String[] args) {

    // wersja 1
    System.out.println("Parzyste liczby od 0 - 100 - wersja 1 - petla for ");
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.print(i + ", ");
      }
    }


    // -----------------------------------------------------------
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Parzyste liczby - wersja 2 - petla for");

    for (int i = 2; i <= 100; i += 2) {
      System.out.print(i + ", ");
    }


    // wypisać liczby nieparzyste 0 - 100 w odwrotnej kolejnosci
    // 99, 97, 95, 93, 91...
    System.out.println();
    for (int i = 99; i > 0; i -= 2) {
      System.out.print(i + ", ");
    }


    // zadanie 3 - suma liczb od 0 do 100;

    int suma = 0;
    for (int i = 0; i <= 100; i++) {
      suma += i;
      // alternatywnie:
      // suma = suma + i;
    }
    System.out.println();
    System.out.println("suma liczb od 0 - 100: " + suma);

  }
}
