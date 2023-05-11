package org.example;

public class Main {
    public static void main(String[] args){

        Character cheat = new AlwaysCheat();
        Character coop = new AlwaysCooperate();
        Character alt = new AlternateMove();
        Character cat = new CopyCat();
        Character gru = new Grudger();

        TrustGame game = new TrustGame(gru , coop , 3);
        game.start();
    }
}

