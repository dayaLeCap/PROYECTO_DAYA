package Recuperaciones;
import java.util.List;
public class Third_Exercise {

        public static String calcularGanador(List<String[]> jugadas) {
            int contadorPlayer1 = 0;
            int contadorPlayer2 = 0;

            for (String[] jugada : jugadas) {
                String jugadaPlayer1 = jugada[0];
                String jugadaPlayer2 = jugada[1];

                if (jugadaPlayer1.equals(jugadaPlayer2)) {
                    // Empate
                    continue;
                }

                if ((jugadaPlayer1.equals("R") && jugadaPlayer2.equals("S")) ||
                        (jugadaPlayer1.equals("S") && jugadaPlayer2.equals("P")) ||
                        (jugadaPlayer1.equals("P") && jugadaPlayer2.equals("R"))) {
                    // Player 1 gana
                    contadorPlayer1++;
                } else {
                    // Player 2 gana
                    contadorPlayer2++;
                }
            }

            if (contadorPlayer1 > contadorPlayer2) {
                return "Player 1";
            } else if (contadorPlayer1 < contadorPlayer2) {
                return "Player 2";
            } else {
                return "Tie";
            }
        }

        public static void main(String[] args) {
            // Ejemplo de uso
            List<String[]> jugadas = List.of(
                    new String[]{"R", "S"}, // Player 1 gana
                    new String[]{"S", "R"}, // Player 2 gana
                    new String[]{"P", "S"}  // Player 2 gana
            );

            String ganador = calcularGanador(jugadas);
            System.out.println("El ganador es: " + ganador);
        }
    }