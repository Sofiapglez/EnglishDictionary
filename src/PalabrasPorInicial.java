import java.util.*;

public class PalabrasPorInicial {
    private Map<Character, Set<String>> palabrasPorInicial;

    public PalabrasPorInicial() {
        palabrasPorInicial = new HashMap<>();
    }

    public void agregarPalabra(String palabra) {
        palabra = sanitizarPalabra(palabra);

        if (!palabra.isEmpty()) {
            char inicial = palabra.charAt(0);

            Set<String> palabras = palabrasPorInicial.getOrDefault(inicial, new HashSet<>());

            if (palabras.add(palabra)) {
                System.out.println("Palabra '" + palabra + "' agregada correctamente.");
            } else {
                System.out.println("La palabra '" + palabra + "' ya estaba en el diccionario.");
            }

            palabrasPorInicial.put(inicial, palabras);
        }
    }

    public void eliminarPalabra(String palabra) {
        palabra = sanitizarPalabra(palabra);

        if (!palabra.isEmpty()) {
            char inicial = palabra.charAt(0);

            Set<String> palabras = palabrasPorInicial.getOrDefault(inicial, new HashSet<>());

            if (palabras.remove(palabra)) {
                System.out.println("Palabra '" + palabra + "' eliminada correctamente.");
                palabrasPorInicial.put(inicial, palabras);
            } else {
                System.out.println("La palabra '" + palabra + "' no estaba en el diccionario.");
            }
        }
    }

    public boolean existePalabra(String palabra) {
        palabra = sanitizarPalabra(palabra);

        if (!palabra.isEmpty()) {
            char inicial = palabra.charAt(0);

            Set<String> palabras = palabrasPorInicial.getOrDefault(inicial, new HashSet<>());

            if (palabras.contains(palabra)) {
                System.out.println("La palabra '" + palabra + "' está en el diccionario.");
                return true;
            } else {
                System.out.println("La palabra '" + palabra + "' no está en el diccionario.");
            }
        }

        return false;
    }

    public void mostrarInicialesDisponibles() {
        if (palabrasPorInicial.isEmpty()) {
            System.out.println("No hay palabras en el diccionario.");
        } else {
            System.out.println("Iniciales disponibles: " + palabrasPorInicial.keySet());
        }
    }

    public void verPalabrasPorInicial(char inicial) {
        inicial = Character.toLowerCase(inicial);

        Set<String> palabras = palabrasPorInicial.getOrDefault(inicial, new HashSet<>());

        System.out.println("Palabras que empiezan por '" + inicial + "': " + palabras);
    }

    private String sanitizarPalabra(String palabra) {
        return palabra.toLowerCase().trim();
    }

}
