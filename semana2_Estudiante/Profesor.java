package semana2_Estudiante;

public class Profesor extends Persona {
  String especialidad;

  public Profesor(String nombre, int edad, String especialidad) {
    super(edad, nombre);
    this.especialidad = especialidad;
  }
}
