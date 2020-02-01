package zajecia5;

public class WstepDoObiektowProgram {
  // pierwsze przykłady tworzenia obiektow

  public static void main(String[] args) {

    // "student" jest obiektem typu Osoba
    //  new Osoba(); ---->  wywołanie konstruktora bezparametrowego klasy Osoba
    Osoba student = new Osoba();
    student.imie = "Piotr";
    student.nazwisko = "Nowak";
    student.wiek = 30;
    student.wzrost = 1.80;
    student.waga = 80;

    // "uczen" jest obiektem typu Osoba
    Osoba uczen = new Osoba();


    // odczyt pola
    String a = student.imie;
    System.out.println("Wartość pola to: " + a);

    // szybszy, preferowany zapis
    System.out.println("Nazwisko studenta to: " + student.nazwisko);
    System.out.println(student.waga);

    // wartosci drugiego obiektu - wartości ucznia
    System.out.println("uczen.imie:   " + uczen.imie);
    System.out.println("uczen.naziwsko:   " + uczen.nazwisko);
    System.out.println("uczen.wiek:   " + uczen.wiek);


    // zmiana nazwiska studenta
    System.out.println("Po zmianie nazwiska u studenta");
    student.nazwisko = "AAAAAAAAAAAAAAAAAAAAA";
    System.out.println(student.nazwisko);
    System.out.println(uczen.nazwisko);

    // Tworzymy obiekty z użyciem konstruktora parametrowego
    Osoba pracownik = new Osoba("Anna", "Adamiak", 28);
    System.out.println(pracownik.imie);
    System.out.println(pracownik.nazwisko);
    System.out.println(pracownik.wiek);
  }
}
