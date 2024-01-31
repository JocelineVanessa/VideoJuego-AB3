package org.example;

import java.util.Random;
import java.util.Scanner;
// Se importan las clases necesarias para el videojuego//
public class Game {
    private Scanner scanner;
    private Random random;
    private GameRules rules;
    private GameController controller;
    private boolean jugardenuevo;

    //Se crea la clase juego//
    public Game() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.rules = new GameRules();
        this.controller = new GameController(this.scanner, this.random, this.rules);
    }
    public boolean getJugardenuevo() {
        return this.jugardenuevo;
    }

    public void setJugardenuevo(boolean jugardenuevo) {
        this.jugardenuevo = jugardenuevo;
    }

    //Se crea un bucle que permita jugar de nuevo si asi lo decide el jugador//
    public void start() {
        boolean jugardenuevo = true;
        while (jugardenuevo) {
            this.controller.play();
            jugardenuevo = this.askToPlayAgain();
        }
        this.scanner.close();
    }

    //Se le pregunta al jugador si quiere jugar de nuevo//
    private boolean askToPlayAgain() {
        System.out.println("¿Quieres jugar de nuevo? (s/n)");
        String response = this.scanner.next();
        return response.equalsIgnoreCase("s");
    }
}
