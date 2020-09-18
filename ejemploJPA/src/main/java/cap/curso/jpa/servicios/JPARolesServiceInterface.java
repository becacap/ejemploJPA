package cap.curso.jpa.servicios;

import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Rol;

@Service
public interface JPARolesServiceInterface {

    public Rol save(Rol rol);

    public Iterable<Rol> findAll();

    public Rol getRolByName(String nombreRol);

}
