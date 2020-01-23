package org.idanielcg.CrudExample.Services;

import org.idanielcg.CrudExample.Entities.Cuenta;
import org.idanielcg.CrudExample.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasService extends JpaRepository<Persona, Long> {
	
	Persona getPersonaByCuenta(Cuenta cuenta);

}
