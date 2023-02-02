package com.mycompany.exerciciofinal1;

public class MP3Player implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("Acionado botão Play.");
    }

    @Override
    public void pause() {
        System.out.println("Acionado botão Pause.");
    }

    @Override
    public void stop() {
        System.out.println("Acionado botão Stop.");
    }
}
