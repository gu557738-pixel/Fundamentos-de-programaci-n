import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            n = entrada.nextInt();

            if (n != 0) {

                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }

                System.out.println();
            }

        } while (n != 0);

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
