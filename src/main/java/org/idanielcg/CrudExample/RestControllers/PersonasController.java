package org.idanielcg.CrudExample.RestControllers;

import java.util.List;
import java.util.Optional;

import org.idanielcg.CrudExample.Model.Persona;
import org.idanielcg.CrudExample.Services.PersonasService;
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
	
	@Autowired
	PersonasService personasService;
	
	

	@GetMapping("/personas")
	public List<org.idanielcg.CrudExample.Entities.Persona> getPersonas() {
		//return servicioPersonas.getPersonas();
		return personasService.findAll();
	}

	@GetMapping("/personas/{id}")
	public Optional<org.idanielcg.CrudExample.Entities.Persona> getPersona(@PathVariable("id") Long id) {
		//return servicioPersonas.getPersonaById(id);
		return personasService.findById(id);
	}

	
	@PutMapping("/personas/insert")
	public void insertPersona() {
		servicioPersonas.insertPersona();
	}
}
