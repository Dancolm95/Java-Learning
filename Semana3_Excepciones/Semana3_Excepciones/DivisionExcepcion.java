package Semana3_Excepciones;

public class DivisionExcepcion {
  double a = 0;
  double b = 0;

  public DivisionExcepcion(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double Division() {
    return a / b;
  }
}
