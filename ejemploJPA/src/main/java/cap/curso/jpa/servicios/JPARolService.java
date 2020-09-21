package cap.curso.jpa.servicios;

import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.repositorios.RolRepositoryInterface;

@Service
public class JPARolService implements JPARolServiceInterface
{

	private RolRepositoryInterface repository;
	
	public Rol save(Rol rol)
	{
		return getRepository().save(rol);
	}

	public Iterable<Rol> findAll()
	{
		return getRepository().findAll();
	}

	public RolRepositoryInterface getRepository()
	{
		return repository;
	}

	public void setRepository(RolRepositoryInterface repository)
	{
		this.repository = repository;
	}

}
