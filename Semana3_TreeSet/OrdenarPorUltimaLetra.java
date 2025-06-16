package Semana3_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class OrdenarPorUltimaLetra {
  public static void main(String[] args) {
    String[] palabras = {"cielo", "manzana", "perro", "libro", "sol", "piano", "luz"};
    //Comparador por ultioma letra
    Comparator<String> comparadorPorUltimaLetra = (a, b) -> {
      char ultimaA = a.charAt(a.length() -1);
      char ultimaB = b.charAt(b.length() -1);

      if (ultimaA != ultimaB) {
        return Character.compare(ultimaA, ultimaB);
      } else {
        return a.compareTo(b);
      }
    };
    Set<String> palabrasOrdenadas = new TreeSet<>(comparadorPorUltimaLetra);
    for (String palabra: palabras) {
      palabrasOrdenadas.add(palabra);
    }
    System.out.println("Palabras ordenadas por ultima letra: ");
    for (String palabra: palabrasOrdenadas) {
      System.out.println(palabra);
    }
  }
}
