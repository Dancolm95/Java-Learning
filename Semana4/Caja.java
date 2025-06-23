package Semana4;

public class Caja<T> {
  T value;

  public T get() {
    return value;
  }

  public void set(T value) {
    this.value = value;
  }
}

public class Main {
  public static void main(String [] args) {
    //Cremos una caja que cointenga un string
    Caja<String> stringBox = new Caja<>();
    stringBox.set("Holocausto");
    System.out.println("El contenido  de esta caja es: " + stringBox.get());

    //Creams una caja que contenga un numero
    Caja<Integer> intBox = new Caja<>();
    intBox.set(33);
    System.out.println("El valor de esta caja es: " + intBox.get());
  }
}
