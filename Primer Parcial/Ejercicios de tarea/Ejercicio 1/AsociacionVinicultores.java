import java.util.Scanner;

public class AsociacionVinicultores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kilos, tamano;
        char tipo;
        double precioInicial, precioFinal, ganancia;

        System.out.print("Ingrese los kilos de uva: ");
        kilos = sc.nextInt();

        System.out.print("Ingrese el precio inicial por kilo: $");
        precioInicial = sc.nextDouble();

        System.out.print("Ingrese el tipo de uva (A o B): ");
        tipo = Character.toUpperCase(sc.next().charAt(0));

        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        tamano = sc.nextInt();

        if (tipo == 'A') {
            if (tamano == 1) {
                precioFinal = precioInicial + 0.20;
            } else {
                precioFinal = precioInicial + 0.30;
            }
        } else {
            if (tamano == 1) {
                precioFinal = precioInicial - 0.30;
            } else {
                precioFinal = precioInicial - 0.50;
            }
        }

        ganancia = precioFinal * kilos;

        System.out.printf("Precio final por kilo: $%.2f%n", precioFinal);
        System.out.printf("Ganancia total: $%.2f%n", ganancia);

        sc.close();
    }
}