package com.app.api.usuario.models.service;

import java.util.List;

import com.app.api.usuario.models.entity.Usuario;

public interface IUsuarioService {
	public List<Usuario> findAll();
	public Usuario findById(Long id);
	public Usuario save(Usuario entity);
}
