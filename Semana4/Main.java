package Semana4;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> estadosUsuarios = new HashMap<>();
        estadosUsuarios.put("ana", "activo");
        estadosUsuarios.put("luis", "inactivo");
        estadosUsuarios.put("carlos", "activo");
        estadosUsuarios.put("maria", null);
        estadosUsuarios.put("laura", "activo");

        //Iniciando el contador
        int contador = 0;

      for (Map.Entry<String, String> entry: estadosUsuarios.entrySet()) {
        String valor = entry.getValue();
        if(valor!=null && valor.equals("activo")) {
            contador ++;
          }
        }
      System.out.println("Usuarios activos: " + contador);

  }
}
