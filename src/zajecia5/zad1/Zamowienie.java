package zajecia5.zad1;

public class Zamowienie {
  private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;
  private Pozycja[] pozycje;
  private int ileDodanych;
  private int maxRozmiar;


  // konstruktor bezparametrowy moze sluzyc do ustawienia wartości domyślnych
  // wywołujemy konstruktor parametrowy przekazujac domyslny rozmiar zamowienia
  public Zamowienie() {
    this(DOMYSLNY_ROZMIAR_ZAMOWIENIA);
  }

  public Zamowienie(int maxRozmiar) {
    this.maxRozmiar = maxRozmiar;
    pozycje = new Pozycja[maxRozmiar];
  }

  public void dodajPozycje(Pozycja poz) {
    if (this.ileDodanych >= maxRozmiar) {
      System.out.println("Nie mozna dodac zamownienia - osiagnieto max rozmiar");
    } else {
      this.pozycje[ileDodanych] = poz;
      ileDodanych++;

      //      lub w 1 linijce
      //      this.pozycje[ileDodanych++] = p;
    }
  }

  public double obliczWartosc() {
    double wartoscZamowienia = 0;
    for (Pozycja p : pozycje) {
      if (p != null) {
        wartoscZamowienia += p.obliczWartosc();
      }
    }
    return wartoscZamowienia;
  }

  public String toString() {
    String result = "Zamowienie: \n";
    for (int i = 0; i < ileDodanych; i++) {
      result += pozycje[i].toString() + "\n";
    }
    return result;
  }
}
