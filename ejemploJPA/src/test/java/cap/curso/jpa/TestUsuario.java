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

	@Autowired
	private JPARolesServiceInterface jpaRolesServiceInterface;

	// @Test
	public void testOrdenados()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAUsuariosServiceInterface().ordenarClave();

		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}

	// @Test
	public void testTodosUsuarios()
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
		List<Rol> roles = (List<Rol>) getJpaRolesServiceInterface().findAll();
		for (Rol rol : roles)
		{
			System.out.println("tamaño:"+rol.getUsuarios().size());
		}
	}
	
	@Test
	public void altaUaurio() {
		Rol rol=getJpaRolesServiceInterface().gerRolByRol("ADMINISTRADOR");
		Usuario usuario= new Usuario();
		usuario.setUsuario("javier");
		usuario.setClave("1234");
		usuario.setEnabled(true);
		usuario.setRol(rol);
		getjPAUsuariosServiceInterface().save(usuario);
		
		
	}

	// @Test
	public void grabar()
	{

		Rol rol = new Rol();
		rol.setRol("USUARIO");
		getJpaRolesServiceInterface().save(rol);
		Rol rol1 = new Rol();
		rol1.setRol("ADMINISTRADOR");
		getJpaRolesServiceInterface().save(rol1);

	}

	public JPAUsuarioServiceInterface getjPAUsuariosServiceInterface()
	{
		return jPAUsuariosServiceInterface;
	}

	public void setjPAUsuariosServiceInterface(JPAUsuarioServiceInterface jPAUsuariosServiceInterface)
	{
		this.jPAUsuariosServiceInterface = jPAUsuariosServiceInterface;
	}

	public JPARolesServiceInterface getJpaRolesServiceInterface()
	{
		return jpaRolesServiceInterface;
	}

	public void setJpaRolesServiceInterface(JPARolesServiceInterface jpaRolesServiceInterface)
	{
		this.jpaRolesServiceInterface = jpaRolesServiceInterface;
	}

}
