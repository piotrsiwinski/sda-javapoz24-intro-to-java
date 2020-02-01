package zajecia5.prostokatzadanie;

public class Prostokat {
  public int bokA;
  public int bokB;

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


}
