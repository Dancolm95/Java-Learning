package poo_Avanzada;

public class Matematicas {
  public static class OperacionesBasicas {
    public static int sumar(int a, int b) {
      return (a + b);
    }

    public static int restar(int a, int b) {
      return (a - b);
    }

    public static int dividir(int a, int b) {
      return (a / b);
    }

    public static int multiplicar(int a, int b) {
      return (a * b);
    }

    public static class OperacionesAvanzadas {
      
    }
    public static void main(String[] args) {
      int suma = Matematicas.OperacionesBasicas.sumar(10, 5);
      int restar = Matematicas.OperacionesBasicas.restar(10, 5);
      int multiplicar = Matematicas.OperacionesBasicas.multiplicar(10, 5);
      int dividir = Matematicas.OperacionesBasicas.dividir(10, 5);

      System.out.println("Suma: " + suma);
      System.out.println("Resta: " + restar);
      System.out.println("Multiplicar: " + multiplicar);
      System.out.println("Dividir: " + dividir);
    }
  }
}
