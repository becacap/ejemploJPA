package cap.curso.jpa.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Rol;

@Repository
public interface RolRepositoryInterface extends CrudRepository<Rol, Integer>
{
	
}
