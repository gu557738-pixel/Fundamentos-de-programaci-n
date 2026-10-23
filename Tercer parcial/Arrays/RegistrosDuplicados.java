
import java.util.Arrays;
import java.util.Scanner;

public class RegistrosDuplicados {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("¿Cuantos identificadores desea ingresar? ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            entrada.close();
            return;
        }

        int[] original = new int[n];

        // Solicitar los identificadores al usuario
        System.out.println("\nIngrese los identificadores enteros:");

        for (int i = 0; i < n; i++) {
            System.out.print("Identificador " + (i + 1) + ": ");
            original[i] = entrada.nextInt();
        }

        System.out.println("\nArreglo original: "
                + Arrays.toString(original));

        // Crear una copia y ordenarla para analizar frecuencias
        int[] copia = Arrays.copyOf(original, original.length);
        Arrays.sort(copia);

        // Contar los identificadores que aparecen más de una vez
        int cantidadDuplicados = 0;

        for (int i = 0; i < copia.length; i++) {

            if (i == 0 || copia[i] != copia[i - 1]) {

                int frecuencia = 0;

                for (int j = 0; j < copia.length; j++) {
                    if (copia[j] == copia[i]) {
                        frecuencia++;
                    }
                }

                if (frecuencia > 1) {
                    cantidadDuplicados++;
                }
            }
        }

        // Crear un arreglo temporal sin duplicados
        int[] temporal = new int[n];
        int cantidadUnicos = 0;
        int registrosEliminados = 0;

        for (int i = 0; i < original.length; i++) {

            boolean existe = false;

            for (int j = 0; j < cantidadUnicos; j++) {
                if (temporal[j] == original[i]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                temporal[cantidadUnicos] = original[i];
                cantidadUnicos++;
            } else {
                registrosEliminados++;
            }
        }

        // Ajustar el tamaño al número de elementos únicos
        int[] depurado = Arrays.copyOf(temporal, cantidadUnicos);

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Arreglo depurado: "
                + Arrays.toString(depurado));

        // Mostrar los identificadores duplicados
        System.out.print("Identificadores duplicados: ");

        boolean primero = true;

        for (int i = 0; i < copia.length; i++) {

            if (i == 0 || copia[i] != copia[i - 1]) {

                int frecuencia = 0;

                for (int j = 0; j < copia.length; j++) {
                    if (copia[j] == copia[i]) {
                        frecuencia++;
                    }
                }

                if (frecuencia > 1) {
                    if (!primero) {
                        System.out.print(", ");
                    }

                    System.out.print(copia[i]);
                    primero = false;
                }
            }
        }

        if (primero) {
            System.out.print("No hay identificadores duplicados");
        }

        System.out.println();

        System.out.println("Cantidad de identificadores duplicados: "
                + cantidadDuplicados);

        System.out.println("Registros eliminados: "
                + registrosEliminados);

        entrada.close();
    }
}
