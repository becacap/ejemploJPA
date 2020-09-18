package cap.curso.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS_ESTADOS")
public class Usuario_estado
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name= "EMPLEADOS_ID")
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name= "ESTADOS_ID")
	private Estado estado;
	
	@ManyToOne
	@JoinColumn(name= "CALENDARIOS_ID")
	private Calendario calendario;
	
	@ManyToOne
	@JoinColumn(name= "JORNADAS_ID")
	private Jornada jornada;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Empleado getEmpleado()
	{
		return empleado;
	}

	public void setEmpleado(Empleado empleado)
	{
		this.empleado = empleado;
	}

	public Estado getEstado()
	{
		return estado;
	}

	public void setEstado(Estado estado)
	{
		this.estado = estado;
	}

	public Calendario getCalendario()
	{
		return calendario;
	}

	public void setCalendario(Calendario calendario)
	{
		this.calendario = calendario;
	}

	public Jornada getJornada()
	{
		return jornada;
	}

	public void setJornada(Jornada jornada)
	{
		this.jornada = jornada;
	}
}
