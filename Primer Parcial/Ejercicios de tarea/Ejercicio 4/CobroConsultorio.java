import java.util.Scanner;

public class CobroConsultorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de la cita actual: ");
        int nc = scanner.nextInt();

        double cc = 0;
        double tot = 0;

        if (nc <= 3) {
            cc = 900;
            tot = nc * 900;
        } else if (nc <= 5) {
            cc = 800;
            tot = (3 * 900) + ((nc - 3) * 800);
        } else if (nc <= 8) {
            cc = 600;
            tot = (3 * 900) + (2 * 800) + ((nc - 5) * 600);
        } else {
            cc = 500;
            tot = (3 * 900) + (2 * 800) + (3 * 600) + ((nc - 8) * 500);
        }

        System.out.println("Monto a pagar por la cita actual: $" + cc);
        System.out.println("Monto total pagado hasta la cita " + nc + ": $" + tot);

        scanner.close();
    }
}