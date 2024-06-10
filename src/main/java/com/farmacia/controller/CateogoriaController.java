package com.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.farmacia.model.Categoria;
import com.farmacia.model.Produto;
import com.farmacia.repository.CategoriaRepository;
import com.farmacia.repository.ProdutoRepository;

public class CateogoriaController {
	@Autowired
   private CategoriaRepository categoriaRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());

	}
}
