package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa{

    private List<Musica> musicas;

    public Usuario(Integer id, String nome, List<Musica> musicas) {
        super(id, nome);
        this.musicas = musicas;
    }

    public List<Musica> getMusicas() {return musicas;}


    public Boolean jaAdicionou(Musica musica) {

        for (Musica musicaTeste : musicas) {
            if ((int) musica.getArtista().getId() == (int) (musicaTeste.getArtista().getId())) {
                if (musica.getTitulo().equals(musicaTeste.getTitulo())) {
                    return true;
                }
            }
        }
        return false;
    }


    public void adiciona(Musica musica){
            if (jaAdicionou(musica) == false){
                musicas.add(musica);
            }

        }








}
