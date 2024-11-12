package Service;

import java.util.Scanner;

import Model.Book;

import Repository.BookList;

public class BookService extends Repository.BookList {// extends es para heredar en este caso de ListBook

public void createBook(){//función para crear registro de los libros

Scanner in =new Scanner(System.in);//crear objeto de Scanner.

Book libro =new Book();//crear un nuevo objeto libro //Book es del model y "libro es el nombre de mi nuevo objeto book

System.out.println( "Ingresa el nombre del libro");

libro.setTitle(in.nextLine());//del nuevo abjeto, pasarle funcion set y almacenarlo dentro del Scanner

System.out.println( "Ingresa el autor del libro");

libro.setAuthor(in.next());

System.out.println( "Ingresa el numero de paginas del libro");

libro.setNo(in.nextInt());

System.out.println("Ingresa la editorial del libro");


libro.setPublisher(in.next());//no agarraba nextLine

nd.add(libro);//se manda a llamar el Arraylist y el objeto libro se agrega a ese arreglo

System.out.println(nd.toString());//imprimir el arraylist con metodo to string

}

}