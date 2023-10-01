package aula03.arrays;

//Crie um array de inteiros com 5 elementos e preencha-o com valores de sua escolha. Em seguida, calcule a soma de todos os elementos do array e exiba o resultado.
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int [] numerosSoma = {6,7,8,8,9};
        int soma = 0;

        for(int i = 0; i<numerosSoma.length; i++){
            soma += numerosSoma[i]; 
        }
        System.out.println("a soma e " + soma);

    }
}
