package Semana3_Wrappers;

public class PromedioConWrappers {
  public static void main(String[] args) {
    int suma = 0;
    Integer[] numeros = {10, 11, 20};

  for (int num: numeros) {
    suma += num;
  }
  double promedio = (double)suma / numeros.length;

  System.out.println("resultado: "+ suma);
  System.out.println("El promedio de el array es "+ promedio);
  }
}
