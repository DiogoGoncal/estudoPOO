# Estudo de Programação Orientada a Objetos em Java

Este projeto foi desenvolvido como parte dos estudos de Programação Orientada a Objetos (POO) com Java. Ele simula um sistema básico de locadora de veículos, aplicando conceitos fundamentais como:

- **Herança**
- **Polimorfismo**
- **Abstração**
- **Encapsulamento**
- **Interfaces**

## Estrutura do Projeto

As principais classes estão localizadas em `src/br/com/veiculos/model`:

- `Veiculo` (classe abstrata base)
- `Carro`, `Moto`, `Caminhao` (classes que herdam de `Veiculo`)
- `CustoAluguel` (interface que define o cálculo do valor de aluguel)

## Funcionalidades

Cada tipo de veículo possui suas próprias regras de cálculo de aluguel, demonstrando uso de interfaces e polimorfismo. É possível:

- Criar diferentes tipos de veículos
- Calcular o custo do aluguel com base no número de dias
- Exibir os detalhes de cada veículo
