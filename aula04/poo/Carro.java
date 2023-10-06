package aula04.poo;

public class Carro {

    //atributos-caracteristicas
    private String modelo;
    private String cor;
    private int ano;


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //metodos-acoes
     public void ligar(){
        System.out.println("Carro ligado.");
     }

     public void desligar(){
        System.out.println("Carro desligado.");
     }
    
}
