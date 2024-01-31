package org.example;

import java.util.Random;
import java.util.Scanner;

//Se crea la clase controladora del juego//
public class GameController {
    private Scanner scanner;
    private Random random;
    private GameRules rules;

    public GameController(Scanner scanner, Random random, GameRules rules) {
        this.scanner = scanner;
        this.random = random;
        this.rules = rules;
    }

    public String play() {
        int randomNumeroOculto = this.random.nextInt(this.rules.getMaximo() - this.rules.getMinimo() + 1) + this.rules.getMinimo();
        int intentos = 0;

        boolean won = false;

        //Pantalla con los mensajes de bienvenida y reglas del juego//

        System.out.println("Bienvenido a Adivina el Numero Oculto");
        System.out.println("Reglas: Tienes 5 intentos para adivinar el numero oculto");
        System.out.println("Solo puedes introducir numeros que esten entre el 1 y el 50");

        //Se comprueba que el numero introducido por el jugador cumpla con las reglas establecidas//

        while (!won && intentos < this.rules.getIntentosMaximos()) {
            System.out.println("Introduce un numero entre 1 y 50");
            int jugador = this.scanner.nextInt();
            if (jugador < this.rules.getMinimo() || jugador > this.rules.getMaximo()) {
                System.out.println("El numero debe estar entre 1 y 50");
                continue;
            }

            //Se establece que el jugador siga intentando hasta que adivine o agote el numero de intentos//

            intentos++;
            if (jugador == randomNumeroOculto) {
                won = true;
            } else {
                System.out.println("Intenta nuevamente");
            }
        }

        //Si el jugador gana//
        if (won) {
            System.out.println("Felicidades, has ganado");
        //Si el jugador pierde
        } else {
            System.out.println("Has perdido. El numero oculto era:" + randomNumeroOculto);
        }
        return null;
    }
//Informacion necesaria para el test//
    public Object getRandom() {
    return random;
    }
}
