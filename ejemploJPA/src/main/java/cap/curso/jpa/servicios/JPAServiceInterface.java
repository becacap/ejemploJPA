package cap.curso.jpa.servicios;

import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Usuario;
import cap.curso.jpa.repositorios.UsuarioRepositoryInterface;

@Service
public interface JPAServiceInterface
{
	
	public Usuario save(Usuario usuario);
	
	public Iterable<Usuario> findAll();

}
