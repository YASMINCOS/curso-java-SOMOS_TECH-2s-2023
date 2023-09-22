package aula02;

import java.util.Scanner;

public class CalculoMediaEstrutura {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota :");
        double nota1 = sc.nextDouble();

        System.out.println("Digite o segundo nota :");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;

        if (media == 7.0){
            System.out.println("Voce foi aprovado no limite" + media);
        }else if (media < 7.0){
            System.out.println("Voce vai para recuperacao " + media);
        } else if ( media == 10){
            System.out.println("Parabens! nota maxima" + media);
        }else{
            System.out.println("Voce foi aprovado" + media);
        }

 
    }
}
