package aula04.contaBancaria;

public class Main {
    
    public static void main(String[] args) {
        
        //ContaBancaria minhaConta = new ContaBancaria();
        //minhaConta.nome = " Yasmin";
       // minhaConta.saldo = 2.50;
       // minhaConta.apresentarInformacoes();
       // minhaConta.mostrarSaldo();

        //minhaConta.depositar(30);
       // minhaConta.mostrarSaldo();
        //minhaConta.sacar(200);

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.nome = "Silvio Santos";
        contaBancaria.saldo = 360;
        contaBancaria.apresentarInformacoes();

        contaBancaria.depositar(800);
        contaBancaria.mostrarSaldo();
        contaBancaria.sacar(780);
        contaBancaria.mostrarSaldo();


    }
}
