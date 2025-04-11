import br.com.veiculos.model.Caminhao;
import br.com.veiculos.model.Carro;
import br.com.veiculos.model.Moto;

public class Main {
    public static void main(String[] args) {


        Caminhao caminhao1 = new Caminhao();

        caminhao1.setModelo("Scania 2000");
        caminhao1.setCapacidadeCargaT(10);
        caminhao1.setAno(2022);
        caminhao1.setMarca("Scania");
        caminhao1.setPlaca("AB0564R");


        Carro carro1 = new Carro();

        carro1.setMarca("BYD");
        carro1.setQuantidadePortas(4);
        carro1.setModelo("Novo");
        carro1.setPlaca("SD1457O");
        carro1.setAno(2025);

        Moto moto1 = new Moto();

        moto1.setModelo("Biz");
        moto1.setAno(2023);
        moto1.setCilindradas(125);
        moto1.setMarca("Trial");
        moto1.setPlaca("SD0465O");

        carro1.exibirDetalhes();
        caminhao1.exibirDetalhes();

        moto1.isDisponivel();
        moto1.alugar();
        moto1.exibirDetalhes();

        System.out.println("O custo do alugues é de "+moto1.calcularAluguel(moto1.getDiasAlugados())+" Reais");

    }
}