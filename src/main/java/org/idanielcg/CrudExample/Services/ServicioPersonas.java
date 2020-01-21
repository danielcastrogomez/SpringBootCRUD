package org.idanielcg.CrudExample.Services;

import java.util.List;

import org.idanielcg.CrudExample.DTO.PersonaCuentaDTO;
import org.idanielcg.CrudExample.Model.Persona;

public interface ServicioPersonas {

	public List<Persona> getPersonas();

	public Persona getPersonaById(Long id);
	
	public void insertPersona();

	public void deletePersona();

	public void updatePersona();
	
	public PersonaCuentaDTO getCuenta(Long id);

}
