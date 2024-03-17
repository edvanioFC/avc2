package exercise4;

/**
 * The Filmes class represents a movie with its title and duration in minutes.
 */
public class Filmes {
    // Private attributes
    private String titulo;
    private int duracaoEmMinutos;

    /**
     * Default constructor for the Filmes class.
     */
    public Filmes() {}

    /**
     * Constructor for the Filmes class with parameters.
     * 
     * @param titulo            The title of the movie.
     * @param duracaoEmMinutos  The duration of the movie in minutes.
     */
    public Filmes(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Gets the title of the movie.
     * 
     * @return The title of the movie.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the title of the movie.
     * 
     * @param titulo The title of the movie.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Gets the duration of the movie in minutes.
     * 
     * @return The duration of the movie in minutes.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * Sets the duration of the movie in minutes.
     * 
     * @param duracaoEmMinutos The duration of the movie in minutes.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Displays the duration of the movie in hours and minutes.
     */
    public void exibirDuracaoEmHoras() {
        // Calculate hours and remaining minutes
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        // Print the duration in hours and minutes
        System.out.println("O filme " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração");
    }
}
