package poo_Avanzada;

public class Perro extends Animal {
    public String raza;

    public Perro(String nombre, String raza) {
    super(nombre);
    this.raza = raza;
    
  }

  void hacerSonido() {
    System.out.println("Guau");
  }
}
