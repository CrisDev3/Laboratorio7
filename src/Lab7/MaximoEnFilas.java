package Lab7;
import java.io.BufferedReader;
import java.io.IOException;

public class MaximoEnFilas {

    public static void encontrarMaximos(BufferedReader lector) {
        try {
            System.out.println("Ingrese el número de filas:");
            int filas = Integer.parseInt(lector.readLine());
            System.out.println("Ingrese el número de columnas:");
            int columnas = Integer.parseInt(lector.readLine());

            int[][] matriz = new int[filas][columnas];
            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = Integer.parseInt(lector.readLine());
                }
            }

            int[] maximos = new int[filas];
            for (int i = 0; i < filas; i++) {
                int max = matriz[i][0];
                for (int j = 1; j < columnas; j++) {
                    if (matriz[i][j] > max) {
                        max = matriz[i][j];
                    }
                }
                maximos[i] = max;
            }

            System.out.println("\nElementos más grandes en cada fila:");
            for (int max : maximos) {
                System.out.println(max);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error de entrada. Intente de nuevo.");
        }
    }
}


