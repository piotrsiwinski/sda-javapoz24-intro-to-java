package zajecia5.prostokatzadanie;

public class Prostokat {
  private int bokA;
  private int bokB;

  public Prostokat(int bokA, int bokB) {
    this.bokA = bokA;
    this.bokB = bokB;
  }

  public int obliczPole() {
    return bokA * bokB;
  }

  public int obliczObwod() {
    return 2 * bokA + 2 * bokB;
  }

  // getter i setter - dla pola bokA

  // metoda gettera - zwraca wartość pola (nie przyjmuje argumentów)
  public int getBokA() {
    return this.bokA;
  }

  // metoda setter'a - nic nie zwraca, ustawia wartość przekazaną jako parametr
  public void setBokA(int bokA) {
    if (bokA > 0) {
      this.bokA = bokA;
    } else {
      throw new IllegalArgumentException("Bok musi byc wiekszy od 0!!");
    }
  }

  // getter i setter dla pola bokB
  public int getBokB() {
    return bokB;
  }

  public void setBokB(int bokB) {
    this.bokB = bokB;
  }
}
