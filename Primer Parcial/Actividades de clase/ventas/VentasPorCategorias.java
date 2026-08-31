import java.util.Scanner;

public class VentasPorCategorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contMas1000 = 0;
        int cont500a1000 = 0;
        int contMenos500 = 0;

        double totalMas1000 = 0.0;
        double total500a1000 = 0.0;
        double totalMenos500 = 0.0;
        double totalGlobal = 0.0;

        System.out.print("¿Desea registrar una venta? (si / no): ");
        String continuar = scanner.next().toLowerCase();

        while (continuar.equals("si")) {
            System.out.print("Ingrese el monto de la venta: ");
            double venta = scanner.nextDouble();

            while (venta <= 0) {
                System.out.print("El monto debe ser positivo. Ingrese nuevamente: ");
                venta = scanner.nextDouble();
            }

            if (venta > 1000) {
                contMas1000++;
                totalMas1000 += venta;
            } else if (venta > 500) {
                cont500a1000++;
                total500a1000 += venta;
            } else {
                contMenos500++;
                totalMenos500 += venta;
            }

            totalGlobal += venta;

            System.out.print("¿Desea registrar otra venta? (si / no): ");
            continuar = scanner.next().toLowerCase();
        }

        if (totalGlobal > 0) {
            System.out.println("=========================================");
            System.out.println("            RESUMEN DE VENTAS            ");
            System.out.println("=========================================");
            System.out.println("Ventas mayores a $1000: " + contMas1000);
            System.out.println("  Monto total: $" + totalMas1000);
            System.out.println("Ventas entre $500 y $1000: " + cont500a1000);
            System.out.println("  Monto total: $" + total500a1000);
            System.out.println("Ventas menores o iguales a $500: " + contMenos500);
            System.out.println("  Monto total: $" + totalMenos500);
            System.out.println("-----------------------------------------");
            System.out.println("Monto global vendido: $" + totalGlobal);
            System.out.println("Total de ventas: " + (contMas1000 + cont500a1000 + contMenos500));
            System.out.println("=========================================");
        } else {
            System.out.println("No se registro ninguna venta. Fin del programa.");
        }

        scanner.close();
    }
}