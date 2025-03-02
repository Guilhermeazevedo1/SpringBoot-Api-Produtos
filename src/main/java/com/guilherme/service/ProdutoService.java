package com.guilherme.service;

import com.guilherme.model.Produto;
import com.guilherme.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    ProdutoRepository repository;

    ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public Produto findById(Long id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("O Id informado não existe" + id));
    }

    public List<Produto> findByAll(){
        return repository.findAll();
    }

    public void deletar(Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }else{
            throw new RuntimeException("O Id informado não existe " + id);
        }
    }

    public Produto atualizar(Long id, Produto produtoAtualizado){
        Produto produtoExistente = repository.findById(id)
                .orElseThrow(()-> new  RuntimeException("Produto não encontrado id " + id));

        produtoExistente.setNome(produtoAtualizado.getNome());
        produtoExistente.setPreco(produtoAtualizado.getPreco());
        produtoExistente.setDataValidade(produtoAtualizado.getDataValidade());

        return repository.save(produtoExistente);
    }
}
