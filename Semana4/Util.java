package Semana4;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

<<<<<<< HEAD
import poo_Avanzada.Perro;
=======
import poo_Avanzada.Animal;
>>>>>>> 28b39a5d0b4cd9a9f345093094b73034d3c11b94

public class Util {
  /*
   * public static <T extends Comparable<T>> T maximo(T a, T b) {
   * return a.compareTo(b) > 0 ? a : b;
   * }
   */
  public static <T extends Comparable<T>> T encontrarMaximoEnLista(List<T> lista) {
    if (lista == null || lista.isEmpty())
      return null;

    T max = lista.get(0);

    for (int i = 1; i < lista.size(); i++) {
      T actual = lista.get(i);

      if (actual.compareTo(max) > 0) {
        max = actual;
      }

    }
    return max;
  }

  public static <T> void intercambiarElementos(List<T> lista, int i, int j) {
    // implementación...
  }

<<<<<<< HEAD
  public static void llenarConPerros(List<? super Perro> lista) {
    lista.add(new Perro("Maricucha", "criolla"));
    lista.add(new Perro("Pancho", "Mestizo"));
=======
  public static void imprimirLista(List<?> lista) {
    for(Object element : lista) {
      System.out.println(element);
    }
  }

  public static void mostrarTiposEnLista(List<?> lista) {
    for(Object elm: lista) {
      System.out.println(elm + " - " + elm.getClass().getSimpleName());
    }
  }

    public static void mostrarNombresDeAnimales(List<? extends Animal> lista) {
    for(Animal a: lista){
      a.presentarse();
    }
>>>>>>> 28b39a5d0b4cd9a9f345093094b73034d3c11b94
  }
}
