
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Tarea {
    int id;
    String descripcion;
    String prioridad;
    boolean completada;

    public Tarea(int id, String descripcion, String prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }
}

public class GestionTareas {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Tarea> tareas = new LinkedList<>();

    // Buscar tarea por identificador
    public static int buscarId(int id) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).id == id) {
                return i;
            }
        }
        return -1;
    }

    // Crear una nueva tarea
    public static Tarea crearTarea() {
        System.out.print("Ingrese identificador: ");
        int id = Integer.parseInt(sc.nextLine());

        if (buscarId(id) != -1) {
            System.out.println("El identificador ya existe.");
            return null;
        }

        System.out.print("Ingrese descripcion: ");
        String descripcion = sc.nextLine();

        System.out.print("Ingrese prioridad (Alta, Media, Baja): ");
        String prioridad = sc.nextLine();

        return new Tarea(id, descripcion, prioridad);
    }

    // Agregar tarea al inicio
    public static void agregarInicio() {
        Tarea t = crearTarea();

        if (t != null) {
            tareas.addFirst(t);
            System.out.println("Tarea agregada al inicio.");
        }
    }

    // Agregar tarea al final
    public static void agregarFinal() {
        Tarea t = crearTarea();

        if (t != null) {
            tareas.addLast(t);
            System.out.println("Tarea agregada al final.");
        }
    }

    // Insertar tarea en una posicion especifica
    public static void insertarPosicion() {
        Tarea t = crearTarea();

        if (t == null) {
            return;
        }

        System.out.print("Ingrese posicion (1 a " +
            (tareas.size() + 1) + "): ");

        int posicion = Integer.parseInt(sc.nextLine());

        if (posicion >= 1 && posicion <= tareas.size() + 1) {
            tareas.add(posicion - 1, t);
            System.out.println("Tarea insertada correctamente.");
        } else {
            System.out.println("Posicion no valida.");
        }
    }

    // Eliminar tarea por identificador
    public static void eliminar() {
        System.out.print("Ingrese ID de la tarea: ");
        int id = Integer.parseInt(sc.nextLine());

        int pos = buscarId(id);

        if (pos != -1) {
            tareas.remove(pos);
            System.out.println("Tarea eliminada correctamente.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    // Buscar tarea por descripcion
    public static void buscarDescripcion() {
        System.out.print("Ingrese descripcion a buscar: ");
        String descripcion = sc.nextLine();

        boolean encontrado = false;

        for (Tarea t : tareas) {
            if (t.descripcion.toLowerCase().contains(
                descripcion.toLowerCase())) {

                mostrarTarea(t);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tareas.");
        }
    }

    // Mostrar informacion de una tarea
    public static void mostrarTarea(Tarea t) {
        System.out.println("ID: " + t.id);
        System.out.println("Descripcion: " + t.descripcion);
        System.out.println("Prioridad: " + t.prioridad);
        System.out.println("Estado: " +
            (t.completada ? "Completada" : "Pendiente"));
        System.out.println("--------------------------");
    }

    // Mostrar todas las tareas
    public static void mostrar() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n--- LISTA DE TAREAS ---");

        for (Tarea t : tareas) {
            mostrarTarea(t);
        }
    }

    // Marcar tarea como completada
    public static void completar() {
        System.out.print("Ingrese ID de la tarea: ");
        int id = Integer.parseInt(sc.nextLine());

        int pos = buscarId(id);

        if (pos != -1) {
            tareas.get(pos).completada = true;
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }

    // Mostrar primera y ultima tarea
    public static void primeraYUltima() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n--- PRIMERA TAREA ---");
        mostrarTarea(tareas.getFirst());

        System.out.println("\n--- ULTIMA TAREA ---");
        mostrarTarea(tareas.getLast());
    }

    // Recorrer lista en orden inverso
    public static void inverso() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("\n--- TAREAS EN ORDEN INVERSO ---");

        Iterator<Tarea> it = tareas.descendingIterator();

        while (it.hasNext()) {
            mostrarTarea(it.next());
        }
    }

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== GESTION DE TAREAS =====");
            System.out.println("1. Agregar tarea al inicio");
            System.out.println("2. Agregar tarea al final");
            System.out.println("3. Insertar tarea en posicion");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Buscar tarea por descripcion");
            System.out.println("6. Mostrar todas las tareas");
            System.out.println("7. Marcar tarea como completada");
            System.out.println("8. Mostrar primera y ultima tarea");
            System.out.println("9. Recorrer lista en orden inverso");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: agregarInicio(); break;
                case 2: agregarFinal(); break;
                case 3: insertarPosicion(); break;
                case 4: eliminar(); break;
                case 5: buscarDescripcion(); break;
                case 6: mostrar(); break;
                case 7: completar(); break;
                case 8: primeraYUltima(); break;
                case 9: inverso(); break;
                case 10: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opcion no valida.");
            }

        } while (opcion != 10);
    }
}

