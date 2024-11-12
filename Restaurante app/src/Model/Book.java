package Model;
public class Book {
private int no;
private String title, author, publisher;
public Book(){}
public Book (int no, String title, String author, String publisher) {
this.no=no;
this.title=title;
this.author=author;
this.publisher=publisher;

}

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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
}
