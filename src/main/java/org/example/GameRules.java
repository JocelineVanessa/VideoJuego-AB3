package org.example;

//Se crea la clase reglas del juego//

public class GameRules {
    private int minimo;
    private int maximo;
    private int intentosMaximos;

    //Se establecen las reglas del juego//
    public GameRules() {
        this.minimo = 1;
        this.maximo = 50;
        this.intentosMaximos = 5;
    }

    public int getMinimo() {
        return this.minimo;
    }

    public int getMaximo() {
        return this.maximo;
    }

    public int getIntentosMaximos() {
        return this.intentosMaximos;
    }
}