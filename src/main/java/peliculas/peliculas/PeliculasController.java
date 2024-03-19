package peliculas.peliculas;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController() {
        peliculas.add(new Peliculas(1, "Harry Potter y la orden del Fenix", 2017,"David Yates","Fantasía, Ciencia Ficción","Cuando la ignorancia de una nueva profesora deja a Hogwarts sin la preparación suficiente para luchar contra el demonio, Harr le enseña a un pequeño grupo de estudiantes a defenderse en contra de las artes oscuras."));
        peliculas.add(new Peliculas(2, "Inception", 2010,"Christopher Nolan","Drama, Suspenso","Dom Cobb es un ladrón capaz de adentrarse en los sueños de la gente y hacerse con sus secretos."));
    }
    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas(){
        return peliculas;
    }
    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculasById(@PathVariable int id) {
        for(Peliculas pelicula: peliculas){
            if(pelicula.getId() == id){
                return pelicula;
            }
        }
        return null;
    }
    
}

/*id, titulo, año,director, género y sinopsis*/