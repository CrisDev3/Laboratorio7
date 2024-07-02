package Lab7;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class DiagonalSecundaria {

    public static void procesarDiagonalSecundaria(BufferedReader lector) {
        try {
            System.out.println("Ingrese el tamaño de la matriz cuadrada:");
            int tamaño = Integer.parseInt(lector.readLine());

            int[][] matriz = new int[tamaño][tamaño];
            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    matriz[i][j] = Integer.parseInt(lector.readLine());
                }
            }

            Integer[] diagonalSecundaria = new Integer[tamaño];
            for (int i = 0; i < tamaño; i++) {
                diagonalSecundaria[i] = matriz[i][tamaño - 1 - i];
            }

            Arrays.sort(diagonalSecundaria, Collections.reverseOrder());

            System.out.println("\nElementos de la diagonal secundaria ordenados de mayor a menor:");
            for (int elem : diagonalSecundaria) {
                System.out.println(elem);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error de entrada. Intente de nuevo.");
        }
    }
}

