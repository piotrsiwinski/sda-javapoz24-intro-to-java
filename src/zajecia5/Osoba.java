package zajecia5;

public class Osoba {

  // pola w klasie
  public String imie;
  public String nazwisko;
  public int wiek;
  public double wzrost;
  public double waga;


  // konstruktor bezparametrowy
  // jesli nie ma zadnego konstruktora to pusty konstruktor jest generowany automatycznie
  // jesli zdefiniujemy JAWNIE konstruktor parametrowy, to ten konstruktor juz nie jest generowany automacztycznie
  // jesli potrzebujemy domyślnego konstruktora to musimy go zdefiniować JAWNIE
  // jesli usuniemy ten konstruktor to będziemy musieli zawsze tworzyc obiekty osoba
  // za pomocą konstruktora 3 arugmentowego
  public Osoba() {
    System.out.println("Tworze obiekt typu osoba...");
  }

  public Osoba(String imie, String nazwisko, int w) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    // trzeci parametr nazywa sie inaczej niż pole, wiec this.wiek nie potrzebne
    // mozna od razu wiek = w;
    wiek = w;
  }


}

