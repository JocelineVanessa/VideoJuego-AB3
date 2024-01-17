package org.example;
//Se importan las clases necesarias para el videojuego//
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //instancias para obtener el numero introducido por el jugador y para generar un numero oculto aleatorio//
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();

        //Rango de numeros en el que se puede adivinar//
        int minimo= 1;
        int maximo= 50;

        //Generar numero oculto aleatorio//
        int randomNumeroOculto= random.nextInt(maximo - minimo +1);

        //numero de intentos por partida//
        int intentosMaximos= 5;
        int intentos= 0;
        boolean won= false;

        //Pantalla de bienvenida al juego//
        System.out.println("Bievenido a Adivina el Numero Oculto");

        //bucle hasta que se le acaben los intentos al jugador o adivine el numero oculto//
        while(!won && intentos< intentosMaximos){

            //Pedir que el jugador introduzca un numero//
            System.out.println("Introduce un numero entre 1 y 50: ");
            int jugador= scanner.nextInt();

            intentos++;

            //verificar si el numero introducido por el jugador es el numero oculto//
            if(jugador== randomNumeroOculto){
                won = true;
            }
            else {
                System.out.println("Intenta nuevamente");
            }
        }
        //Pantalla con mensaje de victoria o derrota//
        if (won){
            System.out.println("Felicidades, has ganado");
        } else {
            System.out.println("Has perdido. El numero oculto era:" +randomNumeroOculto);
        }

    }

}