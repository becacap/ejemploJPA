package cap.curso.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="usuarios")

public class Usuario
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String usuario;
	
	@Column
	private String clave;
	
	@Column
	private boolean enabled;
	
	@ManyToOne
	@JoinColumn(name="roles_id")
	private Rol rol;
	

	public Rol getRol()
	{
		return rol;
	}


	public void setRol(Rol rol)
	{
		this.rol = rol;
	}


	public boolean isEnabled()
	{
		return enabled;
	}


	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getUsuario()
	{
		return usuario;
	}


	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}


	public String getClave()
	{
		return clave;
	}


	public void setClave(String clave)
	{
		this.clave = clave;
	}


	

}
