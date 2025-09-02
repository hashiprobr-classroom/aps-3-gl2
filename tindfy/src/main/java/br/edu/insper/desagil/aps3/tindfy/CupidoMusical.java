package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;
import java.util.Map;

public class CupidoMusical extends Cupido {

    public CupidoMusical(Map<Integer, List<Integer>> likes) {
        super(likes);
    }

    @Override
    public Boolean deuMatch(Usuario usuario1, Usuario usuario2) {
        if (super.deuMatch(usuario1, usuario2)) {

            List<Musica> musicas = usuario1.getMusicas();

            for (Musica m1 : musicas) {
                if(usuario2.jaAdicionou(m1)){
                    return true;
                }

            }
        }
        return false;
    }
}
