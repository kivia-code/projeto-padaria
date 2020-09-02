package com.br.bandtec.projetopadaria;

public class TesteComida {

    public static void main(String[] args) {

        Massa pao = new Massa("pao", "Trigo", 100, 3);
        Doce quindim = new Doce ("Quindim", "Pudim", 50,2 );
        Salgado kibe = new Salgado("Kibe", "Carne",200,3);

        CaixaPadaria caixa = new CaixaPadaria();

        caixa.adicionaComida(pao);
        caixa.adicionaComida(quindim);
        caixa.adicionaComida(kibe);

        caixa.exibeComidas();
        System.out.println("");
        System.out.println(caixa.calculaValorTotalComida());


    }

}
