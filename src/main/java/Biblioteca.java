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
        Libro libro = buscarLibro(titulo);
        if (libro == null) {
            System.out.println("El libro no existe.");
            return;
        }
        if (!libro.isDisponible()) {
            System.out.println("El libro ya está prestado.");
            return;
        }
        libro.setDisponible(false);
        System.out.println("Préstamo realizado: " + libro);
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

    public void buscarPorTitulo(String texto) {
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getTitulo().contains(texto)) {
                System.out.println("Encontrado: " + l);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Sin resultados para: " + texto);
        }
    }
}