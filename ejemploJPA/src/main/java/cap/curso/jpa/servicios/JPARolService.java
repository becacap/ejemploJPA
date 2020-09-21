package cap.curso.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.repositorios.RolesRepositoryInterface;

@Service
public class JPARolService
{
	
	@Autowired
	private RolesRepositoryInterface rolRepository;

	public Rol save(Rol rol)
	{
		return getRolRepository().save(rol);
	}

	public Iterable<Rol> findAll()
	{
		return getRolRepository().findAll();
	}
	
	public Rol getRolByRol(String rol) {
		return getRolRepository().getRolByRol(rol);
	}
	
	public RolesRepositoryInterface getRolRepository()
	{
		return rolRepository;
	}

	public void setRolRepository(RolesRepositoryInterface rolRepository)
	{
		this.rolRepository = rolRepository;
	}
	
}
