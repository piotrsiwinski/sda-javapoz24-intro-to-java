package zajecia1;

public class KonwerterTemperatury {
  public static void main(String[] args) {
    double bmi = 26.5;

//    18,5 > bmi < 25

    if (bmi > 18.5 && bmi < 25){
      System.out.println("WAGA OK - waga w normie");
    } else {
      System.out.println("Zly wynik - waga za duza, badz za mala");
    }



    // < 18,5       -> niedowaga
    // 18,5–24,99   -> WAGA OK
    // 25,0–29,99   -> Nadwaga
    // > 30         -> otyłość



  }
}
