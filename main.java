
import semana2_Estudiante.Estudiante2;
import semana2_Estudiante.Profesor;
import poo_Avanzada.Animal;
import poo_Avanzada.Perro;
import poo_Avanzada.Veterinaria;
import poo_Avanzada.Gato;
import poo_Avanzada.Mascota;

import java.util.ArrayList;
import java.util.List;

import Semana4.Caja;
import Semana4.Util;

class Practica {

  public static void main(String[] args) {
    // Estudiante2 estudiante1 = new Estudiante2("dante", 3, 18);

    // Profesor profesor1 = new Profesor("Richi", 45, "letras");

    // estudiante1.presentarse();
    // profesor1.presentarse();

    // Animal[] animales = new Animal[2];
    // animales[0] = new Perro("Chiquiwilo", "American Bully");
    // animales[1] = new Gato("Ramon", "mestizo");

    // for(Animal a : animales) {
    // a.presentarse();
    // a.hacerSonido();
    // }
    // }

    Mascota[] mascotas = new Mascota[2];
    mascotas[0] = new Perro("Chiquiwilo", "American Bully");
    mascotas[1] = new Gato("Ramon", "Caramelo");
    for (Mascota m : mascotas) {
      m.jugar();
      m.vacunar();
    }
    Veterinaria nuevaVeterinaria = new Veterinaria("Colitas");
    Veterinaria.HistorialMedico newVeterinaria = nuevaVeterinaria.new HistorialMedico();
    newVeterinaria.mostrarDatos();

    // Cremos una caja que contiene un String
    Caja<String> stringBox = new Caja<>();
    stringBox.set("Hello");
    System.out.println("Value: " + stringBox.get());

    // Creamos una caja que contiene un ingeteger
    Caja<Integer> intBox = new Caja<>();
    intBox.set(50);
    System.out.println("Value: " + intBox.get());

    /*
     * System.out.println("maximo entre 5 y 8: " + Util.maximo(5, 8));
     * System.out.println("maximo entre pera y manzana: " + Util.maximo("pera",
     * "manzana"));
     */

    List<Integer> numeros = List.of(3, 8, 2, 15, 6);
    Integer max = Util.encontrarMaximoEnLista(numeros);
    System.out.println("Máximo: " + max); // Debería imprimir: 15
  }
}
