package cap.curso.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	//Entidad de persistencia completa
@Table(name="usuarios")//Le indicamos el nombre de la tabla
public class Usuario
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //La clave primaria siempre es numérica 
	private int id;//Va a ser la clave primaria, hay que indicarselo con @Id y en el segundo @ decirle como se genera la clave primaria
	//Lo cambiamos a Integer o Long (Y no int o long) para que no de problemas al serializarlo y poder transportarlo, transformarlo y almacenarl
	@Column//Indica que es una columna de la base de datos. No hace falta el nombre porque coinciden pero podría ser otro, habría que añadir el name=""
	private String usuario;
	
	@Column//Le puedo indicar el tamaño que tiene en la base de datos con @Column(length = 45)
	private String clave;
	
	@Column
	private boolean enabled;
	
	@ManyToOne //Le decimos que tiene una relación ManyToOne.
	@JoinColumn(name="roles_id") //Le digo cual es el campo en el que existe la relación
	private Rol rol; //Creamos esto porque la tabla Usuarios depende de Roles
	
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
