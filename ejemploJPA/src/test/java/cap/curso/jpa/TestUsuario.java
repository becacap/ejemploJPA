package cap.curso.jpa;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.jpa.configuracion.Configuracion;
import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.entidades.Usuario;
import cap.curso.jpa.servicios.JPARolesServiceInterface;
import cap.curso.jpa.servicios.JPAUsuarioServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TestUsuario
{
	@Autowired
	private JPAUsuarioServiceInterface jPAUsuariosServiceInterface;
	
	private JPARolesServiceInterface jPARolesServiceInterface;

	//@Test
	public void testOrdenados() {
		List<Usuario> usuarios = (List<Usuario>) getjPAUsuariosServiceInterface().ordenarClave();
		
		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}
	
	//@Test
	public void testTodosUsuario()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAUsuariosServiceInterface().findAll();
		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}
 
	//@Test
	public void testTodosRoles()
	{
		List<Rol> roles = (List<Rol>) getjPARolesServiceInterface().findAll();
		for (Rol rol : roles)
		{
			System.out.println(rol.getRol());
		}
	}
	
	@Test
	public void altaUsuario() {
		Rol rol = getjPARolesServiceInterface().getRolbyRol("ADMINISTRADOR");
		Usuario usuario = new Usuario();
		usuario.setUsuario("Javier");
		usuario.setClave("1234");
		usuario.setEnable(true);
		usuario.setRol(rol);
	}

	//@Test
	// @Transactional
	public void grabar()
	{

		Rol rol = new Rol();
		rol.setRol("USUARIO");
		getjPARolesServiceInterface().save(rol);
		Rol rol1 = new Rol();
		rol1.setRol("ADMINISTRADOR");
		getjPARolesServiceInterface().save(rol1);

	}

	public JPAUsuarioServiceInterface getjPAUsuariosServiceInterface()
	{
		return jPAUsuariosServiceInterface;
	}

	public void setjPAUsuariosServiceInterface(JPAUsuarioServiceInterface jPAUsuarioServiceInterface)
	{
		this.jPAUsuariosServiceInterface = jPAUsuarioServiceInterface;
	}

	public JPARolesServiceInterface getjPARolesServiceInterface()
	{
		return jPARolesServiceInterface;
	}

	public void setjPARolesServiceInterface(JPARolesServiceInterface jPARolesServiceInterface)
	{
		this.jPARolesServiceInterface = jPARolesServiceInterface;
	}

		
	
	
}
