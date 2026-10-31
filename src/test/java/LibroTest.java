import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LibroTest {
    @Test
    void libroNuevoEstaDisponible() {
        Libro l = new Libro("Don Quijote", "Cervantes");
        assertTrue(l.isDisponible());
    }
}