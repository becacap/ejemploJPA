package cap.curso.jpa.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Usuario;

@Repository
public interface UsuarioRepositoryInterface extends CrudRepository<Usuario, Long>
{
	@Query("from usuario u order by u.clave")
	public Iterable<Usuario> ordenarClave();
}
