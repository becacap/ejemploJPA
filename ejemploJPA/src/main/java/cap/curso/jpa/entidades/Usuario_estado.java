package cap.curso.jpa.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios_estados")
public class Usuario_estado
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "empleados_id")
	private Empleado empleado;
	
	@OneToOne
	@JoinColumn(name = "estados_id")
	private Estado estado;
	
	@OneToOne
	@JoinColumn(name = "calendarios_id")
	private Calendario calendario;
	
	@OneToOne
	@JoinColumn(name = "jornadas_id")
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
