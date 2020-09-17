package cap.curso.jpa.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Usuario;

@Repository//La añadimos esto para que se inyecte
public interface UsuarioRepositoryInterface extends CrudRepository<Usuario, Integer> //Hereda de CrudRepository y los va a lanzar contra Usuario
{ 
	
	@Query("from Usuario as u order by u.clave")
	public Iterable<Usuario> ordenarClave();

}
