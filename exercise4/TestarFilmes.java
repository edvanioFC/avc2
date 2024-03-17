package exercise4;

/**
 * The TestarFilmes class is used to test the functionality of the Filmes class.
 */
public class TestarFilmes {
    /**
     * The main method of the TestarFilmes class.
     * 
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create instances of Filmes class with different movie titles and durations
        Filmes filme1 = new Filmes("Os Vingadores", 142);
        filme1.exibirDuracaoEmHoras();

        Filmes filme2 = new Filmes("Hotel Transilvânia", 93);
        filme2.exibirDuracaoEmHoras();

        // Display the titles of the movies currently in theaters
        System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());

        Filmes filme3 = new Filmes("Unica Filha", 154);
        filme3.exibirDuracaoEmHoras();
        Filmes filme4 = new Filmes("Nuestros Amantes", 136);
        filme4.exibirDuracaoEmHoras();
        Filmes filme5 = new Filmes("O Senhor dos Anéis: A Sociedade do Anel", 178);
        filme5.exibirDuracaoEmHoras();
        Filmes filme6 = new Filmes("Interestelar", 169);
        filme6.exibirDuracaoEmHoras();
        Filmes filme7 = new Filmes("A guerra do kuduro", 142);
        filme7.exibirDuracaoEmHoras();       
    }
}
