package aula05.Revisao;

import java.util.ArrayList;

public class Turma {
   
    private ArrayList <Aluno> alunos;


    public Turma (){
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(int indice){
        if (indice >0){
            Aluno alunoRemovido = alunos.remove(indice);
            System.out.println("Aluno removido: " + alunoRemovido);

        }else{
            System.out.println("Indice invalido. Nenhum aluno pode ser removido");
        }
    }

    public void exibirInformacoes(){
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado nessa turma");
        }else{
            System.out.println("-----------Lista Alunos-----------\n");
            for (int i= 0; i<alunos.size() ; i++){
                System.out.println("Indice: " + i);
                alunos.get(i).exibirInformacoes();
                System.out.println("\n");
            }
        }
    }

    public double calcularMediaTurma(){
         if(alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado nessa turma para calcular média");
            return 0;
        }else{
            double somaMediaTurma = 0;
            for (Aluno aluno : alunos) {
                somaMediaTurma += aluno.calcularMedia();
                
            }
            return somaMediaTurma / alunos.size();
        }
    }
}
