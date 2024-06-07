package Proyecto_1;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("Numbers 1 to 100");
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Summative evaluation recovery exercise 1");
        System.out.println();
        System.out.println("Made by Dayana");
        System.out.println();
        System.out.println("End of exercise");
    }

}
