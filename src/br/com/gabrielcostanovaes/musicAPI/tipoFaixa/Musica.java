package br.com.gabrielcostanovaes.musicAPI.tipoFaixa;

public class Musica extends Audio{
    private String autor;
    private String album;

    @Override
    public void imprimirInfo(){
        System.out.println("Autor: "+ getAutor());
        System.out.println("Album: "+ getAlbum());

        super.imprimirInfo();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
