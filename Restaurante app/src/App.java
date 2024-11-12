import Service.BookService;
public class App {
public static void main(String[] args) throws Exception { 
    System.out.println( "Bienvenido a la libreria");

BookService op = new BookService();
op.createBook();
}

}