// Ubicacion del archivo
package Model;

public class Book {
    // Atributos privados de la clase Book
    private int numPage, years;
    private String title, author, publisher;

    // Metodo getts y setts para obtene los atributos y para establecer atributos
    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
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

    // Sobrescritura del método toString para representar al objeto Book como una cadena
    @Override
    public String toString() {
        return "Book [numPage=" + numPage + ", years=" + years + ", title=" + title + ", author=" + author
                + ", publisher=" + publisher + "]";
    }

}
