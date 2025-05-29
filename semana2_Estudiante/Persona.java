package semana2_Estudiante;

public class Persona {
  private int edad;
  private String nombre;

  public Persona (int edad, String nombre) {
    //Validando la edad en el consturctor
    if (edad < 0) {
      throw new IllegalArgumentException("La edad no debe ser negativa");
    }
    this.edad = edad;
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  //Validar la edad en el setter
  public void setEdad(int edad) {
    if (edad < 0) {
      System.out.println("Edad no puede ser negativa");
      return;
    }

    this.edad = edad;
  }

  public void presentarse() {
    System.out.println("Hola mi nombre es: " + getNombre());
    System.out.println("Mi edad es "+ getEdad());
  }

  
}
