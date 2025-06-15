package Semana3_Collections;

import java.util.HashSet;
import java.util.Set;

public class Duplicados {
  public static void main(String[] args) {
    String[] nombres = {"Ana", "Luis", "Pedro", "Ana", "Maria", "Luis", "Carlos"};
    Set<String> nombresUnicos = new HashSet<>();
    Set<String> nombresDuplicados = new HashSet<>();

    for( String nombre: nombres ) {
        if(!nombresUnicos.add(nombre)) {
          nombresDuplicados.add(nombre);
        }
    }

    System.out.println(nombresUnicos);
    System.out.println(nombresDuplicados);

  }
}
