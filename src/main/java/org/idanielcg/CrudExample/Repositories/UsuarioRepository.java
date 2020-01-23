package org.idanielcg.CrudExample.Repositories;

import org.idanielcg.CrudExample.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
