import java.util.Comparator;

public class Pelicula {

    private String director;
    private String titulo;
    private Double duracion;

    public Pelicula(String director, String titulo, Double duracion) {
        this.director = director;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator <Pelicula> DeMayoraMenor = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator <Pelicula> DeMenoraMayor = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    
    public static Comparator <Pelicula> OrdenarAlfabeticamente = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator <Pelicula> OrdenarAlfabeticamenteDirector = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

}


