package Semana3_Collections;

public class ContadorPalabras {
  public static void main(String[] args) {
    String oracion = "hola mundo hola java mundo java java";
    String[] palabras = oracion.split(" ");
    for (String palabra: palabras) {
      System.out.println(palabra);
    }
  }
  
}
