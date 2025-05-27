package semana2_Estudiante;
  public class Estudiante2 extends Persona {
    int notaFinal;
  
  public void estudiar() {
    System.out.println("Yo estudio");
  }
  public Estudiante2(String nombre, int edad, int notaFinal) {
    super(edad, nombre);
    this.notaFinal = notaFinal;

  }
}