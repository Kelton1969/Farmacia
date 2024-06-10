package com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.model.Produto;
import com.farmacia.repository.ProdutoRepository;


@RestController // anotação que diz para spring que essa é uma controladora
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*") // liberar o acesso a outras maquinas
public class ProdutoController {
 
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll());

	}
}
