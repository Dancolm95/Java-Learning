package semana2_Estudiante;

public class Persona {
  private int edad;
  private String nombre;

  public Persona (int edad, String nombre) {
    this.edad = edad;
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void presentarse() {
    System.out.println("Hola mi nombre es: " + getNombre());
    System.out.println("Mi edad es "+ getEdad());
  }

  
}
