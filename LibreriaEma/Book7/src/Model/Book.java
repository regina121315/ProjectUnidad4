//ubicacion de la carpeta
package Model;

//nombre de la clase
public class Book {
    // atributos de la clase book
    private int numPages, year;
    private String title, author, publisher;

    // metodos gets y sets para obtener los atributos y establecer los atributos
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book [numPages=" + numPages + ", year=" + year + ", title=" + title + ", author=" + author
                + ", publisher=" + publisher + "]";
    }

}
