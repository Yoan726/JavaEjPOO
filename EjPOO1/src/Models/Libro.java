package Models; // Declaramos el paquete Models dentro de src
// Definimos la clase Libro
public class Libro {
    // Atributos privados de la clase
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con parámetros para inicializar todos los atributos
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
        // Métodos setters para asignar valores
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public void mostrarInfo() {
    System.out.println("ISBN: " + isbn);
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Páginas: " + numPaginas);
}
}

