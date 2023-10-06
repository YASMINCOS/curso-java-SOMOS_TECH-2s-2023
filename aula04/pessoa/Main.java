package aula04.pessoa;

public class Main {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ana";
        pessoa1.idade = 22;
        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Joao";
        pessoa2.idade = 12;
        pessoa2.apresentar();
        
    }
}
