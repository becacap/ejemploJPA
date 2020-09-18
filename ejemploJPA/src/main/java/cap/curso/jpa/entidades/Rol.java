package cap.curso.jpa.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String rol;
	
//	@OneToMany (mappedBy = "rol")			// Inverse of ManyToOne
//	private List<Usuario> usuarios;
//	
//	public void addUsuario (Usuario usuario) {
//		getUsuarios ().add (usuario);
//	}
//	
//	public void removeUsuario (Usuario usuario) {
//		getUsuarios ().remove (usuario);
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

//	public List<Usuario> getUsuarios() {
//		return usuarios;
//	}
//
//	public void setUsuarios(List<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}

}
