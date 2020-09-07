package com.br.bandtec.projetopadaria;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinhos")

public class PadariaController {

    CaixaPadaria carrinho = new CaixaPadaria();

    @PostMapping("/massas")
    public void adicionaMassa(@RequestBody Massa massa ){
        carrinho.adicionaComida(massa);
    }

    @PostMapping("/doces")
    public void adicionaDoce(@RequestBody Doce doce ){
        carrinho.adicionaComida(doce);
    }

    @PostMapping("/salgados")
    public void adicionaSalgado(@RequestBody Salgado salgado ){
        carrinho.adicionaComida(salgado);
    }

    @GetMapping
    public List<Comida> mostrarCarrinho(){
        return carrinho.getCompras();

    }

    @GetMapping("/{id}")
    public List<Comida> mostrarCarrinhoId(){
        return carrinho.getCompras();

    }

    @DeleteMapping("/{id}")
    public void removerCompra(@PathVariable Integer id){
        carrinho.removerCompra(id);


    }


    @PutMapping("/massas/{id}")
    public void alteraMassa(@PathVariable Integer id, @RequestBody  Massa massa){
        carrinho.alteraMassa(id ,massa);

    }


    @PutMapping("/doces/{id}")
    public void alteraDoce(@PathVariable Integer id, @RequestBody  Doce doce){
        carrinho.alteraDoce(id ,doce);

    }


    @PutMapping("/salgados/{id}")
    public void alteraSalgado(@PathVariable Integer id, @RequestBody  Salgado salgado){
        carrinho.alteraSalgado(id ,salgado);

    }
}
