import java.util.Scanner;

public class ComputadorasVentas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vendedores: ");
        int n = entrada.nextInt();

        System.out.print("Ingrese la cantidad de zonas: ");
        int m = entrada.nextInt();

        int[][] ventas = new int[n][m];

        // Matriz para guardar el dinero vendido por cada vendedor y zona
        double[][] dineroVentas = new double[n][m];

        // Llenar las matrices
        for (int i = 0; i < n; i++) {

            System.out.println("\n========== VENDEDOR " + (i + 1) + " ==========");

            for (int j = 0; j < m; j++) {

                System.out.print("Computadoras vendidas en la zona "
                        + (j + 1) + ": ");
                ventas[i][j] = entrada.nextInt();

                double totalZona = 0;

                // Preguntar el precio de cada computadora
                for (int k = 0; k < ventas[i][j]; k++) {

                    System.out.print("Ingrese el precio de la computadora "
                            + (k + 1) + ": $");
                    double precio = entrada.nextDouble();

                    totalZona = totalZona + precio;
                }

                dineroVentas[i][j] = totalZona;
            }
        }

        // -----------------------------------
        // MOSTRAR LA MATRIZ
        // -----------------------------------

        System.out.println("\n========== VENTAS ==========");

        for (int i = 0; i < n; i++) {

            System.out.print("Vendedor " + (i + 1) + ": ");

            for (int j = 0; j < m; j++) {

                System.out.print(ventas[i][j] + "\t");
            }

            System.out.println();
        }

        // -----------------------------------
        // ZONA QUE MAS COMPUTADORAS VENDIO
        // -----------------------------------

        int mayorZona = 0;
        int zonaMayor = 1;

        for (int j = 0; j < m; j++) {

            int sumaZona = 0;

            for (int i = 0; i < n; i++) {

                sumaZona = sumaZona + ventas[i][j];
            }

            if (sumaZona > mayorZona) {

                mayorZona = sumaZona;
                zonaMayor = j + 1;
            }
        }

        System.out.println("\nLa zona que más computadoras vendió fue la zona "
                + zonaMayor + " con " + mayorZona + " computadoras.");

        // -----------------------------------
        // VENDEDOR QUE MENOS VENDIO
        // -----------------------------------

        int menorVendedor = Integer.MAX_VALUE;
        int vendedorMenor = 1;
        double dineroMenor = 0;

        for (int i = 0; i < n; i++) {

            int sumaVendedor = 0;
            double dineroVendedor = 0;

            for (int j = 0; j < m; j++) {

                sumaVendedor = sumaVendedor + ventas[i][j];
                dineroVendedor = dineroVendedor + dineroVentas[i][j];
            }

            if (sumaVendedor < menorVendedor) {

                menorVendedor = sumaVendedor;
                vendedorMenor = i + 1;
                dineroMenor = dineroVendedor;
            }
        }

        System.out.println("\nEl vendedor que menos computadoras vendió fue "
                + "el vendedor " + vendedorMenor);

        System.out.println("Computadoras vendidas: " + menorVendedor);

        System.out.println("Total de su venta: $" + dineroMenor);

        // -----------------------------------
        // VENDEDOR QUE MAS VENDIO
        // -----------------------------------

        int mayorVendedor = 0;
        int vendedorMayor = 1;
        double dineroMayor = 0;

        for (int i = 0; i < n; i++) {

            int sumaVendedor = 0;
            double dineroVendedor = 0;

            for (int j = 0; j < m; j++) {

                sumaVendedor = sumaVendedor + ventas[i][j];
                dineroVendedor = dineroVendedor + dineroVentas[i][j];
            }

            if (sumaVendedor > mayorVendedor) {

                mayorVendedor = sumaVendedor;
                vendedorMayor = i + 1;
                dineroMayor = dineroVendedor;
            }
        }

        System.out.println("\nEl vendedor que más computadoras vendió fue "
                + "el vendedor " + vendedorMayor);

        System.out.println("Computadoras vendidas: " + mayorVendedor);

        System.out.println("Total de su venta: $" + dineroMayor);

        // -----------------------------------
        // TOTAL DE COMPUTADORAS VENDIDAS
        // -----------------------------------

        int totalComputadoras = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                totalComputadoras = totalComputadoras + ventas[i][j];
            }
        }

        // -----------------------------------
        // TOTAL DE DINERO VENDIDO
        // -----------------------------------

        double totalVendido = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                totalVendido = totalVendido + dineroVentas[i][j];
            }
        }

        // -----------------------------------
        // RESULTADO FINAL
        // -----------------------------------

        System.out.println("\n========== RESULTADO FINAL ==========");

        System.out.println("Cantidad total de computadoras vendidas: "
                + totalComputadoras);

        System.out.println("Total de dinero vendido: $" + totalVendido);

        entrada.close();
    }
}