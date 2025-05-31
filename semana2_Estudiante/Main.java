
package semana2_Estudiante;

import poo_Avanzada.Animal;
import poo_Avanzada.Perro;




public class Main {
  public static void main(String[] args) {
    Estudiante2 estudiante1 = new Estudiante2("Dante", 3, 18);
    estudiante1.presentarse();
    
    Profesor profesor1 = new Profesor("Daniel", 30, "Programacion");
    profesor1.presentarse();

    Persona persona1 = new Persona(-2, "Alejandro");
    persona1.presentarse();

/*     Persona[] personas = new Persona[4];
    personas [0] = new Estudiante2("andrea", 24, 16);
    personas [1] = new Estudiante2("andre", 22, 15);
    personas [2] = new Profesor("Piti", 11, "hacer hora");
    personas [3] = new Profesor("Benjamin", 11, "comer");

    for(Persona p : personas) {
      p.presentarse();
    } */
  }
}
