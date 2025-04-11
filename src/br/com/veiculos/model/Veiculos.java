package br.com.veiculos.model;

import java.util.Scanner;

public class Veiculos {
    Scanner scanner = new Scanner(System.in);


    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private boolean disponivel;
    private int diasAlugados;



    public boolean isDisponivel(){
       if (this.disponivel){
           System.out.println("O veiculos está disponivel");
           return true;
       }else {
           System.out.println("O veiculo não está disponivel");
           return false;
       }

    }

    public void alugar(){
        this.disponivel = false;
        System.out.println("Quantos dias vão ser alugados?");
        this.diasAlugados = scanner.nextInt();
        System.out.println("O Veiculo foi alugado por "+ diasAlugados + " Dias");
    }

    public void devolver(){
        this.disponivel = true;
        System.out.println("O Veiculo foi devolvido e está disponivel para alugar novamente");
    }
    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Placa: "+this.placa);
        System.out.println("Disponibilidade: "+(this.disponivel ? "Disponivel": "Não disponivel"));
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getDiasAlugados() {
        return diasAlugados;
    }
}
