package cap.curso.jpa;

import java.util.ArrayList;
import java.util.Iterator;
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
	Iterator it = list.iterator();
	while (it.hasNext()) {
	    Rol r = (Rol) it.next();
	    System.out.println(r.getRol());
	    // System.out.println(r.getUsuarios().size());
	    // getUsuarios() -> si es LAZY, devuelve una lista null, si es EAGER, se
	    // devuelve la lista de los usuarios
	}
    }

}