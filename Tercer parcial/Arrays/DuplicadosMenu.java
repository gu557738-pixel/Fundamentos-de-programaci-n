
import java.util.Arrays;
import java.util.Scanner;

public class DuplicadosMenu {

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

        // Ingresar los identificadores
        System.out.println("\nIngrese los identificadores enteros:");

        for (int i = 0; i < n; i++) {
            System.out.print("Identificador " + (i + 1) + ": ");
            original[i] = entrada.nextInt();
        }

        // Mostrar los primeros resultados
        mostrarResultados(original);

        int opcion;

        do {
            System.out.println("\n===== MENU DE OPCIONES =====");
            System.out.println("1. Insertar mas identificadores");
            System.out.println("2. Ordenar identificadores");
            System.out.println("3. Quitar duplicados");
            System.out.println("4. Mostrar arreglo actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    original = insertarDatos(original);
                    System.out.println("\nDatos actualizados:");
                    System.out.println(Arrays.toString(original));
                    break;

                case 2:
                    original = Arrays.copyOf(original, original.length);
                    Arrays.sort(original);

                    System.out.println("\nArreglo ordenado:");
                    System.out.println(Arrays.toString(original));
                    break;

                case 3:
                    original = quitarDuplicados(original);
                    mostrarResultados(original);
                    break;

                case 4:
                    System.out.println("\nArreglo actual:");
                    System.out.println(Arrays.toString(original));
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        entrada.close();
    }

    // Método para insertar más identificadores
    public static int[] insertarDatos(int[] original) {

        System.out.print("¿Cuantos identificadores desea agregar? ");
        int cantidad = entrada.nextInt();

        if (cantidad <= 0) {
            System.out.println("Debe agregar al menos un identificador.");
            return original;
        }

        int nuevoTamano = original.length + cantidad;

        int[] nuevoArreglo = Arrays.copyOf(original, nuevoTamano);

        for (int i = original.length; i < nuevoTamano; i++) {
            System.out.print("Ingrese el identificador: ");
            nuevoArreglo[i] = entrada.nextInt();
        }

        return nuevoArreglo;
    }

    // Método para quitar duplicados conservando el orden actual
    public static int[] quitarDuplicados(int[] original) {

        int[] temporal = new int[original.length];
        int cantidadUnicos = 0;

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
            }
        }

        return Arrays.copyOf(temporal, cantidadUnicos);
    }

    // Método para mostrar los resultados estadísticos
    public static void mostrarResultados(int[] original) {

        int[] copia = Arrays.copyOf(original, original.length);
        Arrays.sort(copia);

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

        int[] depurado = quitarDuplicados(original);
        int registrosEliminados = original.length - depurado.length;

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Arreglo original: "
                + Arrays.toString(original));

        System.out.println("Arreglo depurado: "
                + Arrays.toString(depurado));

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
    }
}
