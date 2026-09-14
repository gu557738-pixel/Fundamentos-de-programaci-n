import java.util.Scanner;

public class ConsumoElectrico {

    static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    static double calcularCostoConsumo(double consumo) {

        double costo;

        if (consumo <= 150) {
            costo = consumo * 1.20;
        } else if (consumo <= 400) {
            costo = (150 * 1.20) + ((consumo - 150) * 1.80);
        } else {
            costo = (150 * 1.20)
                    + (250 * 1.80)
                    + ((consumo - 400) * 2.75);
        }

        return costo;
    }

    static double calcularDescuentoApoyo(double consumo,
                                         double costoAntesImpuesto,
                                         boolean tieneApoyo) {

        if (tieneApoyo && consumo <= 250) {
            return costoAntesImpuesto * 0.30;
        } else {
            return 0;
        }
    }

    static double calcularImpuesto(double baseImponible) {
        return baseImponible * 0.16;
    }

    static double calcularTotal(double costoConsumo,
                                double cargoFijo,
                                double descuento,
                                double impuesto) {

        return costoConsumo + cargoFijo - descuento + impuesto;
    }

    static void mostrarRecibo(double consumo,
                              double costoConsumo,
                              double descuento,
                              double impuesto,
                              double total) {

        System.out.println("\n--- RECIBO DE ELECTRICIDAD ---");
        System.out.println("Consumo: " + consumo + " kWh");
        System.out.println("Costo del consumo: $" + costoConsumo);
        System.out.println("Cargo fijo: $95.00");
        System.out.println("Descuento: $" + descuento);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total a pagar: $" + total);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lecturaAnterior;
        double lecturaActual;
        boolean tieneApoyo;

        do {
            System.out.print("Ingrese la lectura anterior: ");
            lecturaAnterior = entrada.nextDouble();
        } while (lecturaAnterior < 0);

        do {
            System.out.print("Ingrese la lectura actual: ");
            lecturaActual = entrada.nextDouble();

            if (lecturaActual < lecturaAnterior) {
                System.out.println(
                        "La lectura actual debe ser mayor o igual a la anterior."
                );
            }

        } while (lecturaActual < lecturaAnterior);

        double consumo = calcularConsumo(lecturaAnterior, lecturaActual);

        while (consumo > 10000) {
            System.out.println("El consumo maximo permitido es de 10,000 kWh.");

            do {
                System.out.print("Ingrese nuevamente la lectura actual: ");
                lecturaActual = entrada.nextDouble();
            } while (lecturaActual < lecturaAnterior);

            consumo = calcularConsumo(lecturaAnterior, lecturaActual);
        }

        System.out.print("¿La vivienda pertenece al programa de apoyo? (true/false): ");
        tieneApoyo = entrada.nextBoolean();

        double costoConsumo = calcularCostoConsumo(consumo);

        double cargoFijo = 95;

        double costoAntesImpuesto = costoConsumo + cargoFijo;

        double descuento = calcularDescuentoApoyo(
                consumo,
                costoAntesImpuesto,
                tieneApoyo
        );

        double baseImponible = costoAntesImpuesto - descuento;

        double impuesto = calcularImpuesto(baseImponible);

        double total = calcularTotal(
                costoConsumo,
                cargoFijo,
                descuento,
                impuesto
        );

        mostrarRecibo(
                consumo,
                costoConsumo,
                descuento,
                impuesto,
                total
        );

        entrada.close();
    }
}