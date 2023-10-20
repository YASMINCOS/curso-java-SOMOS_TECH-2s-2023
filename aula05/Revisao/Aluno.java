package aula05.Revisao;

import java.util.ArrayList;

public class Aluno{
      private String nome;
      private int idade;
      private char genero;
      private ArrayList <Double> notas;

      public Aluno(String nome, int idade, char genero){
             setNome(nome);
             setIdade(idade);
             setGenero(genero);
            this.notas = new ArrayList<>();
      }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public ArrayList<Double> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: \n" + nome);
        System.out.println("Idade: \n" + idade);
        System.out.println("Genero: \n" + genero);

        if(!notas.isEmpty()){
            System.out.println("Notas: ");
            //tipo //elementox //colecao
            for (double nota : notas) {
                System.out.println(nota + "");
                
            }
            System.out.println();
        }else{
            System.out.println("Nenhuma nota foi registrada.");
        }
    }

    public void adicionarNota(double nota){
       notas.add(nota);
    }

     double calcularMedia(){
         if(notas.isEmpty()){
            return 0;
         }

         double soma = 0;

         for (double calculoNota : notas) {
            soma += calculoNota;
         }

         return soma / notas.size();
    }
}