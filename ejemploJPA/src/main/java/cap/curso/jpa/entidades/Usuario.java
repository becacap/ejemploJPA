package cap.curso.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String usuario;
	
	@Column
	private String clave;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}

	public void setUsuario(String usuario)
	{
		// TODO Auto-generated method stub
		this.usuario=usuario;
	}

	public String getUsuario()
	{
		// TODO Auto-generated method stub
		return usuario;
	}

	public void setClave(String clave)
	{
		// TODO Auto-generated method stub
		this.clave=clave;
	}

	public String getClave()
	{
		// TODO Auto-generated method stub
		return clave;
	}
}
