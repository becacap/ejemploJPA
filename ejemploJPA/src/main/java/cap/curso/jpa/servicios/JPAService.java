package cap.curso.jpa.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import cap.curso.jpa.entidades.Usuario;
import cap.curso.jpa.repositorios.UsuarioRepositoryInterface;

@Service
public class JPAService implements JPAServiceInterface
{
	@Autowired
	private UsuarioRepositoryInterface usuarioRepository;

	
	public Usuario save(Usuario usuario)
	{
		// TODO Auto-generated method stub
		return getUsuarioRepository().save(usuario);
	}

	public Iterable<Usuario> findAll()
	{
		// TODO Auto-generated method stub
		return getUsuarioRepository().findAll();
	}

	public Iterable<Usuario> ordenarClave(){
		return getUsuarioRepository().ordenarClave();
	}

	public UsuarioRepositoryInterface getUsuarioRepository()
	{
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepositoryInterface usuarioRepository)
	{
		this.usuarioRepository = usuarioRepository;
	}

	
	
	

}
