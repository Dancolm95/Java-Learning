package poo_Avanzada;

//Extender una clase abstracta anonimamente

public abstract class Tarea {
  abstract void ejecutar();

  public static void main(String[] args) {
    Tarea nuevTarea = new Tarea() {
      @Override
      void ejecutar() {
        System.out.println("Ejecutando tarea sin nombre");
      }
    };

    nuevTarea.ejecutar();
  }

  for-each
}