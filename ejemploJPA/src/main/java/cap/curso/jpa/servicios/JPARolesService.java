package cap.curso.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.repositorios.RolesRepositoryInterface;

@Service
public class JPARolesService implements JPARolesServiceInterface {

    @Autowired
    private RolesRepositoryInterface repository;

    public Rol save(Rol rol) {
	return getRepository().save(rol);
    }

    public RolesRepositoryInterface getRepository() {
	return repository;
    }

    public void setRepository(RolesRepositoryInterface repository) {
	this.repository = repository;
    }

}
