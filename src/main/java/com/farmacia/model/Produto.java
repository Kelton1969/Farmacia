package com.farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1, max = 30, message = "O campo produto deve ter no minimo 1 e no maximo 30 caracteres")
	@NotBlank(message = "O campo produto nao pode estar vazio")
	private String produto;
	
	@Positive
	private BigDecimal preco;

	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
}
