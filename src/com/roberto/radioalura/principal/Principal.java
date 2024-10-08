package com.roberto.radioalura.principal;

import com.roberto.radioalura.modelos.Cancion;
import com.roberto.radioalura.modelos.MisFavoritos;
import com.roberto.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i <  100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        System.out.println("Total de reproducciones canción: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta canción: " + miCancion.getTotalDeMeGusta());
        // podcast
        for (int i = 0; i <  100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }
        System.out.println("Total de reproducciones podcast: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta podcast: " + miPodcast.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
