//Mapeamento da entidade usuario

package com.baltz.minhasfinancas.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table( name= "usuario", schema = "financas")
@Builder
@Data

public class Usuario {

	//Private para ficar encapsulado e ngm ter acesso a nao ser minha propia classe
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) //O banco mesmo se encarrega de gerar o id
	private Long id; // Estou dizendo que esse id e minha chave primaria
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	

}
