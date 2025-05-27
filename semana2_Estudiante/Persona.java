package semana2_Estudiante;

public class Persona {
  int edad;
  String nombre;

  public Persona (int edad, String nombre) {
    this.edad = edad;
    this.nombre = nombre;
  }

  public void presentarse() {
    System.out.println("Hola mi nombre es: " + nombre);
    System.out.println("Mi edad es "+ edad);
  }
  
}
