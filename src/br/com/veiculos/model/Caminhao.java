package br.com.veiculos.model;

public class Caminhao extends Veiculos implements CustoAluguel {
    private int capacidadeCargaT;

    @Override
    public double calcularAluguel(int dias) {
        return (150 * dias) + (this.capacidadeCargaT + 10);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: "+this.capacidadeCargaT + " Toneladas");
    }



    public void setCapacidadeCargaT(int capacidadeCargaT) {
        this.capacidadeCargaT = capacidadeCargaT;
    }
}
