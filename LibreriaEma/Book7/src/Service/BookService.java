//obicacion de la carpeta
package Service;

//libreria para llamar al model book
import Model.Book;
import java.util.Scanner;

//extends es para heredar la listaLibros
public class BookService extends Repository.listaLibros {
    // funcion para crear el registro de los libros
    public void createBook() {
        // objeto scanner
        Scanner op = new Scanner(System.in);
        // objeto model book
        Book book = new Book();
        // pide al usuario un dato y lo guarda en el titulo
        System.out.println("Ingresa un nombre del libro");
        book.setTitle(op.nextLine());
        // pide al usuario un dato y lo guarda en el autor
        System.out.println("Ingresa un autor del libro");
        book.setAuthor(op.nextLine());
        // pide al usuario un dato y lo guarda en las paginas del libro
        System.out.println("Ingresa el numero de paginas del libro");
        book.setNumPages(op.nextInt());
        // pide al usuario un dato y lo guarda en el editorial
        System.out.println("Ingresa la editorial del libro");
        book.setPublisher(op.nextLine());
        // pide al usuario otro dato y lo guarda en el año
        System.out.println("Ingresa el año del libro");
        book.setYear(op.nextInt());
        // manda a llamar el ArrayList y el objeto libro se agrega en el arreglo
        em.add(book);
        // imprime el ArrayList con el metodo toString
        System.out.println(em.toString());
    }
}