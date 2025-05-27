package semana2_Estudiante;

public class Profesor extends Persona {
  String especialidad;
  
  public Profesor(String nombre, int edad, String especialidad) {
    super(edad, nombre);
    this.especialidad = especialidad;
  }
  
  public void enseñar() {
    System.out.println("Yo enseno");
  }

  @Override
  public void presentarse() {
    /* super.presentarse(); */
    System.out.println("Soy el profesor " + nombre);
    System.out.println("mi especialidad es: " + especialidad);
  
  }
}
