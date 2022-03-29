package com.nsg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id ;
	@NotBlank(message = "O campo genero deve ser preenchido")
	@Size(min = 3, max = 255, message = "O genero deve ter no minimo 3 e no maximo 255 caracteres ")
	private String genero ;
	@NotBlank(message = "O campo descrição deve ser preenchido")
	@Size(min = 10, max = 500, message = "O descrição deve ter no minimo 10 e no maximo 500 caracteres ")
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
