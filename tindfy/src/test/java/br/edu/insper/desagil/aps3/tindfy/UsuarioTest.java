package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {


    private Artista artista = new Artista(1,"Freddy Fazbear");
    private Musica musica1 = new Musica(artista,"Wonder_of_U");
    private Musica musica2 = new Musica(artista,"Bili jin");
    private Musica musica3 = new Musica(artista,"Escavadeira");
    //private Musica musica4 = new Musica(artista,"Lego");
    private List<Musica> favoritas = new ArrayList<>();
    private Usuario usuario;

    @BeforeEach
    void setUp(){
        favoritas.add(musica1);
        favoritas.add(musica2);
        favoritas.add(musica3);
        usuario = new Usuario(2,"Cleberton",favoritas);
    }

    @Test
    void naoAdiciona(){
        usuario.adiciona(musica1);
        assertEquals(3,usuario.getMusicas().size());
    }
    @Test
    void adiciona(){
        Musica musica4 = new Musica(artista,"musica 4");
        usuario.adiciona(musica4);
        assertEquals(4,usuario.getMusicas().size());

    }
}


