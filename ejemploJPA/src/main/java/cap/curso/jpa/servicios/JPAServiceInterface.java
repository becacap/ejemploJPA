package cap.curso.jpa.servicios;

import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Usuario;

@Service
public interface JPAServiceInterface
{
	public Usuario save(Usuario usuario);
	
	public Iterable<Usuario> findAll();
	
	public Iterable<Usuario> ordenarClave();
}
