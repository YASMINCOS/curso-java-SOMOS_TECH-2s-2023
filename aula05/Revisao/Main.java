package aula05.Revisao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Turma turma = new Turma();
        Scanner s = new Scanner(System.in);
        int opcao;

        do{

            System.out.println("-------Menu--------");
            System.out.println("1- Adicionar Aluno");
            System.out.println("2- Remover aluno");
            System.out.println("3- Mostrar informações da turma");
            System.out.println("4- Calcular Media da turma");
            System.out.println("0- Finaliazar programa");
            opcao = s.nextInt();

            switch(opcao){
                case 1: 
                   System.out.println("Nome do aluno: \n");
                   String  nome = s.next();
                   System.out.println("Idade do aluno: \n");
                   int idade = s.nextInt();
                   System.out.println("Genero do aluno (M/F): \n");
                   char genero = s.next().charAt(0);
                   Aluno aluno = new Aluno(nome, idade, genero);
                   System.out.println("Deseja adicionar nota para o aluno?");
                   char adicionarNota = s.next().charAt(0);
                   if (adicionarNota == 'S' || adicionarNota =='s' ){
                       System.out.println("Numero de notas: ");
                       int numNotas = s.nextInt();

                       for (int i =0 ; i< numNotas; i++){
                          System.out.println("Nota " + (i+ 1) + ":");
                          double nota = s.nextDouble();
                          aluno.adicionarNota(nota);
                       }
                   }
                   turma.adicionarAluno(aluno);
                   System.out.println("Aluno cadastrado com sucesso!!");
                   break;
               case 2:    
                  System.out.println("Digite o indice do aluno a ser removido: ");
                  int indiceRemocao = s.nextInt();
                  turma.removerAluno(indiceRemocao);
                  break;

               case 3: 
                  turma.exibirInformacoes();
                  break;   
                case 4: 
                 System.out.println("Média turma: " + turma.calcularMediaTurma()); 
                 break;  
               case 0:
                 System.out.println("Saindo programa. Ate!");
                 break;
               default:
                 System.out.println("Opção invalida");    
                 break;

            }

        }while(opcao != 0);
        s.close();
        
    }
    
}
