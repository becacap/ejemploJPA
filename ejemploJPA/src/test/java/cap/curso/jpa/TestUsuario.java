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
<<<<<<< HEAD
import cap.curso.jpa.servicios.JPARolServiceInterface;
import cap.curso.jpa.servicios.JPAUsuarioService;
import cap.curso.jpa.servicios.JPAUsuarioServiceInterface;
=======
import cap.curso.jpa.servicios.JPAServiceInterface;
>>>>>>> branch 'feature-sdo' of https://github.com/becacap/ejemploJPA.git

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TestUsuario
{
	@Autowired
	private JPAUsuarioServiceInterface jPAServiceInterface;
	
	@Autowired
	private JPARolServiceInterface jpaRolServiceInterface;

	// @Test
	public void testOrdenados()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().ordenarClave();

		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}

	// @Test
	public void testTodos()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().findAll();
		for (Usuario usuario : usuarios)
		{
			System.out.println(usuario.getUsuario() + " - " + usuario.getClave());
		}
	}

	// @Test
	// @Transactional
	public void grabar()
	{

		Usuario usuario = new Usuario();
		usuario.setUsuario("estoy en el curso");
		usuario.setClave("clave del curso");
		getjPAServiceInterface().save(usuario);

	}

	//@Test
	public void grabarRol()
	{

		Rol rol = new Rol();
		Rol rol1 = new Rol();
		rol.setRol("Usuario");
		rol1.setRol("Admin");
		getJpaRolServiceInterface().save(rol);
		getJpaRolServiceInterface().save(rol1);

	}
	
	@Test
	public void altaUsuario() {
		Rol rol = getJpaRolServiceInterface().getRolByRol("ADMINISTRADOR");
		Usuario usuario = new Usuario();
		usuario.setUsuario("sergio");
		usuario.setClave("123456");
		usuario.setEnabled(true);
		usuario.setRol(rol);
		getjPAServiceInterface().save(usuario);
	}
	
	

	public JPARolServiceInterface getJpaRolServiceInterface()
	{
		return jpaRolServiceInterface;
	}

	public void setJpaRolServiceInterface(JPARolServiceInterface jpaRolServiceInterface)
	{
		this.jpaRolServiceInterface = jpaRolServiceInterface;
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
