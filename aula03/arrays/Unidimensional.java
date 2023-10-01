package aula03.arrays;

public class Unidimensional {
  
    public static void main(String[] args) {
        
        int [] numerosInteiros = new int[5];

        numerosInteiros[0] = 12;
        numerosInteiros[1] = 13;
        numerosInteiros[2]= 14;
        numerosInteiros[3]= 15;
        numerosInteiros[4]= 16;

        for(int i =0; i< 5; i++){
            System.out.println("Elemento " + numerosInteiros[i]);
        }

    }
}
