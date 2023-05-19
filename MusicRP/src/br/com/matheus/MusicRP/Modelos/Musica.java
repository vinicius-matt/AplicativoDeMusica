package br.com.matheus.MusicRP.Modelos;

public class Musica extends Audio {
    private String Album;
    private String Artista;
    private String genero;

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() >= 2000){
            System.out.println("Esta Entre as mais Tocadas,Melhores do momento");
            return 10;
        } else if(this.getTotalReproducoes() >= 500 ){
            System.out.println("Bem Avaliada, Ouça mais Tarde");
            return 8;
        } else if (this.getTotalReproducoes() >= 100 ){
            System.out.println("Musica Mal Avaliada");
            return 4;
        }
        return 0;
    }
}
