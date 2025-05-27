package semana2_Estudiante;

public class Estudiante {
  private String nombre;
  private int edad;
  private int notaFinal;

  public Estudiante(String nombre, int edad, int notaFinal) {
    this.nombre = nombre;
    this.edad = edad;
    this.notaFinal = notaFinal;
  }
  
  public void mostrarInfo() {
    System.out.println("El nombre del estudiante es: "+ nombre);
    System.out.println("La edad del estudiante es: "+ edad);
    System.out.println("La nota Final del estudiante es: "+ notaFinal);
  }

  public void setNotaFinal(int nota) {
    this.notaFinal = nota;
  }
}
