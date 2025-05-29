package poo_Avanzada;

public abstract class Animal {
  String nombre;

  protected Animal(String nombre) {
    this.nombre = nombre;
  }

  public void presentarse() {
    System.out.println("Hola soy un animal y mi nombre es " + nombre);
  }

  abstract void hacerSonido();
}