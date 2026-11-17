
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Cliente {
    int turno;
    String nombre;

    public Cliente(int turno, String nombre) {
        this.turno = turno;
        this.nombre = nombre;
    }
}

public class AtencionClientes {

    static Scanner sc = new Scanner(System.in);
    static Queue<Cliente> cola = new LinkedList<>();

    // Verificar si existe el turno
    public static boolean existeTurno(int turno) {
        for (Cliente c : cola) {
            if (c.turno == turno) {
                return true;
            }
        }
        return false;
    }

    // Registrar cliente al final de la cola
    public static void registrar() {
        System.out.print("Ingrese numero de turno: ");
        int turno = Integer.parseInt(sc.nextLine());

        if (existeTurno(turno)) {
            System.out.println("El turno ya existe.");
            return;
        }

        System.out.print("Ingrese nombre del cliente: ");
        String nombre = sc.nextLine();

        cola.offer(new Cliente(turno, nombre));

        System.out.println("Cliente agregado correctamente.");
    }

    // Atender al siguiente cliente
    public static void atender() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes esperando.");
        } else {
            Cliente c = cola.poll();

            System.out.println("\n--- CLIENTE ATENDIDO ---");
            System.out.println("Turno: " + c.turno);
            System.out.println("Nombre: " + c.nombre);
        }
    }

    // Mostrar siguiente cliente sin eliminarlo
    public static void siguiente() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes esperando.");
        } else {
            Cliente c = cola.peek();

            System.out.println("\n--- SIGUIENTE CLIENTE ---");
            System.out.println("Turno: " + c.turno);
            System.out.println("Nombre: " + c.nombre);
        }
    }

    // Mostrar todos los clientes pendientes
    public static void mostrar() {
        if (cola.isEmpty()) {
            System.out.println("La fila esta vacia.");
            return;
        }

        System.out.println("\n--- CLIENTES PENDIENTES ---");

        for (Cliente c : cola) {
            System.out.println("Turno: " + c.turno);
            System.out.println("Nombre: " + c.nombre);
            System.out.println("----------------------");
        }
    }

    // Contar clientes esperando
    public static void contar() {
        System.out.println("Cantidad de clientes esperando: " + cola.size());
    }

    // Cancelar un turno especifico
    public static void cancelar() {
        System.out.print("Ingrese el numero de turno a cancelar: ");
        int turno = Integer.parseInt(sc.nextLine());

        Iterator<Cliente> it = cola.iterator();

        while (it.hasNext()) {
            Cliente c = it.next();

            if (c.turno == turno) {
                it.remove();
                System.out.println("Turno cancelado correctamente.");
                return;
            }
        }

        System.out.println("El turno no existe.");
    }

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== ATENCION DE CLIENTES =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Atender siguiente cliente");
            System.out.println("3. Mostrar siguiente cliente");
            System.out.println("4. Mostrar todos los clientes");
            System.out.println("5. Consultar cantidad de clientes");
            System.out.println("6. Cancelar turno");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: registrar(); break;
                case 2: atender(); break;
                case 3: siguiente(); break;
                case 4: mostrar(); break;
                case 5: contar(); break;
                case 6: cancelar(); break;
                case 7: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opcion no valida.");
            }

        } while (opcion != 7);
    }
}
