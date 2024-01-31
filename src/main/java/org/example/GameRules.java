package org.example;

public class GameRules {
    private int minimo;
    private int maximo;
    private int intentosMaximos;

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