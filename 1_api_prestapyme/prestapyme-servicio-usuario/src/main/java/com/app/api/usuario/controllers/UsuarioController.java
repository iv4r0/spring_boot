package com.app.api.usuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.usuario.models.entity.Usuario;
import com.app.api.usuario.models.service.IUsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/listar")
	public List<Usuario> listar(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Usuario detalle(@PathVariable Long id){
		return usuarioService.findById(id);
	}
	
	@PostMapping("/guardar")
	public Usuario guardar(@RequestBody Usuario entity){
		return usuarioService.save(entity);
	}
}
