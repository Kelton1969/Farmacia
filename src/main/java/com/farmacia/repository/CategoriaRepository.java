package com.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmacia.model.Categoria;
import com.farmacia.model.Produto;



public interface CategoriaRepository extends JpaRepository<Categoria, Long>  {

	public List <Categoria> findAllByTituloContainingIgnoreCase(@Param("categoria")String categoria);
	

}

	
