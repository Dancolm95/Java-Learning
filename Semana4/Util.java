package Semana4;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
}
