package com.br.bandtec.projetopadaria;

public class Doce extends Comida {


    //atributos
    private Integer peso;
    private Integer quantidade;

    //constructor
    public Doce (String nome, String tipo, Integer peso, Integer quantidade) {
        super(nome, tipo);
        this.peso = peso;
        this.quantidade = quantidade;
    }


    //metodos
    @Override
    public Double getValorComida() {
        return (peso / 100 + 5.0 ) * quantidade;

    }

    @Override
    public String toString() {
        return "Doce: {" + super.toString() +
                ", Peso= " + peso +
                ", Quantidade= " + quantidade +
                "} ";
    }


}
