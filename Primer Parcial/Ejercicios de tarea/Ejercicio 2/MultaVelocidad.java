import java.util.Scanner;

public class MultaVelocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidad;
        int resultado;
        boolean cumpleanos;

        System.out.print("Ingrese la velocidad: ");
        velocidad = sc.nextInt();

        System.out.print("¿Es tu cumpleaños? (true/false): ");
        cumpleanos = sc.nextBoolean();

        int limite1 = cumpleanos ? 65 : 60;
        int limite2 = cumpleanos ? 85 : 80;

        if (velocidad <= limite1) {
            resultado = 0;
        } else if (velocidad <= limite2) {
            resultado = 1;
        } else {
            resultado = 2;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
