package cap.curso.jpa.repositorios;

import org.springframework.data.repository.CrudRepository;

import cap.curso.jpa.entidades.Rol;

public interface RolesRepositoryInterface extends CrudRepository<Rol, Integer> {

}
