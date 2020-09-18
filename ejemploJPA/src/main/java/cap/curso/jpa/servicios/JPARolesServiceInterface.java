package cap.curso.jpa.servicios;

import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.entidades.Usuario;

public interface JPARolesServiceInterface
{

	public Rol save(Rol usuario);

	public Iterable<Rol> findAll();

	public Rol gerRolByRol(String rol);

}
