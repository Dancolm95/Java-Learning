package Semana4;

import java.util.ArrayList;
import java.util.List;

import poo_Avanzada.Animal;
import poo_Avanzada.Perro;

//Aqui se utilizan todos los Wildcards y genericos creados
public class Practica {
  public static void main(String[] args) {
    // Caja genérica
    Caja<String> stringBox = new Caja<>();
    stringBox.set("Hola mundo");
    System.out.println("Caja: " + stringBox.get());

    // Método maximo
    System.out.println("Máximo: " + Util.maximo(5, 8));

    // Máximo en lista
    List<Integer> numeros = List.of(2, 8, 3, 12);
    System.out.println("Máximo en lista: " + Util.encontrarMaximoEnLista(numeros));

    // Mostrar tipos
    List<Object> cosas = List.of("Texto", 123, 45.6, true);
    Util.mostrarTiposEnLista(cosas);

    // Mostrar nombres de animales
    List<Perro> perros = List.of(
        new Perro("Chiquiwilo", "Bully"),
        new Perro("Firulais", "Pitbull"));
    Util.mostrarNombresDeAnimales(perros);

    // Llenar con perros
    List<Animal> animales = new ArrayList<>();
    Util.llenarConPerros(animales);
    for (Animal a : animales) {
      a.presentarse();
    }

    // También puede hacerse con List<Object>
    List<Object> objetos = new ArrayList<>();
    Util.llenarConPerros(objetos);
    for (Object o : objetos) {
      System.out.println(o); // muestra con toString()
    }
  }
}
