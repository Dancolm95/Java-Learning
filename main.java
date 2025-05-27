
import semana2_Estudiante.Estudiante2;
import semana2_Estudiante.Profesor;

class Practica {

  public static void main(String[] args) {
    Estudiante2 estudiante1 = new Estudiante2("dante", 3, 18);

    Profesor profesor1 = new Profesor("Richi", 45, "letras");

    estudiante1.presentarse();
    profesor1.presentarse();

  }
  
}
