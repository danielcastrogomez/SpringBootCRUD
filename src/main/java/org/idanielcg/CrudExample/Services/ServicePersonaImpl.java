package org.idanielcg.CrudExample.Services;

import java.util.ArrayList;
import java.util.List;

import org.idanielcg.CrudExample.DTO.PersonaCuentaDTO;
import org.idanielcg.CrudExample.Model.Persona;
import org.springframework.stereotype.Component;


@Component
public class ServicePersonaImpl implements ServicioPersonas {

	List<Persona> listaPersonas = new ArrayList<Persona>();

	@Override
	public List<Persona> getPersonas() {
		return crearPersonas();
	}

	@Override
	public Persona getPersonaById(Long id) {
		return searchPersona(id);
	}

	@Override
	public void insertPersona() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersona() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersona() {
		// TODO Auto-generated method stub

	}

	private List<Persona> crearPersonas() {

		Persona persona1 = new Persona(1L, "Daniel", "Castro", "Developer");
		Persona persona2 = new Persona(2L, "Mauricio", "Luna", "Developer");

		listaPersonas.add(persona1);
		listaPersonas.add(persona2);

		return listaPersonas;

	}
	
	private Persona searchPersona(Long id) {
		Persona persona = null;
		for(Persona person : listaPersonas) {
			if(person.getId() == id) {
				persona = new Persona(person.getId(), person.getNombre(), person.getApellido(), person.getPuesto());	
			}
		}
		return persona;
		
	}

	@Override
	public PersonaCuentaDTO getCuenta(Long id) {
		// TODO Auto-generated method stub
		//SELECT *
		//FROM PERSONA a
		//LEFT JOIN CUENTA b
			//on a.id = b.id
		//PersonaCuentaDTO(persona, cuenta);
		
		return null;
	}
	
	

}
