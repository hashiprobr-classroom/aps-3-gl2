package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupidoMusicalTest {

    private CupidoMusical cupido;
    private Usuario usuario1;
    private Usuario usuario2;
    private Musica musica;

    @BeforeEach
    void setUp() {
        Artista artista = new Artista(1, "Lex Luthor Produções");
        musica= new Musica(artista, "Corre corre Superman!");
        List<Musica> musicas1 = new ArrayList<>();
        List<Musica> musicas2 = new ArrayList<>();
        usuario1 = new Usuario(2, "Cleberton", musicas1);
        usuario2 = new Usuario(8, "Clabineide", musicas2);
        Map<Integer, List<Integer>> likes = new HashMap<>();
        cupido = new CupidoMusical(likes);
    }

    @Test
    void semLikesComMusicas() {
        usuario1.adiciona(musica);
        usuario2.adiciona(musica);
        assertEquals(false, cupido.deuMatch(usuario1, usuario2));
    }

    @Test
    void comLikesSemMusicas() {
        cupido.deuLike(2, 8);
        cupido.deuLike(8, 2);

        assertEquals(false, cupido.deuMatch(usuario1, usuario2));
    }

    @Test
    void comLikesComMusicas() {
        usuario1.adiciona(musica);
        usuario2.adiciona(musica);
        cupido.deuLike(2, 8);
        cupido.deuLike(8, 2);

        assertEquals(true, cupido.deuMatch(usuario1, usuario2));
    }
}
