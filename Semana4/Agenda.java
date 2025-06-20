package Semana4;

import java.util.HashMap;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Contacto> agenda = new HashMap<>();
        int opcion;

        do {
            System.out.println("\n📒 AGENDA DE CONTACTOS");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    if (agenda.containsKey(nombre)) {
                        System.out.println("⚠️ El contacto ya existe.");
                    } else {
                        agenda.put(nombre, new Contacto(nombre, telefono, email));
                        System.out.println("✅ Contacto agregado.");
                    }
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    Contacto c = agenda.get(buscar);
                    if (c != null) {
                        System.out.println("🔍 Encontrado: " + c);
                    } else {
                        System.out.println("❌ No se encontró el contacto.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (agenda.remove(eliminar) != null) {
                        System.out.println("🗑️ Contacto eliminado.");
                    } else {
                        System.out.println("❌ No se encontró el contacto.");
                    }
                    break;

                case 4:
                    if (agenda.isEmpty()) {
                        System.out.println("📭 Agenda vacía.");
                    } else {
                        System.out.println("📃 Lista de contactos:");
                        for (Contacto contacto : agenda.values()) {
                            System.out.println(" - " + contacto);
                        }
                    }
                    break;

                case 0:
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("❓ Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

