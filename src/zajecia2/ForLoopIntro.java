package zajecia2;

public class ForLoopIntro {
  public static void main(String[] args) {

//    System.out.println(imie);
    String imie = "Piotr";
    System.out.println(imie);

    for (int i = 0; i < 10; i++) {
      String nazwisko = "Kowalski";
      System.out.println(nazwisko);
      System.out.println(i);
      System.out.println(imie);
    }
//    System.out.println(nazwisko); // zmienna nazwisko widoczna tylko w ciele for - taki ma zasięg

    for (int i = 10; i < 20; i++) {
      System.out.print(i);
      System.out.println(imie);
    }

    System.out.println(imie);
    System.out.println("Koniec programu...");

  }
}
