package com.example.sumativainicial;


import java.util.Scanner;
//Examen Dayana
public class Evaluacion {

    public static void main(String[] args) {

            int n = 4;
            if (n > 0) {
                // Escalera ascendente de arriba hacia abajo
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("|_");
                }
            } else if (n < 0) {
                // Escalera descendente de arriba hacia abajo
                n = -n; // Convertir a positivo para usar en los bucles
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("_|");
                }
            } else {
                // Caso donde n es 0
                System.out.println("__");
            }
        }
    }




