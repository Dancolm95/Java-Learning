package Semana3_Excepciones;

public class Main {
  public static void main (String[] args) {
    // DivisionExcepcion nuevoObj = new DivisionExcepcion(10, 5);
    // double Resultado = nuevoObj.Division();
        int a = 10;
        int b = 8;
    try {
      if (b == 0 ) {
        throw new ArithmeticException("No se puede dividir entre cero");
      }

      DivisionExcepcion obj = new DivisionExcepcion(a, b);
      double resultado = obj.Division();

      System.out.println("El resultado de dividir ambos numeros es : "+ resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
