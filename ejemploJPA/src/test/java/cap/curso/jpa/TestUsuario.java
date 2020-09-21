package cap.curso.jpa;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

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
	private JPAUsuarioServiceInterface jPAServiceInterface;

	@Autowired
	private JPARolesServiceInterface jpaRolesInterface;
	
	 public JPARolesServiceInterface getJpaRolesInterface()
	{
		return jpaRolesInterface;
	}

	public void setJpaRolesInterface(JPARolesServiceInterface jpaRolesInterface)
	{
		this.jpaRolesInterface = jpaRolesInterface;
	}

	//@Test
	public void testTodos()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().findAll();
		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}
	
	@Test
	public void testOrdenados() {
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().ordenarClave();
		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}

//@Test
	public void testgrabar()
	{

		Usuario usuario = new Usuario();
		usuario.setUsuario("estoy en el curso");
		usuario.setClave("clave del curso");
		getjPAServiceInterface().save(usuario);

	}
	
	//@Test
	public void testaltaUsuario() {
		Rol rol = getJpaRolesInterface().gerRolByRol("ADMINISTRADOR");
		Usuario usuario = new Usuario();
		usuario.setUsuario("Jorge");
		usuario.setClave("123456");
		usuario.setEnabled(true);
		usuario.setRol(rol);
	}

	public JPAUsuarioServiceInterface getjPAServiceInterface()
	{
		return jPAServiceInterface;
	}

	public void setjPAServiceInterface(JPAUsuarioServiceInterface jPAServiceInterface)
	{
		this.jPAServiceInterface = jPAServiceInterface;
	}

}
