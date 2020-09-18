package cap.curso.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	public Integer getId()
	{
		return id;
	}

	public String getRol()
	{
		return rol;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public void setRol(String rol)
	{
		this.rol = rol;
	}
}
