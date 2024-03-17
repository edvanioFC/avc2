package exercise3;

import java.text.DecimalFormat;

/**
 * The Livros class represents a book with its title, total number of pages, and number of pages read.
 * @author Edvanio Correia
 */
public class Livros {
    // Private attributes
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    /**
     * Default constructor for the Livros class.
     */
    public Livros() {}

    /**
     * Constructor for the Livros class with parameters.
     * 
     * @param titulo        The title of the book.
     * @param qtdPaginas    The total number of pages in the book.
     * @param paginasLidas  The number of pages read in the book.
     */
    public Livros(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }

    /**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the title of the book.
     * 
     * @param titulo The title of the book.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Gets the total number of pages in the book.
     * 
     * @return The total number of pages in the book.
     */
    public int getQtdPaginas() {
        return qtdPaginas;
    }

    /**
     * Sets the total number of pages in the book.
     * 
     * @param qtdPaginas The total number of pages in the book.
     */
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    /**
     * Gets the number of pages read in the book.
     * 
     * @return The number of pages read in the book.
     */
    public int getPaginasLidas() {
        return paginasLidas;
    }

    /**
     * Sets the number of pages read in the book.
     * 
     * @param paginasLidas The number of pages read in the book.
     */
    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    /**
     * Calculates and displays the reading progress of the book in percentage.
     */
    public void verificarProgresso() {
        // Calculate the percentage of pages read
        double porcentagem = ((double) paginasLidas / qtdPaginas) * 100;
        // Using DecimalFormat to limit to 4 decimal places
        DecimalFormat df = new DecimalFormat("#.####");
        // Display the reading progress
        System.out.println("Você já leu " + df.format(porcentagem) + " por cento do livro");
    }
}
