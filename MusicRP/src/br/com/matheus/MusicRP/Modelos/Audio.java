package br.com.matheus.MusicRP.Modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCuritdas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCuritdas() {
        return totalCuritdas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void Curte(){
        this.totalCuritdas++;
    }

    public void Reproduzido(){
        this.totalReproducoes++;
    }
}
