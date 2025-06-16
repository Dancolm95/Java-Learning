package Semana3_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class OrdenPersonalizado {
  public static void main(String[] args) {
    String[] palabras = {"java", "orden", "arbol", "set", "estructura", "codigo", "if"};

    //Definiendo el comparador, primero longitud desc luego alfabetico
    Comparator<String> comparadorPorLongitud = (a, b) -> {
      if (b.length() != a.length()) {
        return Integer.compare(b.length(), a.length());
      } else {
        return a.compareTo(b);
      }
    };

    Set<String> palabrasOrdenadas = new TreeSet<>(comparadorPorLongitud);
    for (String palabra: palabras) {
      palabrasOrdenadas.add(palabra);
    }

    System.out.println("Palabras ordenadas por longitud (desc): ");
    for (String palabra: palabrasOrdenadas) {
      System.out.println(palabra);
    }
  }
}
