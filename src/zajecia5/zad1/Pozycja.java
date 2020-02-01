package zajecia5.zad1;

public class Pozycja {
  private String nazwaTowaru;
  private int ileSztuk;
  private double cena;

  public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
    this.nazwaTowaru = nazwaTowaru;
    this.ileSztuk = ileSztuk;
    this.cena = cena;
  }

  public String getNazwaTowaru() {
    return nazwaTowaru;
  }

  public void setNazwaTowaru(String nazwaTowaru) {
    this.nazwaTowaru = nazwaTowaru;
  }

  public int getIleSztuk() {
    return ileSztuk;
  }

  public void setIleSztuk(int ileSztuk) {
    this.ileSztuk = ileSztuk;
  }

  public double getCena() {
    return cena;
  }

  public void setCena(double cena) {
    this.cena = cena;
  }

  public double obliczWartosc() {
    return cena * ileSztuk;
  }

  public String toString() {
    return this.nazwaTowaru + "   " + cena + " zł " + ileSztuk + " szt. " + obliczWartosc() + " zł.";
  }
}
