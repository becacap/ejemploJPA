package cap.curso.jpa;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.jpa.configuracion.Configuracion;
import cap.curso.jpa.entidades.Rol;
import cap.curso.jpa.servicios.JPARolesServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TestRol {
    @Autowired
    private JPARolesServiceInterface jPARolesServiceInterface;

    public JPARolesServiceInterface getjPARolesServiceInterface() {
	return jPARolesServiceInterface;
    }

    public void setjPARolesServiceInterface(JPARolesServiceInterface jPARolesServiceInterface) {
	this.jPARolesServiceInterface = jPARolesServiceInterface;
    }

    // @Test
    public void saveRol() {
	Rol r = new Rol();
	r.setRol("Becario");
	// r.setUsuarios(new ArrayList<Usuario>()); // no hace falta al crear el rol

	getjPARolesServiceInterface().save(r);
    }

    @Test
    public void findAllRol() {
	Iterable<Rol> list = getjPARolesServiceInterface().findAll();
	Iterator<Rol> it = list.iterator();
	while (it.hasNext()) {
	    Rol r = it.next();
	    System.out.println(r.getRol());
	    // System.out.println(r.getUsuarios().size());
	    // getUsuarios() -> si es LAZY, devuelve una lista null, si es EAGER, se
	    // devuelve la lista de los usuarios
	}
    }

}