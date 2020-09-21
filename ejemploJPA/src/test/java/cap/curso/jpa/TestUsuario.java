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
import cap.curso.jpa.servicios.JPARolServiceInterface;
import cap.curso.jpa.servicios.JPAUsuarioServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TestUsuario
{
	@Autowired
	private JPAUsuarioServiceInterface jPAUsuarioServiceInterface;
	
	@Autowired
	private JPARolServiceInterface jpaRolServiceInterface;

	
	@Test
	public void testTodosRoles()
	{
		List<Rol> roles = (List<Rol>) getJpaRolServiceInterface().findAll();
		for (Rol rol : roles)
		{
			System.out.println(rol.getRol());
		}
	}
	
	@Test
	public void altaUsuario() {
		Rol rol = getJpaRolServiceInterface().getRolByRol("MIEMBRO");
		Usuario usuario = new Usuario();
		usuario.setUsuario("Jorge");
		usuario.setClave("dodo");
		usuario.setEnabled(true);
		usuario.setRol(rol);
		//getJpaRolServiceInterface().save(rol);
	}
	
	
	@Test
	public void testTodos()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().findAll();
		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}

	//@Test
	// @Transactional
	public void grabar()
	{

		Usuario usuario = new Usuario();
		usuario.setUsuario("estoy en el curso");
		usuario.setClave("clave del curso");
		getjPAServiceInterface().save(usuario);

	}

	
	/////////////////////////////////////////////////////////////////////////
	
	
	public JPAUsuarioServiceInterface getjPAServiceInterface()
	{
		return jPAUsuarioServiceInterface;
	}

	public void setjPAServiceInterface(JPAUsuarioServiceInterface jPAUsuarioServiceInterface)
	{
		this.jPAUsuarioServiceInterface = jPAUsuarioServiceInterface;
	}
	
	public JPARolServiceInterface getJpaRolServiceInterface()
	{
		return jpaRolServiceInterface;
	}

	public void setJpaRolServiceInterface(JPARolServiceInterface jpaRolServiceInterface)
	{
		this.jpaRolServiceInterface = jpaRolServiceInterface;
	}


}
