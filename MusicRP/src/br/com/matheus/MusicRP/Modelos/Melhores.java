package br.com.matheus.MusicRP.Modelos;

public class Melhores {

    public void Inclui (Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " Esta Entre os Melhores do Momento" + " Favorito de Muitos");
        } else {
            System.out.println(audio.getTitulo() + "  Todos Estão Curtindo");
        }
    }
}
