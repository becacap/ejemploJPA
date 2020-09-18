package cap.curso.jpa.servicios;

import cap.curso.jpa.entidades.Rol;

public interface JPARolesServiceInterface
{
	public Rol save(Rol usuario);
	
	public Iterable<Rol> findAll();
	
	public Rol getRolbyRol(String rol);
	
}
