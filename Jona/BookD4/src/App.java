
// Importación de la clase BookService desde el paquete Service
import Service.BookService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la libreria");
        // Creación de una instancia de la clase BookService para manejar la lógica de
        // libros
        BookService bs = new BookService();
        // Llamada al método registrarLibro para permitir al usuario registrar un libro
        bs.registrarLibro();
    }
}