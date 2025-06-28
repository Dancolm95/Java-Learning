package poo_Avanzada;

import java.util.List;

public class Perro extends Animal implements Mascota {
    String raza;

    public Perro(String nombre, String raza) {
    super(nombre);
    this.raza = raza;
    
  }

  public void hacerSonido() {
    System.out.println("Guau");
  }
  public void jugar() {
    System.out.println("Me gusta jugar con pelotas");
  }
  public void vacunar() {
    System.out.println("Si me vacunan no me inmuto porque soy un perro");
  }

  @Override
  public String toString() {
    return "Perro {nombre= " + nombre + "', raza='" + raza +"'}";
  }
}
