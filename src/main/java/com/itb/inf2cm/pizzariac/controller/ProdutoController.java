package com.itb.inf2cm.pizzariac.controller;

import com.itb.inf2cm.pizzariac.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setId(1L);
        p1.setNome("Pizza de Calabreza");
        p1.setDescricao("Pizza de Calabreza com bastante cebola");
        p1.setValorVenda(100.99);
        p1.setQuantidadeEstoque(50);
        p1.setCodStatus(true);

        Produto p2 = new Produto();
        p2.setId(2L);
        p2.setNome("Pizza de Queijo");
        p2.setDescricao("Pizza de Queijo Mussarela bem recheada");
        p2.setValorVenda(115.99);
        p1.setQuantidadeEstoque(50);
        p2.setCodStatus(true);

        produtos.add(p1);
        produtos.add(p2);
        return produtos;
    }



}

