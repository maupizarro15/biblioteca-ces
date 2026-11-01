import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros = new ArrayList<>();

    public void registrarLibro(String titulo, String autor) {
        Libro libro = new Libro(titulo, autor);
        libros.add(libro);
        System.out.println("Libro registrado: " + libro);
    }

    
    public void prestarLibro(String titulo) {
        System.out.println("Funcionalidad pendiente: préstamos");
    }

    public void devolverLibro(String titulo) {
        System.out.println("Funcionalidad pendiente: devoluciones");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro l : libros) {
            System.out.println(l + (l.isDisponible() ? " [disponible]" : " [prestado]"));
        }
    }

    private Libro buscarLibro(String titulo) {
        for (Libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}