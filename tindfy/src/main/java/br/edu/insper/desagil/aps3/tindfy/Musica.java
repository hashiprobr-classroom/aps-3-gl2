package br.edu.insper.desagil.aps3.tindfy;

public class Musica {
    private Artista artista;
    private String titulo;

    public Musica(Artista artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return this.artista;
    }

    public String getTitulo() {
        return this.titulo;
    }

}
