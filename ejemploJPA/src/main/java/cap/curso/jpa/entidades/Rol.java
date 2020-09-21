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
	
	// Podemos tener el SequenceGenerator
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String rol;


	public String getRol()
	{
		return rol;
	}


	public void setRol(String rol)
	{
		this.rol = rol;
	}

}
