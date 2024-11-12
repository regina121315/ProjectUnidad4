import Service.BookService;

//nombre de la clase
public class App {
    // metodo main
    public static void main(String[] args) throws Exception {
        // muestra un mensaje de bienvenida
        System.out.println("Bienvenido a la libreria");
        // crea un objeto book y lo guarda en el createBook
        BookService nm = new BookService();
        nm.createBook();
    }
}