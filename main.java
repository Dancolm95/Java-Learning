
import semana2_Estudiante.Estudiante2;
import semana2_Estudiante.Profesor;
import poo_Avanzada.Animal;
import poo_Avanzada.Perro;
import poo_Avanzada.Veterinaria;
import poo_Avanzada.Gato;
import poo_Avanzada.Mascota;

class Practica {

  public static void main(String[] args) {
  //   Estudiante2 estudiante1 = new Estudiante2("dante", 3, 18);

  //   Profesor profesor1 = new Profesor("Richi", 45, "letras");

  //   estudiante1.presentarse();
  //   profesor1.presentarse();

  //   Animal[] animales = new Animal[2];
  //   animales[0] = new Perro("Chiquiwilo", "American Bully"); 
  //   animales[1] = new Gato("Ramon", "mestizo"); 
  
  //   for(Animal a : animales) {
  //     a.presentarse();
  //     a.hacerSonido();
  //   } 
  // }

  Mascota[] mascotas = new Mascota[2];
  mascotas[0] = new Perro("Chiquiwilo", "American Bully");
  mascotas[1] = new Gato("Ramon", "Caramelo");
    for (Mascota m: mascotas) {
      m.jugar();
      m.vacunar();
    }
  Veterinaria nuevaVeterinaria = new Veterinaria("Colitas");
  Veterinaria.HistorialMedico newVeterinaria = nuevaVeterinaria.new HistorialMedico();
    newVeterinaria.mostrarDatos();
  }}
