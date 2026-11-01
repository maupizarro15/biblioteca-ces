import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== BIBLIOTECA UNIVERSITARIA ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Listar libros");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine().trim());
            switch (opcion) {
                case 1 -> {
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    biblioteca.registrarLibro(t, a);
                }
                case 2 -> {
                    System.out.print("Título a prestar: ");
                    biblioteca.prestarLibro(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Título a devolver: ");
                    biblioteca.devolverLibro(sc.nextLine());
                }
                case 4 -> biblioteca.listarLibros();
                case 0 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opción inválida.");

                case 5 -> {
                    System.out.print("Texto a buscar: ");
                    biblioteca.buscarPorTitulo(sc.nextLine());
                }
            }
        } while (opcion != 0);
    }
}