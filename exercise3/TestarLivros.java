package exercise3;

/**
 * Test class for the Livros class.
 */
public class TestarLivros {
    /**
     * Main method to test the Livros class.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Creating a favorite book object
        Livros livroFavorito = new Livros("O Pequeno Príncipe", 98, 0);

        // Setting and displaying the title and number of pages of the book
        livroFavorito.setTitulo("O Pequeno Príncipe");
        livroFavorito.setQtdPaginas(98);
        System.out.println("O livro " + livroFavorito.getTitulo() + " possui " + livroFavorito.getQtdPaginas() + " páginas");

        // Setting the number of pages read and displaying the reading progress
        livroFavorito.setPaginasLidas(20);
        livroFavorito.verificarProgresso();

        livroFavorito.setPaginasLidas(50);
        livroFavorito.verificarProgresso();

        // Creating an array to store other books
        Livros[] outrosLivros = new Livros[10];
        outrosLivros[0] = new Livros("Dom Casmurro", 200, 50);
        outrosLivros[1] = new Livros("Harry Potter e a Pedra Filosofal", 300, 100);
        outrosLivros[2] = new Livros("O Senhor dos Anéis", 1000, 500);
        outrosLivros[3] = new Livros("1984", 350, 200);
        outrosLivros[4] = new Livros("A Revolução dos Bichos", 150, 75);
        outrosLivros[5] = new Livros("Cem Anos de Solidão", 400, 150);
        outrosLivros[6] = new Livros("Crime e Castigo", 600, 300);
        outrosLivros[7] = new Livros("O Iluminado", 500, 250);
        outrosLivros[8] = new Livros("A Metamorfose", 100, 20);
        outrosLivros[9] = new Livros("A Culpa é das Estrelas", 250, 100);

        // Displaying the reading progress of other books
        for (int i = 0; i < outrosLivros.length; i++) {
            System.out.println("\nLivro: " + outrosLivros[i].getTitulo());
            outrosLivros[i].verificarProgresso();
        }
    }
}
