package Semana3_Excepciones;

public class MultiplesExcepciones {
  public static void main(String[] args) {
    try {
      int a = 10;
      int b = 2;

      int resultado = a / b;
      
       int[] numeros = {1, 2, 3};
      System.out.println(numeros[5]);
    } catch (ArithmeticException e){
      System.out.println("Error: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: "+ e.getMessage());
    }finally {
      System.out.println("Programa finalizado.");
    }
  }
}
