package poo_Avanzada;

public class Gato extends Animal {
  String color;

  public Gato(String nombre, String color) {
    super(nombre);
    this.color = color;

  }

  void hacerSonido() {
    System.out.println("Miau");
  }
}
