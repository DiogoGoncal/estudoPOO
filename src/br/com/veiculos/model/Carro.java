package br.com.veiculos.model;

public class Carro extends Veiculos implements CustoAluguel{

    private int quantidadePortas;

    @Override
    public double calcularAluguel(int dias) {
        return dias * 100;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Portas: "+this.quantidadePortas);
    }


    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
