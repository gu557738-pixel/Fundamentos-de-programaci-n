
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Estudiante {
    String matricula;
    String nombre;
    double calificacion;

    public Estudiante(String matricula, String nombre, double calificacion) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
}

public class AdministracionEstudiantes {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static int buscarIndice(String matricula) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).matricula.equalsIgnoreCase(matricula)) {
                return i;
            }
        }
        return -1;
    }

    // Registrar estudiante
    public static void registrar() {
        System.out.print("Ingrese matricula: ");
        String matricula = sc.nextLine();

        if (buscarIndice(matricula) != -1) {
            System.out.println("La matricula ya existe.");
            return;
        }

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese calificacion: ");
        double calificacion = Double.parseDouble(sc.nextLine());

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificacion no valida. Debe ser de 0 a 10.");
            return;
        }

        estudiantes.add(new Estudiante(matricula, nombre, calificacion));
        System.out.println("Estudiante registrado correctamente.");
    }

    // Mostrar estudiantes ordenados alfabeticamente
    public static void mostrar() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        Collections.sort(estudiantes,
            Comparator.comparing(e -> e.nombre.toLowerCase()));

        System.out.println("\n--- LISTA DE ESTUDIANTES ---");

        for (Estudiante e : estudiantes) {
            System.out.println("Matricula: " + e.matricula);
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Calificacion: " + e.calificacion);
            System.out.println("--------------------------");
        }
    }

    // Buscar estudiante
    public static void buscar() {
        System.out.print("Ingrese matricula: ");
        String matricula = sc.nextLine();

        int pos = buscarIndice(matricula);

        if (pos != -1) {
            Estudiante e = estudiantes.get(pos);
            System.out.println("Estudiante encontrado.");
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Calificacion: " + e.calificacion);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Modificar calificacion
    public static void modificar() {
        System.out.print("Ingrese matricula: ");
        String matricula = sc.nextLine();

        int pos = buscarIndice(matricula);

        if (pos != -1) {
            System.out.print("Nueva calificacion: ");
            double nueva = Double.parseDouble(sc.nextLine());

            if (nueva >= 0 && nueva <= 10) {
                estudiantes.get(pos).calificacion = nueva;
                System.out.println("Calificacion modificada.");
            } else {
                System.out.println("Calificacion no valida.");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Eliminar estudiante
    public static void eliminar() {
        System.out.print("Ingrese matricula: ");
        String matricula = sc.nextLine();

        int pos = buscarIndice(matricula);

        if (pos != -1) {
            estudiantes.remove(pos);
            System.out.println("Estudiante eliminado.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Calcular promedio general
    public static void promedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        double suma = 0;

        for (Estudiante e : estudiantes) {
            suma += e.calificacion;
        }

        double promedio = suma / estudiantes.size();

        System.out.printf("Promedio general: %.2f%n", promedio);
    }

    // Calificacion mas alta y mas baja
    public static void mayorYMenor() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        Estudiante mayor = estudiantes.get(0);
        Estudiante menor = estudiantes.get(0);

        for (Estudiante e : estudiantes) {
            if (e.calificacion > mayor.calificacion) {
                mayor = e;
            }

            if (e.calificacion < menor.calificacion) {
                menor = e;
            }
        }

        System.out.println("Calificacion mas alta:");
        System.out.println(mayor.nombre + " - " + mayor.calificacion);

        System.out.println("Calificacion mas baja:");
        System.out.println(menor.nombre + " - " + menor.calificacion);
    }

    // Mostrar estudiantes con calificacion mayor a 9
    public static void mayoresA9() {
        boolean encontrado = false;

        System.out.println("\n--- ESTUDIANTES CON MAS DE 9 ---");

        for (Estudiante e : estudiantes) {
            if (e.calificacion > 9) {
                System.out.println(e.nombre + " - " + e.calificacion);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay estudiantes con calificacion mayor a 9.");
        }
    }

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== ADMINISTRACION DE ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Modificar calificacion");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Mostrar promedio general");
            System.out.println("7. Mostrar calificacion mayor y menor");
            System.out.println("8. Mostrar estudiantes con promedio mayor a 9");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: registrar(); break;
                case 2: mostrar(); break;
                case 3: buscar(); break;
                case 4: modificar(); break;
                case 5: eliminar(); break;
                case 6: promedio(); break;
                case 7: mayorYMenor(); break;
                case 8: mayoresA9(); break;
                case 9: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opcion no valida.");
            }

        } while (opcion != 9);
    }
}
