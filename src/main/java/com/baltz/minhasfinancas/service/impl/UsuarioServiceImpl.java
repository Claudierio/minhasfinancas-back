package com.baltz.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baltz.minhasfinancas.exceptions.RegraNegocioException;
import com.baltz.minhasfinancas.model.entity.Usuario;
import com.baltz.minhasfinancas.model.repository.UsuarioRepository;
import com.baltz.minhasfinancas.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.exitsByEmail(email);
		if(existe) {
			//throw new RegraNegocioException("Já existe um usuário cadastrado com este email");
		}
	}

}
