import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int mes;
        char continuar;

        do {

            System.out.print("Ingrese el numero del mes (1-12): ");
            mes = entrada.nextInt();

            if (mes >= 1 && mes <= 12) {

                switch (mes) {

                    case 1:
                        System.out.println("Enero - 31 dias");
                        break;

                    case 2:
                        System.out.println("Febrero - 28 dias");
                        break;

                    case 3:
                        System.out.println("Marzo - 31 dias");
                        break;

                    case 4:
                        System.out.println("Abril - 30 dias");
                        break;

                    case 5:
                        System.out.println("Mayo - 31 dias");
                        break;

                    case 6:
                        System.out.println("Junio - 30 dias");
                        break;

                    case 7:
                        System.out.println("Julio - 31 dias");
                        break;

                    case 8:
                        System.out.println("Agosto - 31 dias");
                        break;

                    case 9:
                        System.out.println("Septiembre - 30 dias");
                        break;

                    case 10:
                        System.out.println("Octubre - 31 dias");
                        break;

                    case 11:
                        System.out.println("Noviembre - 30 dias");
                        break;

                    case 12:
                        System.out.println("Diciembre - 31 dias");
                        break;
                }

            } else {
                System.out.println("Error: el numero debe estar entre 1 y 12.");
            }

            System.out.print("\n¿Desea consultar otro mes? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
