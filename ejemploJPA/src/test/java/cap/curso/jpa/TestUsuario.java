package cap.curso.jpa;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.jpa.entidades.Usuario;
import cap.curso.jpa.servicios.JPAServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuration.class)
public class TestUsuario
{
	@Autowired
	private JPAServiceInterface jPAServiceInterface;
	
	//@Test
	public void testTodos()
	{
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().findAll();
		for (Usuario usuario :  usuarios) {
			System.out.println(usuario.getUsuario()+" - "+usuario.getClave());
		}
	}
	@Test
	public void testOrdenados() {
		List<Usuario> usuarios = (List<Usuario>) getjPAServiceInterface().ordenarClave();
		for (Usuario usuario :  usuarios) {
			System.out.println(usuario.getUsuario()+" - "+usuario.getClave());
		}
	}
	//@Test
	public void grabar() {
		Usuario usuario = new Usuario();
		usuario.setUsuario("Estoy en el curso");
		usuario.setClave("Clave del curso");
		getjPAServiceInterface().save(usuario);
	}

	public JPAServiceInterface getjPAServiceInterface()
	{
		return jPAServiceInterface;
	}

	public void setjPAServiceInterface(JPAServiceInterface jPAServiceInterface)
	{
		this.jPAServiceInterface = jPAServiceInterface;
	}

}
