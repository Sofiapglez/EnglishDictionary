import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalabrasPorInicial palabrasClasificadas = new PalabrasPorInicial();

        while (true) {
            System.out.println("Bienvenido!");
            System.out.println("Elija una opción:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Buscar palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca una palabra:");
                    String palabra = scanner.nextLine();
                    palabrasClasificadas.agregarPalabra(palabra);
                    break;
                case 2:
                    System.out.println("Introduzca una palabra:");
                    palabra = scanner.nextLine();
                    palabrasClasificadas.eliminarPalabra(palabra);
                    break;
                case 3:
                    System.out.println("Introduzca una palabra:");
                    palabra = scanner.nextLine();
                    palabrasClasificadas.existePalabra(palabra);
                    break;
                case 4:
                    palabrasClasificadas.mostrarInicialesDisponibles();
                    break;
                case 5:
                    System.out.println("Introduzca una inicial:");
                    char inicial = scanner.nextLine().charAt(0);
                    palabrasClasificadas.verPalabrasPorInicial(inicial);
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

}
