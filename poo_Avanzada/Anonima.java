package poo_Avanzada;

// public class Anonima {

//   interface Animal {
//     void hacerSonido();
//   }
  
//   public static void main(String[] args) {
//     Animal gato = new Animal() {
//       @Override
//       public void hacerSonido() {
//         System.out.println("miau");
//       }
//     };

//     gato.hacerSonido();
//   }
// }

public class Anonima {

  interface Saludo {
    void saludar();
  }
  
  public static void main(String[] args) {
    Saludo nuevSaludo = new Saludo() {
      @Override
      public void saludar() {
        System.out.println("Hola, soy daniel aprendiendo java");
      }
    };

    nuevSaludo.saludar();
  }
}
