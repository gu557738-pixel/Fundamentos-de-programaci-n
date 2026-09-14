import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        char operador;
        char continuar;
        double resultado;

        do {

            System.out.print("Ingrese el primer numero: ");
            num1 = entrada.nextInt();

            System.out.print("Ingrese el segundo numero: ");
            num2 = entrada.nextInt();

            System.out.print("Ingrese la operacion (+, -, *, /): ");
            operador = entrada.next().charAt(0);

            switch (operador) {

                case '+':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '*':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: division por cero.");
                    } else {
                        resultado = (double) num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                default:
                    System.out.println("Operacion no valida.");
            }

            System.out.print("\n¿Desea realizar otra operacion? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Programa terminado.");

        entrada.close();
    }
}
