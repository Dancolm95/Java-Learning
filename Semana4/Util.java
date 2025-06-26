package Semana4;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import poo_Avanzada.Animal;
import poo_Avanzada.Perro;

public class Util {
  
   public static <T extends Comparable<T>> T maximo(T a, T b) {
   return a.compareTo(b) > 0 ? a : b;
   }
  

  // encontrar el maximo en una lista
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

  // Imprimir valir y tipo con <?>
  public static void mostrarTiposEnLista(List<?> lista) {
    for (Object elem : lista) {
      System.out.println(elem + " - " + elem.getClass().getSimpleName());
    }
  }

  // Leer animales de una lista de subtipos (<? extends Animal>)
  public static void mostrarNombresDeAnimales(List<? extends Animal> lista) {
    for (Animal a : lista) {
      a.presentarse();
    }
  }

  // Agregar perros a una lista de supertypes (<? super Perro>)
  public static void llenarConPerros(List<? super Perro> lista) {
    lista.add(new Perro("Maricucha", "criolla"));
    lista.add(new Perro("Pancho", "mestizo"));
  }
}
