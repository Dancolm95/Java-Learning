package Semana4;

public class Contacto {
  // En archivo Contacto.java
    String nombre;
    String telefono;
    String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " | " + telefono + " | " + email;
    }
}
