package com.itb.inf2cm.pizzariac.model.services;

import com.itb.inf2cm.pizzariac.model.entity.Produto;
import com.itb.inf2cm.pizzariac.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired //@Autowired: Injeção de Dependência
    private ProdutoRepository produtoRepository;

    // Listar todos os produtos

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    // Salvar Produto

    public Produto save(Produto produto) {
        produto.setCodStatus(true);
        return produtoRepository.save(produto);
    }

    // Listar produto Por ID

    public Produto findById(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto no encontrado como id "+id));
    }

    // Atualizar Produto

    public Produto update(Long id, Produto produto) {
        Produto produtoExistente = findById(id);
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setDescricao(produto.getDescricao());
        produto.setTipo(produto.getTipo());
        produtoExistente.setQuantidadeEstoque(produto.getQuantidadeEstoque());
        produtoExistente.setValorCompra(produto.getValorCompra());
        produtoExistente.setValorVenda(produto.getValorVenda());
        produtoExistente.setCodStatus(produto.isCodStatus());
        return produtoRepository.save(produtoExistente);
    }

    // Excluir Produto ( Exclusão Física )

    public void delete(Long id) {
        Produto produtoExistente = findById(id);
        produtoRepository.delete(produtoExistente);
    }

}
