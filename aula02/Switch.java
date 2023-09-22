package aula02;

import java.util.Scanner;

public class Switch {
     
    public static void main(String[] args) {

       Scanner input = new Scanner (System.in);

       System.out.println("Digite um valor de 1 a 3");
       int diaSemana = input.nextInt();
       String nomeDia;

        switch(diaSemana){
            case 1:
              nomeDia = "Domingo";
              break;
            case 2:
              nomeDia = "Segunda-feira";
              break;  
            case 3:
              nomeDia = "Terça-feira";
              break;  
            default: 
              nomeDia = "Invalido";  
        }

        System.out.println(nomeDia);
    }
}
