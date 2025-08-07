package com.itb.inf2cm.pizzariac.controller;

import com.itb.inf2cm.pizzariac.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")

public class CategoriaController {

    List<Categoria> categorias = new ArrayList<Categoria>();

    @GetMapping
    public List<Categoria> findAll() {

        Categoria p1 = new Categoria();
        p1.setId(1L);
        p1.setNome("Pizza Salgada");
        p1.setDescricao("Pizza do Tipo Salgada");
        p1.setCodStatus(true);

        Categoria p2 = new Categoria();
        p2.setId(2L);
        p2.setNome("Pizza Doce");
        p2.setDescricao("Pizza Recheada Doce");
        p2.setCodStatus(true);

        categorias.add(p1);
        categorias.add(p2);
        return categorias;

    }

}
