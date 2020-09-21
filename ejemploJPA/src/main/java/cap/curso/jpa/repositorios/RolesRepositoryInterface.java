package cap.curso.jpa.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Rol;

@Repository
public interface RolesRepositoryInterface extends CrudRepository<Rol, Integer>
{
	// Con el =: le decimos que ponga de valor el parametro que le llega
	
	@Query("from Rol r where r.rol=:rol")
	public Rol getRolByRol(String rol);
}
