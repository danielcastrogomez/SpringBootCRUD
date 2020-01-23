package org.idanielcg.CrudExample.Services;

import java.util.List;

import org.idanielcg.CrudExample.Entities.Usuario;
import org.idanielcg.CrudExample.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository UsuarioRepository;
	
	
	public List<Usuario> getUsuarios(){
		return UsuarioRepository.findAll();
	}

}
