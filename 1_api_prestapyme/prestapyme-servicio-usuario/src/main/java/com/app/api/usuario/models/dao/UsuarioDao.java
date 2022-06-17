package com.app.api.usuario.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.api.usuario.models.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario,Long>{

}
