/*
Crear un package llamado Models dentro de src.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 
**Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */

//public class App {
   // public static void main(String[] args) throws Exception {
     //   System.out.println("Hello, World!");
    //}
//}
import Models.Libro; // Definir el paquete
import java.util.Scanner; // Importar Scanner para entrada de datos

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear el objeto Scanner
        Libro miLibro = new Libro(); // Crear un objeto de la clase Libro

        // Pedir datos al usuario
        System.out.print("Ingrese el ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int numPaginas = scanner.nextInt();

        // Asignar valores al libro
        miLibro.setIsbn(isbn);
        miLibro.setTitulo(titulo);
        miLibro.setAutor(autor);
        miLibro.setNumPaginas(numPaginas);

        // Mostrar la información del libro
        miLibro.mostrarInfo();
        scanner.close(); // Cerrar el scanner para evitar advertencias
        
        
    }
}