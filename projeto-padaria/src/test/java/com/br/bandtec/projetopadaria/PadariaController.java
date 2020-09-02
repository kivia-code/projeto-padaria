package com.br.bandtec.projetopadaria;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinho")

public class PadariaController {

    CaixaPadaria carrinho = new CaixaPadaria();

    @PostMapping("/adicionar/massa")
    public void adicionaMassa(@RequestBody Massa massa ){
        carrinho.adicionaComida(massa);
    }

    @PostMapping("/adicionar/doce")
    public void adicionaDoce(@RequestBody Doce doce ){
        carrinho.adicionaComida(doce);
    }

    @PostMapping("/adicionar/salgado")
    public void adicionaSalgado(@RequestBody Salgado salgado ){
        carrinho.adicionaComida(salgado);
    }

    @GetMapping
    public List<Comida> mostrarCarrinho(){
        return carrinho.getCompras();

    }

    @DeleteMapping("/remover/{id}")
    public void removerCompra(@PathVariable Integer id){
        carrinho.removerCompra(id);


    }


    @PutMapping("/alterar/massa/{id}")
    public void alteraMassa(@PathVariable Integer id, @RequestBody  Massa massa){
        carrinho.alteraMassa(id ,massa);

    }


    @PutMapping("/alterar/doce/{id}")
    public void alteraDoce(@PathVariable Integer id, @RequestBody  Doce doce){
        carrinho.alteraDoce(id ,doce);

    }


    @PutMapping("/alterar/salgado/{id}")
    public void alteraSalgado(@PathVariable Integer id, @RequestBody  Salgado salgado){
        carrinho.alteraSalgado(id ,salgado);

    }
}
