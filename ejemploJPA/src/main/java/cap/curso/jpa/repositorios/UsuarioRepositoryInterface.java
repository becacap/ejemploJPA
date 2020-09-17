package cap.curso.jpa.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cap.curso.jpa.entidades.Usuario;

@Repository
public interface UsuarioRepositoryInterface extends CrudRepository<Usuario, Integer> {

    @Query("from Usuario u order by u.clave") // las consultas tienen que estar en JQL
    public Iterable<Usuario> ordernarClave();

}
