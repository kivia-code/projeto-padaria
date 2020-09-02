package com.br.bandtec.projetopadaria;

public abstract class Comida implements Padaria {

    //atributos
    private String nome;
    private String tipo;


    //constructor
    public Comida(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;

    }



    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "Comida: {" +
                "Nome= '" + nome +
                ", Tipo= '" + tipo +
                '}';
    }



}
