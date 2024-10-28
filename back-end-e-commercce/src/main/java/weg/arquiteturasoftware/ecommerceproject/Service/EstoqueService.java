package weg.arquiteturasoftware.ecommerceproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weg.arquiteturasoftware.ecommerceproject.Entity.Estoque;
import weg.arquiteturasoftware.ecommerceproject.Entity.Produto;
import weg.arquiteturasoftware.ecommerceproject.Repository.EstoqueRepository;

import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    EstoqueRepository estoqueRepository;
    @Autowired
    ProdutoService produtoService;

    public Estoque criarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public Estoque buscarEstoque(Integer id) {
        return estoqueRepository.findById(id).orElse(null);
    }

    public List<Estoque> buscarTodosEstoques() {
        return estoqueRepository.findAll();
    }

}