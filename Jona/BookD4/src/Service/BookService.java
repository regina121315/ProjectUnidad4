// Ubicacion del archivo
package Service;

// Libreria Scanner
import java.util.Scanner;

// Importación de la clase Book desde el paquete Model
import Model.Book;

// La clase BookService extiende la funcionalidad de la clase BookLists ubicada en el paquete Repository
public class BookService extends Repository.BookLists {
    // Crear objeto Scanner
    Scanner sc = new Scanner(System.in);
    // Crear objeto Book y una instancia de la clase Book para trabajar con libros
    Book bo = new Book();

    // Método público para registrar un nuevo libro
    public void registrarLibro() {
        // Solicitar al usuario que ingrese los atributos del libro
        System.out.println("Ingrese el titulo del libro: ");
        // Guardar lo ingresado de el usuario
        bo.setTitle(sc.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        bo.setAuthor(sc.nextLine());
        System.out.println("Ingrese la editorial: ");
        bo.setPublisher(sc.nextLine());
        System.out.println("Ingrese el numero de paginas que tiene el libro: ");
        bo.setNumPage(sc.nextInt());
        System.out.println("Ingrese el año del libro: ");
        bo.setYears(sc.nextInt());
        // Agregar el objeto Book al atributo `bl` heredado de la clase BookLists
        bl.add(bo);
        // Imprimir el contenido de la lista de libros para confirmar la operación
        System.out.println(bl.toString());
    }
}