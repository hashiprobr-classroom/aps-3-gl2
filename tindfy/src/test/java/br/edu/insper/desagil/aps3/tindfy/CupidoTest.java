package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CupidoTest {




        private Cupido cupido;
        private Usuario usuario1;
        private Usuario usuario2;

    @BeforeEach
        void setUp(){
            //o null no valor das musicas foi obtido atraves do metodo de troubleshooting ensinado nas aulas. Portanto faz parte da materia.
            usuario1 = new Usuario(2,"Cleberton",null);
            usuario2 = new Usuario(8,"Clabineide",null);
            Map<Integer, List<Integer>> likes = new HashMap<>();
            cupido = new Cupido(likes);
        }

        @Test
        void ninguemDaLike(){
            assertEquals(false, (cupido.deuMatch(usuario1,usuario2)));
        }

        @Test
        void primeiroDaLike(){
            cupido.deuLike(2,8);
            assertEquals(false, (cupido.deuMatch(usuario1,usuario2)));
        }

        @Test
        void segundoDaLike(){
            cupido.deuLike(8,2);
            assertEquals(false, (cupido.deuMatch(usuario1,usuario2)));
        }


        @Test
        void osDoisDaoLike(){
            cupido.deuLike(2,8);
            cupido.deuLike(8,2);
            assertEquals(true, (cupido.deuMatch(usuario1,usuario2)));
        }


}



