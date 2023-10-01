/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
////Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
////constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
////luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
////numero de páginas.


import ejercicio1.Entitdad.Libro;
import java.util.Scanner;



public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Libro libro1 = new Libro();
                       
        Scanner read = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el codigo ISBN");
        libro1.setISBN(read.nextLine());
        
        System.out.println("Por favor ingrese el titulo del libro");
        libro1.setTitulo(read.nextLine());
        
        System.out.println("Por favor ingrese el nombre del autor");
        libro1.setAutor(read.nextLine());
        
        System.out.println("Por favor ingrese el numero de paginas que tiene el libro");
        libro1.setNumeroDePaginas(read.nextLine());
        
        Libro libro2 = new Libro("‎030795143X", "11/22/1963", "Stephen King", "864");
        
        System.out.println("==============================");
        System.out.println("Libro 1"); 
        System.out.println("La informacion ingresada es: " + libro1);        
        
        System.out.println("==============================");
        System.out.println("Libro 2");
        System.out.println("La informacion ingresada es: " + libro2.ISBN + " " + libro2.titulo + " " + libro2.autor + " " + libro2.numeroDePaginas);
    }   

}
