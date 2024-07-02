package Lab7;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class OperacionesMatriz {

    public static void transponerMatriz(BufferedReader lector) {
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

            int[][] transpuesta = new int[columnas][filas];
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < filas; j++) {
                    transpuesta[i][j] = matriz[j][i];
                }
            }

            System.out.println("\nMatriz original:");
            imprimirMatriz(matriz);
            System.out.println("\nMatriz transpuesta:");
            imprimirMatriz(transpuesta);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error de entrada. Intente de nuevo.");
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}


