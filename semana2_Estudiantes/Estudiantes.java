package semana2_Estudiantes;

public class Estudiantes {
  private String nombre;
  private int edad;
  private int notaFinal;

  public Estudiantes(String nombre, int edad, int notaFinal) {
    this.nombre = nombre;
    this.edad = edad;
    this.notaFinal = notaFinal;
  }
  
  public void mostrarInfo() {
    System.out.println("El nombre del estudiante es: "+ nombre);
    System.out.println("La edad del estudiante es: "+ edad);
    System.out.println("La nota Final del estudiante es: "+ notaFinal);
  }

  public int modificarNota(int nota) {
    notaFinal = nota;
    return notaFinal;
  }
}
