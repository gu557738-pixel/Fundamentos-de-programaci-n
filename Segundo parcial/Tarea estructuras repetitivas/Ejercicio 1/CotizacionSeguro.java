import java.util.Scanner;

public class CotizacionSeguro {

    // Método para calcular la tarifa base
    static double calcularTarifaBase(double valorVehiculo) {
        return valorVehiculo * 0.04;
    }

    // Método para calcular el recargo por edad
    static double calcularRecargoPorEdad(double tarifaBase, int edad) {
        if (edad < 25) {
            return tarifaBase * 0.20;
        } else if (edad > 60) {
            return tarifaBase * 0.10;
        } else {
            return 0;
        }
    }

    // Método para calcular el recargo por accidentes
    static double calcularRecargoPorAccidentes(double tarifaBase, int accidentes) {
        return tarifaBase * 0.08 * accidentes;
    }

    // Método para calcular el descuento por seguridad
    static double calcularDescuentoSeguridad(double subtotal, boolean tieneSeguridad) {
        if (tieneSeguridad) {
            return subtotal * 0.05;
        } else {
            return 0;
        }
    }

    // Método para calcular el costo final
    static double calcularCostoFinal(double tarifaBase, double recargoEdad,
                                     double recargoAccidentes, double descuento) {
        return tarifaBase + recargoEdad + recargoAccidentes - descuento;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorVehiculo;
        int edad;
        int accidentes;
        boolean tieneSeguridad;

        // Validar valor del vehículo
        do {
            System.out.print("Ingrese el valor del automóvil: $");
            valorVehiculo = entrada.nextDouble();

            if (valorVehiculo <= 0) {
                System.out.println("El valor debe ser mayor que cero.");
            }

        } while (valorVehiculo <= 0);

        // Validar edad
        do {
            System.out.print("Ingrese la edad del conductor: ");
            edad = entrada.nextInt();

            if (edad < 18 || edad > 100) {
                System.out.println("La edad debe estar entre 18 y 100 años.");
            }

        } while (edad < 18 || edad > 100);

        // Validar accidentes
        do {
            System.out.print("Ingrese el número de accidentes: ");
            accidentes = entrada.nextInt();

            if (accidentes < 0) {
                System.out.println("El número de accidentes no puede ser negativo.");
            }

        } while (accidentes < 0);

        // Seguridad adicional
        System.out.print("¿Cuenta con sistema de seguridad adicional? (true/false): ");
        tieneSeguridad = entrada.nextBoolean();

        // Llamada de métodos
        double tarifaBase = calcularTarifaBase(valorVehiculo);
        double recargoEdad = calcularRecargoPorEdad(tarifaBase, edad);
        double recargoAccidentes = calcularRecargoPorAccidentes(tarifaBase, accidentes);

        double subtotal = tarifaBase + recargoEdad + recargoAccidentes;

        double descuento = calcularDescuentoSeguridad(subtotal, tieneSeguridad);

        double costoFinal = calcularCostoFinal(
                tarifaBase,
                recargoEdad,
                recargoAccidentes,
                descuento
        );

        // Mostrar resultados
        System.out.println("\n----- COTIZACIÓN DEL SEGURO -----");
        System.out.printf("Tarifa base: $%.2f%n", tarifaBase);
        System.out.printf("Recargo por edad: $%.2f%n", recargoEdad);
        System.out.printf("Recargo por accidentes: $%.2f%n", recargoAccidentes);
        System.out.printf("Descuento por seguridad: $%.2f%n", descuento);
        System.out.printf("COSTO ANUAL FINAL: $%.2f%n", costoFinal);

        entrada.close();
    }
}