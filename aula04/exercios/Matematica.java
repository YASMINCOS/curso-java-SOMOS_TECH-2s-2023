package aula04.exercios;

import java.util.Random;

public class Matematica {
    
    public static int gerarNumeroAleatorio(){

        Random random = new Random();

        return random.nextInt(100);
    }

    public static void main(String[] args) {
        int numero01 = gerarNumeroAleatorio();
        int numero02 = gerarNumeroAleatorio();
        int numero03 = gerarNumeroAleatorio();

        System.out.println("Números gerados");
        System.out.println("\n Numero 01 : " + numero01);
        System.out.println("\n Numero 02 : " + numero02);
        System.out.println("\n Numero 03 : " + numero03);
        
    }
}
