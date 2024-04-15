package com.example.leadtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
@Validated
public class ProdutoRest {

	private final ProdutoService produtoService;

	@Autowired
	public ProdutoRest(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@PostMapping
	public ResponseEntity<ProdutoDTO> criarProduto(@Valid @RequestBody ProdutoDTO produtoDTO) {
		ProdutoDTO novoProduto = produtoService.criarProduto(produtoDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> obterProdutoPorId(@PathVariable Long id) {
		ProdutoDTO produtoDTO = produtoService.obterProdutoPorId(id);
		return ResponseEntity.ok(produtoDTO);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProdutoDTO> atualizarProduto(@PathVariable Long id,
			@Valid @RequestBody ProdutoDTO produtoDTO) {
		ProdutoDTO produtoAtualizado = produtoService.atualizarProduto(id, produtoDTO);
		return ResponseEntity.ok(produtoAtualizado);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirProduto(@PathVariable Long id) {
		produtoService.excluirProduto(id);
		return ResponseEntity.noContent().build();
	}
}
