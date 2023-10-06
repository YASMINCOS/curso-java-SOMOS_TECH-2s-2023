package aula04.poo;


public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setCor("Vermelho");
        carro.setAno(2012);
        carro.setModelo("Sedan");


        System.out.println("Informações do carro: \n" + "modelo " + carro.getModelo() + "\n ano:" + carro.getAno());

        carro.ligar();
        carro.desligar();

    }
}
