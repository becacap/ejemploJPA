package cap.curso.jpa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.repositorios.RolesRepositoryInterface;

@Service
public class JPARolesService implements JPARolesServiceInterface {

    @Autowired
    private RolesRepositoryInterface repository;

    public RolesRepositoryInterface getRepository() {
	return repository;
    }

    public void setRepository(RolesRepositoryInterface repository) {
	this.repository = repository;
    }

    public Rol save(Rol rol) {
	return getRepository().save(rol);
    }

    public Iterable<Rol> findAll() {
	return getRepository().findAll();
    }

    public Rol getRolByName(String nombreRol) {
	return getRepository().getRolByName(nombreRol);
    }

}
