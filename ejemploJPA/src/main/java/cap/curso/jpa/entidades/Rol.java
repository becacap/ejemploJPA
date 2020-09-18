package cap.curso.jpa.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String rol;
	
	@OneToMany(mappedBy ="rol")
	private List<Usuario> usuario;
	


	public List<Usuario> getUsuarios()
	{
		return usuario;
	}

	public void setUsuarios(List<Usuario> usuario)
	{
		this.usuario = usuario;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getRol()
	{
		return rol;
	}

	public void setRol(String rol)
	{
		this.rol = rol;
	}
	
	

}
