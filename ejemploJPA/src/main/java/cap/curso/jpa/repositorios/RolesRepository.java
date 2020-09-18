package cap.curso.jpa.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Rol;

@Repository
public interface RolesRepository extends CrudRepository<Rol, Integer>
{
	@Query("from Rol r where r.rol=:rol")
	public Rol getRolByRol(@Param("rol") String rol);
	
}
