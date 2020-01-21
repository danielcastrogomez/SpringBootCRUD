package org.idanielcg.CrudExample.DTO;

import org.idanielcg.CrudExample.Model.Cuenta;
import org.idanielcg.CrudExample.Model.Persona;

public class PersonaCuentaDTO {

	private Persona persona;
	private Cuenta cuenta;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}
