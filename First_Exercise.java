package Ejercicio_1;
import java.util.Scanner;

public class Primer_Ejercicio {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        int cases = leer.nextInt();
        if (cases > 0) {
            // Escalera ascendente de abajo hacia arriba

            for (int i = cases; i > 0; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else if (cases < 0) {
            // Escalera descendente de arriba hacia abajo
            
            System.out.print(" ");
            cases = -cases; // Convertir a positivo para usar en los bucles
            for (int i = 1; i <= cases; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }
        } else {
            // Caso donde n es 0
            System.out.println("__");
        }
    }
}

