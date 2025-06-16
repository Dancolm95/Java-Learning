package Semana3_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class DefinirArreglo {
  public static void main(String [] args) {
    String[] palabras = {"java", "orden", "arbol", "java", "estructura", "set", "arbol"};
    Set<String> palabrasOrdenadas = new TreeSet<>();

    for(String palabra: palabras) {
      palabrasOrdenadas.add(palabra);
    }

    System.out.println(palabrasOrdenadas);
  }
}
