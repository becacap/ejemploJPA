package cap.curso.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.entidades.Usuario;
import cap.curso.jpa.repositorios.RolesRepositoryInterface;
import cap.curso.jpa.repositorios.UsuarioRepositoryInterface;

@Service
public class JPARolService implements JPARolServiceInterface
{

	@Autowired
	private RolesRepositoryInterface rolesRepository;
	
	

	public RolesRepositoryInterface getRolesRepository()
	{
		return rolesRepository;
	}

	public void setRolesRepository(RolesRepositoryInterface rolesRepository)
	{
		this.rolesRepository = rolesRepository;
	}

	public Rol save(Rol rol)
	{
		// TODO Auto-generated method stub
		return getRolesRepository().save(rol);
	}

	public Iterable<Rol> findAll()
	{
		// TODO Auto-generated method stub
		return getRolesRepository().findAll();
	}

	public Iterable<Rol> ordenarClave()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Rol getRolByRol(String Rol)
	{
		// TODO Auto-generated method stub
		return getRolesRepository().getRolByRol(Rol);
	}
	
	
}
