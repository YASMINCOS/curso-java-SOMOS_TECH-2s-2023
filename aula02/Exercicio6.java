package aula02;

import java.util.Scanner;

public class Exercicio6 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um  numero inteiro positivo");
        int numero = sc.nextInt();

        System.out.println("Exemplo while");
        //1 passo inicializao - o valor inicial
        //2 passo condicao de parada
        //3 passo atualizao 
        for(int i = 2; i <=numero ; i+=2){
           System.out.println(i);
         }

       int i = 2;
       while(i <= numero){
          System.out.println(i);
          i += 2;
       }
    }
}
