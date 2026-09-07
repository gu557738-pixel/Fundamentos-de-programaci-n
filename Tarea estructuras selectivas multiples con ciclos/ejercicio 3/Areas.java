import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double lado, largo, ancho, base, altura, radio, area;

        do {

            System.out.println("\n===== MENU DE AREAS =====");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el lado: ");
                    lado = entrada.nextDouble();

                    area = lado * lado;

                    System.out.println("Area del cuadrado: " + area);
                    break;

                case 2:
                    System.out.print("Ingrese el largo: ");
                    largo = entrada.nextDouble();

                    System.out.print("Ingrese el ancho: ");
                    ancho = entrada.nextDouble();

                    area = largo * ancho;

                    System.out.println("Area del rectangulo: " + area);
                    break;

                case 3:
                    System.out.print("Ingrese la base: ");
                    base = entrada.nextDouble();

                    System.out.print("Ingrese la altura: ");
                    altura = entrada.nextDouble();

                    area = (base * altura) / 2;

                    System.out.println("Area del triangulo: " + area);
                    break;

                case 4:
                    System.out.print("Ingrese el radio: ");
                    radio = entrada.nextDouble();

                    area = Math.PI * radio * radio;

                    System.out.println("Area del circulo: " + area);
                    break;

                case 5:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}

