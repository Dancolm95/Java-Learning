package Semana3_Wrappers;

import java.util.ArrayList;
import java.util.List;

public class CajaDeHerramientas {
    public static void main(String[] args) {

        // 1. Crea una lista de Integer (envoltorios de int)
        List<Integer> lista = __________;

        // 2. Agrega los pesos 10, 15 y 25 (autoboxing ocurre aquí)
        lista.______(____);
        lista.______(____);
        lista.______(____);

        // 3. Variable acumuladora para el total
        int total = ____;

        // 4. Recorre la lista con un for-each y haz unboxing al sumar
        for (___________ : lista) {
            total += _______;  // Aquí ocurre unboxing
        }

        // 5. Muestra el resultado total
        System.out.println("Peso total: " + _______);
    }
}

