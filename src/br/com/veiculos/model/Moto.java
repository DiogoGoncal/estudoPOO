package br.com.veiculos.model;

public class Moto extends Veiculos implements CustoAluguel {


    private int cilindradas;


    @Override
    public double calcularAluguel(int dias) {
        return dias * 50;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: "+this.cilindradas);
    }


    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
