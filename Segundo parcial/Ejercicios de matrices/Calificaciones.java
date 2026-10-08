import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();

        System.out.print("Ingrese la cantidad de exámenes: ");
        int m = sc.nextInt();

        double[][] calificaciones = new double[n][m];

        // Llenar matriz
        for (int i = 0; i < n; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < m; j++) {

                do {

                    System.out.print("Calificación del examen "
                            + (j + 1) + ": ");

                    calificaciones[i][j] = sc.nextDouble();

                    if (calificaciones[i][j] < 0 || calificaciones[i][j] > 10) {

                        System.out.println(
                                "La calificación debe estar entre 0 y 10.");
                    }

                } while (calificaciones[i][j] < 0
                        || calificaciones[i][j] > 10);
            }
        }

        // Mostrar matriz
        System.out.println("\n========== CALIFICACIONES ==========");

        for (int i = 0; i < n; i++) {

            System.out.print("Estudiante " + (i + 1) + ": ");

            for (int j = 0; j < m; j++) {

                System.out.print(calificaciones[i][j] + "\t");
            }

            System.out.println();
        }

        // Promedios
        double[] promedios = new double[n];

        System.out.println("\n========== PROMEDIOS ==========");

        for (int i = 0; i < n; i++) {

            double suma = 0;

            for (int j = 0; j < m; j++) {
                suma += calificaciones[i][j];
            }

            promedios[i] = suma / m;

            System.out.println("Estudiante " + (i + 1)
                    + ": " + promedios[i]);
        }

        // Buscar mejor promedio
        double mejorPromedio = promedios[0];

        for (int i = 1; i < n; i++) {

            if (promedios[i] > mejorPromedio) {
                mejorPromedio = promedios[i];
            }
        }

        System.out.println("\n========== MEJORES ESTUDIANTES ==========");

        System.out.println("Mejor promedio: " + mejorPromedio);

        for (int i = 0; i < n; i++) {

            if (promedios[i] == mejorPromedio) {

                System.out.println("Estudiante " + (i + 1)
                        + " con promedio de " + promedios[i]);
            }
        }

        // Contar estudiantes entre 9 y 10
        int cantidadBuenos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {
                cantidadBuenos++;
            }
        }

        // Matriz nueva para estudiantes de 9 a 10
        double[][] buenos = new double[cantidadBuenos][m + 1];

        int posicionBuenos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] >= 9 && promedios[i] <= 10) {

                // Guardamos las calificaciones
                for (int j = 0; j < m; j++) {
                    buenos[posicionBuenos][j] = calificaciones[i][j];
                }

                // Última posición = promedio
                buenos[posicionBuenos][m] = promedios[i];

                posicionBuenos++;
            }
        }

        System.out.println("\n--- Estudiantes con promedio de 9 a 10 ---");

        if (cantidadBuenos == 0) {

            System.out.println("No hay estudiantes con promedio de 9 a 10.");

        } else {

            for (int i = 0; i < cantidadBuenos; i++) {

                System.out.print("Estudiante con calificaciones: ");

                for (int j = 0; j < m; j++) {
                    System.out.print(buenos[i][j] + "\t");
                }

                System.out.println("Promedio: " + buenos[i][m]);
            }
        }

        // Contar estudiantes con promedio menor a 7
        int cantidadBajos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {
                cantidadBajos++;
            }
        }

        // Matriz nueva para estudiantes con promedio menor a 7
        double[][] bajos = new double[cantidadBajos][m + 1];

        int posicionBajos = 0;

        for (int i = 0; i < n; i++) {

            if (promedios[i] < 7) {

                for (int j = 0; j < m; j++) {
                    bajos[posicionBajos][j] = calificaciones[i][j];
                }

                bajos[posicionBajos][m] = promedios[i];

                posicionBajos++;
            }
        }

        System.out.println("\n--- Estudiantes con promedio menor a 7 ---");

        if (cantidadBajos == 0) {

            System.out.println("No hay estudiantes con promedio menor a 7.");

        } else {

            for (int i = 0; i < cantidadBajos; i++) {

                System.out.print("Estudiante con calificaciones: ");

                for (int j = 0; j < m; j++) {
                    System.out.print(bajos[i][j] + "\t");
                }

                System.out.println("Promedio: " + bajos[i][m]);
            }
        }

        // Examen con mayor promedio
        double mayorExamen = -1;
        int examenMayor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }

            double promedioExamen = suma / n;

            if (promedioExamen > mayorExamen) {
                mayorExamen = promedioExamen;
                examenMayor = j;
            }
        }

        System.out.println("\n========== EXAMEN MÁS ALTO ==========");

        System.out.println("El examen con mayor promedio fue el examen "
                + (examenMayor + 1));

        System.out.println("Promedio: " + mayorExamen);

        // Examen con menor promedio
        double menorExamen = 11;
        int examenMenor = 0;

        for (int j = 0; j < m; j++) {

            double suma = 0;

            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }

            double promedioExamen = suma / n;

            if (promedioExamen < menorExamen) {
                menorExamen = promedioExamen;
                examenMenor = j;
            }
        }

        System.out.println("\n========== EXAMEN MÁS BAJO ==========");

        System.out.println("El examen con menor promedio fue el examen "
                + (examenMenor + 1));

        System.out.println("Promedio: " + menorExamen);

        sc.close();
    }
}