package cap.curso.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.repositorios.RolesRepository;

@Service
public class JPARolesService implements JPARolesServiceInterface
{

	@Autowired
	private RolesRepository repository;
	
	public Rol save(Rol usuario)
	{
		return getRepository().save(usuario);
	}

	public Iterable<Rol> findAll()
	{
		return getRepository().findAll();
	}


	public RolesRepository getRepository()
	{
		return repository;
	}

	public void setRepository(RolesRepository repository)
	{
		this.repository = repository;
	}

	public Rol getRolbyRol(String rol)
	{
		return getRepository().getRolByRol(rol);
	}

}
