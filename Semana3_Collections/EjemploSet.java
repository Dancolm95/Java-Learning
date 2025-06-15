package Semana3_Collections;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
  public static void main(String[] args) {
    Set<String> frutas = new HashSet<>();
    frutas.add("manzana");
    frutas.add("naranja");
    frutas.add("plátano");
    frutas.add("manzana");

    System.out.println("Frutas: " + frutas);
    System.out.println("Contiene naranja?: " + frutas.contains("naranja"));
    System.out.println("Tamaño del conjunto: " + frutas.size());
  }
}
