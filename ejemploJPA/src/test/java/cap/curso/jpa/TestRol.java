package cap.curso.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.jpa.configuracion.Configuracion;
import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.servicios.JPARolServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TestRol
{
	@Autowired
	private JPARolServiceInterface jPAServiceInterface;
	
	@Test
	public void grabar() {
		Rol rol = new Rol();
		rol.setRol("ADMINISTRADOR");
		Rol rol1 = new Rol();
		rol1.setRol("EMPLEADO");
		
		getjPAServiceInterface().save(rol);
		getjPAServiceInterface().save(rol1);
		
		
	}

	public JPARolServiceInterface getjPAServiceInterface()
	{
		return jPAServiceInterface;
	}

	public void setjPAServiceInterface(JPARolServiceInterface jPAServiceInterface)
	{
		this.jPAServiceInterface = jPAServiceInterface;
	}
}
