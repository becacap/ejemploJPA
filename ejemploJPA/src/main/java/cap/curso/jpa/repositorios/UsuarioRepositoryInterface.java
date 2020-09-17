package cap.curso.jpa.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Usuario;

@Repository
public interface UsuarioRepositoryInterface extends CrudRepository<Usuario, Integer>
{ 
	
	@Query("from Usuario as u order by u.clave")
	public Iterable<Usuario> ordenarClave();

}
