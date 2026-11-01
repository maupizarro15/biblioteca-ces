import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros = new ArrayList<>();

    public void registrarLibro(String titulo, String autor) {
        System.out.println("Funcionalidad pendiente: registro de libros");
    }

    public void prestarLibro(String titulo) {
        System.out.println("Funcionalidad pendiente: préstamos");
    }

    public void devolverLibro(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro == null) {
            System.out.println("El libro no existe.");
            return;
        }
        if (libro.isDisponible()) {
            System.out.println("El libro no estaba prestado.");
            return;
        }
        libro.setDisponible(true);
        System.out.println("Devolución registrada: " + libro);
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