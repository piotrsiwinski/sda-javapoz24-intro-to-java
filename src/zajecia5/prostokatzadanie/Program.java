package zajecia5.prostokatzadanie;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj wymiary prostokata 1");
    int a = sc.nextInt();
    int b = sc.nextInt();

    Prostokat p1 = new Prostokat(a, b);
    p1.setBokA(-15);








    System.out.println("Podaj wymiary prostokata 2");
    a = sc.nextInt();
    b = sc.nextInt();

    Prostokat p2 = new Prostokat(a, b);

    System.out.println("Podaj wymiary prostokata 3");
    a = sc.nextInt();
    b = sc.nextInt();

    Prostokat p3 = new Prostokat(a, b);

    System.out.println("Pole p1: " + p1.obliczPole());
    System.out.println("Obwod p1: " + p1.obliczObwod());

    System.out.println("Pole p2: " + p2.obliczPole());
    System.out.println("Obwod p2: " + p2.obliczObwod());

    System.out.println("Pole p3: " + p3.obliczPole());
    System.out.println("Obwod p3: " + p3.obliczObwod());

  }
}
