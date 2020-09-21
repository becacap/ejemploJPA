package cap.curso.jpa.servicios;

import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Usuario;
import cap.curso.jpa.repositorios.UsuarioRepositoryInterface;

@Service
public interface JPAUsuarioServiceInterface
{
	
	public Usuario save(Usuario usuario);
	
	public Iterable<Usuario> findAll();
	
	public Iterable<Usuario> ordenarClave();
	
	

}
