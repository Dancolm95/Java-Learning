package Semana3_Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ModificarListIterator {
  public static void main(String[] args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Ana", true));
    usuarios.add(new Usuario("Luis", false));
    usuarios.add(new Usuario("Pedro", true));
    usuarios.add(new Usuario("Carla", false));
    ListIterator<Usuario> iterator = usuarios.listIterator();

    while (iterator.hasNext()) {
      Usuario actual = iterator.next();
      if (actual.activo) {
        // Cremos una nueva instancia con el nombre en mayusculas
        Usuario modificado = new Usuario(actual.nombre.toUpperCase(), true);
        iterator.set(modificado);
      }
    }
    System.out.println("Usuarios luego de moficiar: ");
    for (Usuario u : usuarios) {
      System.out.println(u);
    }
  }
}