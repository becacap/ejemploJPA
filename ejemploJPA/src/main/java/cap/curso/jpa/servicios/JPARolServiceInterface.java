package cap.curso.jpa.servicios;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.entidades.Usuario;

public interface JPARolServiceInterface
{
public Rol save(Rol rol);
	
	public Iterable<Rol>findAll();
	
	public Iterable<Rol>ordenarClave();
	
	public Rol getRolByRol(String Rol);
}
