package org.idanielcg.CrudExample.Model;



public class Persona {

	private Long id;
	
	private String nombre;
	private String apellido;
	private String puesto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public Persona (Long id, String nombre, String apellido, String puesto) {
				
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setPuesto(puesto);
		
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

}
