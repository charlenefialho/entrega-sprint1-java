package com.example.leadtech;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leadtech.exception.ResourceNotFoundException;



@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDTO criarProduto(ProdutoDTO produtoDTO) {
        // Mapear o DTO para a entidade Produto
        Produto produto = mapToEntity(produtoDTO);
        // Salvar o produto no banco de dados
        Produto produtoSalvo = produtoRepository.save(produto);
        // Mapear a entidade para DTO e retornar
        return mapToDTO(produtoSalvo);
    }

    public ProdutoDTO obterProdutoPorId(Long id) {
        // Buscar o produto pelo ID no banco de dados
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado com o ID: " + id));
        // Mapear a entidade para DTO e retornar
        return mapToDTO(produto);
    }

    public ProdutoDTO atualizarProduto(Long id, ProdutoDTO produtoDTO) {
        // Verificar se o produto existe
        if (!produtoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Produto não encontrado com o ID: " + id);
        }
        // Mapear o DTO para a entidade Produto
        Produto produto = mapToEntity(produtoDTO);
        produto.setIdProduto(id); // Definir o ID do produto
        // Atualizar o produto no banco de dados
        Produto produtoAtualizado = produtoRepository.save(produto);
        // Mapear a entidade para DTO e retornar
        return mapToDTO(produtoAtualizado);
    }

    public void excluirProduto(Long id) {
        // Verificar se o produto existe
        if (!produtoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Produto não encontrado com o ID: " + id);
        }
        // Excluir o produto do banco de dados
        produtoRepository.deleteById(id);
    }
    
    public List<ProdutoDTO> getProdutosByCategoria(String categoria) {
        List<Produto> produtos = produtoRepository.findByCategoriaProduto(categoria);
        return produtos.stream()
                       .map(this::mapToDTO)
                       .collect(Collectors.toList());
    }

    public List<ProdutoDTO> getProdutosByEstrelas(int estrelas) {
        List<Produto> produtos = produtoRepository.findByEstrelas(estrelas);
        return produtos.stream()
                       .map(this::mapToDTO)
                       .collect(Collectors.toList());
    }
    
    public List<ProdutoDTO> getAllProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream()
                       .map(this::mapToDTO)
                       .collect(Collectors.toList());
    }

    // Métodos auxiliares para mapear entre DTO e entidade
    private Produto mapToEntity(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setNomeProduto(produtoDTO.getNome());
        produto.setCategoriaProduto(produtoDTO.getCategoria());
        produto.setEstrelas(produtoDTO.getEstrelas());
        produto.setQtdEstoque(produtoDTO.getQtdEstoque());
        produto.setDataCompraProduto(produtoDTO.getDataCompra());
        produto.setValorProduto(produtoDTO.getValor());
        return produto;
    }

    private ProdutoDTO mapToDTO(Produto produto) {
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setId(produto.getIdProduto());
        produtoDTO.setNome(produto.getNomeProduto());
        produtoDTO.setCategoria(produto.getCategoriaProduto());
        produtoDTO.setEstrelas(produto.getEstrelas());
        produtoDTO.setQtdEstoque(produto.getQtdEstoque());
        produtoDTO.setDataCompra(produto.getDataCompraProduto());
        produtoDTO.setValor(produto.getValorProduto());
        return produtoDTO;
    }
}

