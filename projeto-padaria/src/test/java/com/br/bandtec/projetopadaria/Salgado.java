package com.br.bandtec.projetopadaria;

public class Salgado extends Comida {
    //atributos
    private Integer peso;
    private Integer quantidade;

    //constructor
    public Salgado (String nome, String tipo, Integer peso, Integer quantidade) {
        super(nome, tipo);
        this.peso = peso;
        this.quantidade = quantidade;
    }


    //metodos
    @Override
    public Double getValorComida() {
        return (peso / 50) * ( 5.0 * quantidade);

    }

    @Override
    public String toString() {
        return "Salgado: {" + super.toString() +
                ", Peso= " + peso +
                ", Quantidade= " + quantidade +
                "} ";
    }




}
