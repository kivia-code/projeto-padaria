package com.br.bandtec.projetopadaria;

import java.util.ArrayList;
import java.util.List;

public class CaixaPadaria {

    //atributos
    List<Comida> compras;


    public List<Comida> getCompras() {
        return compras;
    }

    public CaixaPadaria() {
        this.compras = new ArrayList<>();

    }

    public void adicionaComida(Comida c){
        compras.add(c);
    }

    public void exibeComidas(){
        System.out.println("Listas de Comidas: ");
        for(Padaria p : compras ){
            System.out.println(p);

        }

    }

    public String calculaValorTotalComida(){
        Double valor = 0.0;
    for (Padaria p : compras ){
        valor += p.getValorComida();
    }
     return "Valor total a pagar pela compra: R$" + valor;

    }

    public void removerCompra(Integer id){
        compras.remove(id -1 );

    }

    public void alteraCompra(Integer id , Comida comida){
        compras.set(id -1, comida);

    }

    public void alteraMassa(Integer id , Massa massa ){
        compras.set(id -1, massa);

    }

    public void alteraDoce(Integer id , Doce doce){
        compras.set(id -1, doce);

    }

    public void alteraSalgado(Integer id , Salgado salgado){
        compras.set(id -1, salgado);

    }
}
