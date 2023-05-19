package br.com.matheus.MusicRP.Principal;

import br.com.matheus.MusicRP.Modelos.Audio;
import br.com.matheus.MusicRP.Modelos.Melhores;
import br.com.matheus.MusicRP.Modelos.Musica;
import br.com.matheus.MusicRP.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica =  new Musica();
        minhaMusica.setTitulo("Melhor Só ");
        minhaMusica.setArtista("Mc Caveirinha Ft. KayBlack");
        minhaMusica.setGenero("Trap");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.Reproduzido();
        }
        for (int x = 0; x < 100; x++);
        minhaMusica.Curte();


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PodPah Podcast");
        meuPodcast.setApresentador("Mitico & Igor Cavaleri");
        meuPodcast.setConvidado("Alanzoka");

        for (int i = 0; i < 1000 ; i++);
        meuPodcast.Curte();

        for (int x = 0; x < 1000 ; x++);
        meuPodcast.Reproduzido();

        Melhores melhores = new Melhores();
        melhores.Inclui(minhaMusica);
        melhores.Inclui(meuPodcast);
    }
}
