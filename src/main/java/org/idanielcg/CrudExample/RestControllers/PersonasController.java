package org.idanielcg.CrudExample.RestControllers;

import java.util.List;

import org.idanielcg.CrudExample.Model.Persona;
import org.idanielcg.CrudExample.Services.ServicioPersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PersonasController {

	@Autowired
	ServicioPersonas servicioPersonas;

	@GetMapping("/personas")
	public List<Persona> getPersonas() {
		return servicioPersonas.getPersonas();
	}

	@GetMapping("/personas/{id}")
	public Persona getPersona(@PathVariable("id") Long id) {
		return servicioPersonas.getPersonaById(id);
	}

	
	@PutMapping("/personas/insert")
	public void insertPersona() {
		servicioPersonas.insertPersona();
	}
}
