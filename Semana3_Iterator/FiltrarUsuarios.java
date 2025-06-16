package Semana3_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FiltrarUsuarios {
  public static void main(String[] args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Ana", true));
    usuarios.add(new Usuario("Luis", false));
    usuarios.add(new Usuario("Pedro", true));
    usuarios.add(new Usuario("Carla", false));

    Iterator<Usuario> iterador = usuarios.iterator();

    while (iterador.hasNext()) {
      Usuario u = iterador.next();
      if (!u.activo) {
        iterador.remove(); // eliminar si está inactivo
      }
    }

    System.out.println("Usuarios activos:");
    for (Usuario u : usuarios) {
      System.out.println(u);
    }
  }
}

