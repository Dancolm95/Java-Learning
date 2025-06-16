package Semana3_Iterator;

public class Usuario {
  String nombre;
  boolean activo;

  Usuario(String nombre, boolean activo) {
    this.nombre = nombre;
    this.activo = activo;
  }

  @Override
  public String toString() {
    return nombre + " (" + (activo ? "Activo" : "Inactivo") + ")";
  }
}
