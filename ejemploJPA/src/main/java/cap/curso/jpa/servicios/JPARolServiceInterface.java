package cap.curso.jpa.servicios;

import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;

@Service
public interface JPARolServiceInterface
{

	public Rol save(Rol rol);
	
	public Iterable<Rol> findAll();
		
	public Rol getRolByRol(String rol);
}
