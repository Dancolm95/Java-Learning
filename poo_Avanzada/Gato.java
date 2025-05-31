package poo_Avanzada;

public class Gato extends Animal implements Mascota{
  String color;

  public Gato(String nombre, String color) {
    super(nombre);
    this.color = color;

  }

  public void hacerSonido() {
    System.out.println("Miau");
  }

  public void jugar() {
    System.out.println("Me gusta jugar con lana");
  }

  public void vacunar() {
       System.out.println("Es imposible vacunarme sin que te pase algo");
  }
}
