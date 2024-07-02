package Lab7;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class CalificacionesEstudiantes {

    public static void procesarCalificacionesEstudiantes(BufferedReader lector) {
        try {
            System.out.println("Ingrese el número de estudiantes:");
            int numEstudiantes = Integer.parseInt(lector.readLine());

            String[] nombres = new String[numEstudiantes];
            int[] calificaciones = new int[numEstudiantes];

            System.out.println("Ingrese los nombres y calificaciones de los estudiantes:");
            for (int i = 0; i < numEstudiantes; i++) {
                System.out.println("\nNombre del estudiante " + (i + 1) + ":");
                nombres[i] = lector.readLine();
                System.out.println("Calificación del estudiante " + (i + 1) + ":");
                calificaciones[i] = Integer.parseInt(lector.readLine());
            }

            System.out.println("\nElija el criterio de ordenación:");
            System.out.println("1. Ordenar por notas de menor a mayor");
            System.out.println("2. Ordenar por orden alfabético");

            int opcion = Integer.parseInt(lector.readLine());

            if (opcion == 1) {
                ordenarPorCalificaciones(nombres, calificaciones);
            } else if (opcion == 2) {
                ordenarPorNombres(nombres, calificaciones);
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
                return;
            }

            System.out.println("\nNombres y calificaciones ordenados:");
            for (int i = 0; i < numEstudiantes; i++) {
                System.out.println(nombres[i] + ": " + calificaciones[i]);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error de entrada. Intente de nuevo.");
        }
    }

    private static void ordenarPorCalificaciones(String[] nombres, int[] calificaciones) {
        Integer[] indices = new Integer[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(i -> calificaciones[i]));
        reordenar(nombres, calificaciones, indices);
    }

    private static void ordenarPorNombres(String[] nombres, int[] calificaciones) {
        Integer[] indices = new Integer[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparing(i -> nombres[i]));
        reordenar(nombres, calificaciones, indices);
    }

    private static void reordenar(String[] nombres, int[] calificaciones, Integer[] indices) {
        String[] nombresOrdenados = new String[nombres.length];
        int[] calificacionesOrdenadas = new int[calificaciones.length];
        for (int i = 0; i < indices.length; i++) {
            nombresOrdenados[i] = nombres[indices[i]];
            calificacionesOrdenadas[i] = calificaciones[indices[i]];
        }
        System.arraycopy(nombresOrdenados, 0, nombres, 0, nombres.length);
        System.arraycopy(calificacionesOrdenadas, 0, calificaciones, 0, calificaciones.length);
    }
}


