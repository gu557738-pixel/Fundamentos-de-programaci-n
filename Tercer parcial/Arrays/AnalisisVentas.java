
import java.util.Arrays;
import java.util.Scanner;

public class AnalisisVentas {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingrese la cantidad de sucursales: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        double[][] ventas = new double[n][12];
        double[] totales = new double[n];
        double[] promedios = new double[n];
        int[] mejoresMeses = new int[n];

        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double sumaGlobal = 0;

        // Registrar las ventas
        for (int i = 0; i < n; i++) {
            System.out.println("\nSucursal " + (i + 1));

            for (int j = 0; j < 12; j++) {
                System.out.print("Ventas de " + nombresMeses[j] + ": $");
                ventas[i][j] = entrada.nextDouble();

                totales[i] += ventas[i][j];
                sumaGlobal += ventas[i][j];
            }

            promedios[i] = totales[i] / 12;

            int mejor = 0;

            for (int j = 1; j < 12; j++) {
                if (ventas[i][j] > ventas[i][mejor]) {
                    mejor = j;
                }
            }

            mejoresMeses[i] = mejor;
        }

        // Promedio anual de ventas por sucursal
        double promedioGlobal = sumaGlobal / n;

        System.out.println("\n===== REPORTE DE VENTAS =====");

        for (int i = 0; i < n; i++) {
            System.out.println("\nSucursal " + (i + 1));
            System.out.printf("Total anual: $%.2f%n", totales[i]);
            System.out.printf("Promedio mensual: $%.2f%n", promedios[i]);
            System.out.println("Mejor mes: "
                    + nombresMeses[mejoresMeses[i]]);

            if (totales[i] > promedioGlobal) {
                System.out.println(
                    "Supera el promedio global de ventas.");
            }
        }

        System.out.printf(
            "%nPromedio global anual por sucursal: $%.2f%n",
            promedioGlobal
        );

        // Crear una copia de los totales y ordenarla
        double[] ordenados = Arrays.copyOf(totales, totales.length);
        Arrays.sort(ordenados);

        System.out.println("\n===== RANKING DE SUCURSALES =====");
        System.out.println("Totales ordenados: "
                + Arrays.toString(ordenados));

        // Mantener la correspondencia entre sucursal y ventas
        boolean[] mostrada = new boolean[n];

        for (int k = 0; k < n; k++) {
            double valor = ordenados[k];

            for (int i = 0; i < n; i++) {
                if (!mostrada[i] && totales[i] == valor) {
                    System.out.printf(
                        "Sucursal %d: $%.2f%n",
                        i + 1, totales[i]
                    );
                    mostrada[i] = true;
                    break;
                }
            }
        }

        entrada.close();
    }
}
