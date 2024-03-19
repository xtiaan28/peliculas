package peliculas.peliculas;

public class Peliculas {
    
    private int id;
    private String titulo;
    private int año;
    private String director;
    private String genero;
    private String sipnosis;

    public Peliculas( int id, String titulo, int año, String director, String genero, String sipnosis){
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.genero = genero;
        this.sipnosis = sipnosis;
    }

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAño(){
        return año;
    }
    public String getDirector(){
        return director;
    }
    public String getGenero(){
        return genero;
    }
    public String getSipnosis(){
        return sipnosis;
    }
}
