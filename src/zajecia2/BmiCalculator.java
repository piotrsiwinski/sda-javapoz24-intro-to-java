package zajecia2;

import java.util.Scanner;

// < 18,5       -> niedowaga
// 18,5–24,99   -> WAGA OK
// 25,0–29,99   -> Nadwaga
// > 30         -> otyłość

public class BmiCalculator {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);

    System.out.println("Podaj swoja wage: ");
    double waga = czytnik.nextDouble();
    System.out.println("Podaj swoj wzrost [w metrach]");
    double wzrost = czytnik.nextDouble();

    double bmi = waga / Math.pow(wzrost, 2);
    // wersja bez Math.pow() :
    // double bmi2 = waga / (wzrost * wzrost); // ważny jest nawias w wyrazeniu wzrost * wzrost

    System.out.println("Twoje BMI wynosi: " + bmi);

    if (bmi < 18.5) {
      System.out.println("Waga zbyt niska");
    } else if (bmi < 25) {
      System.out.println("Waga ok");
    } else if (bmi < 30) {
      System.out.println("Nadwaga");
    } else {
      System.out.println("Otyłość");
    }

    System.out.println("Koniec programu...");

  }
}
