package aula04.contaBancaria;

public class ContaBancaria {
    
    String nome;
    double saldo;

    public void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    public void sacar(double sacarValor){
        if (sacarValor <= saldo){
            saldo -= sacarValor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void apresentarInformacoes(){
        System.out.println("Essa conta pertence a: \n nome " + nome + " \nSaldo da conta " + saldo);
    }

    public void mostrarSaldo(){
        System.out.println("Saldo atual " + saldo);
    }
}
