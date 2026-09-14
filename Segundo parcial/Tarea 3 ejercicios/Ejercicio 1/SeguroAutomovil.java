import java.util.Scanner;

public class SeguroAutomovil {

    static double calcularTarifaBase(double valorVehiculo) {
        return valorVehiculo * 0.04;
    }

    static double calcularRecargoPorEdad(double tarifaBase, int edad) {
        if (edad < 25) {
            return tarifaBase * 0.20;
        } else if (edad > 60) {
            return tarifaBase * 0.10;
        } else {
            return 0;
        }
    }

    static double calcularRecargoPorAccidentes(double tarifaBase, int accidentes) {
        return tarifaBase * 0.08 * accidentes;
    }

    static double calcularDescuentoSeguridad(double subtotal, boolean tieneSeguridad) {
        if (tieneSeguridad) {
            return subtotal * 0.05;
        } else {
            return 0;
        }
    }

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

        do {
            System.out.print("Ingrese el valor del vehiculo: ");
            valorVehiculo = entrada.nextDouble();
        } while (valorVehiculo <= 0);

        do {
            System.out.print("Ingrese la edad del conductor: ");
            edad = entrada.nextInt();
        } while (edad < 18 || edad > 100);

        do {
            System.out.print("Ingrese la cantidad de accidentes: ");
            accidentes = entrada.nextInt();
        } while (accidentes < 0);

        System.out.print("¿Cuenta con sistema de seguridad adicional? (true/false): ");
        tieneSeguridad = entrada.nextBoolean();

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

        System.out.println("\n--- COTIZACION DEL SEGURO ---");
        System.out.println("Tarifa base: $" + tarifaBase);
        System.out.println("Recargo por edad: $" + recargoEdad);
        System.out.println("Recargo por accidentes: $" + recargoAccidentes);
        System.out.println("Descuento por seguridad: $" + descuento);
        System.out.println("Costo final: $" + costoFinal);

        entrada.close();
    }
}