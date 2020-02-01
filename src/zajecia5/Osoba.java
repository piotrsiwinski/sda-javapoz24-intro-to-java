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

  // definicja metody do opisu Osoby
  public String przedstawSie() {
    return "Na imię mam " + this.imie + ", nazywam się " + this.nazwisko + " i mam " + wiek + " lat.";
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public int getWiek() {
    return wiek;
  }

  public void setWiek(int wiek) {
    this.wiek = wiek;
  }

  public double getWzrost() {
    return wzrost;
  }

  public void setWzrost(double wzrost) {
    this.wzrost = wzrost;
  }

  public double getWaga() {
    return waga;
  }

  public void setWaga(double waga) {
    this.waga = waga;
  }
}

