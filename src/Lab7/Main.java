package Lab7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Transponer una matriz");
            System.out.println("2. Encontrar el elemento más grande en cada fila");
            System.out.println("3. Ordenar la diagonal secundaria de una matriz cuadrada");
            System.out.println("4. Ordenar nombres y calificaciones de estudiantes");
            System.out.println("5. Salir");

            try {
                int opcion = Integer.parseInt(lector.readLine());
                switch (opcion) {
                    case 1:
                        OperacionesMatriz.transponerMatriz(lector);
                        break;
                    case 2:
                        MaximoEnFilas.encontrarMaximos(lector);
                        break;
                    case 3:
                        DiagonalSecundaria.procesarDiagonalSecundaria(lector);
                        break;
                    case 4:
                        CalificacionesEstudiantes.procesarCalificacionesEstudiantes(lector);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("\nOpción no válida. Intente de nuevo.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error de entrada. Intente de nuevo.");
            }
        }
    }
}
