package cap.curso.jpa.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Usuario;

@Repository
public interface UsuarioRepositoryInterface extends CrudRepository<Usuario, Integer>
{

}
