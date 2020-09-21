package cap.curso.jpa.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accesos")
public class Acceso
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private int years;
	
	@ManyToOne
	@JoinColumn(name = "empleados_id")
	private Empleado empleado;
	
	@Column
	private int minuto;	

	@Column
	private int hora;
	
	@Column
	private int tipo;
	
	@Column
	private Date fecha;
	
	@Column
	private int horaReal;
	
	@Column
	private int minutoReal;


	////////////////////////////////////////////////////////////
	
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public int getYears()
	{
		return years;
	}

	public void setYears(int years)
	{
		this.years = years;
	}

	public Empleado getEmpleado()
	{
		return empleado;
	}

	public void setEmpleado(Empleado empleado)
	{
		this.empleado = empleado;
	}

	public int getMinuto()
	{
		return minuto;
	}

	public void setMinuto(int minuto)
	{
		this.minuto = minuto;
	}

	public int getHora()
	{
		return hora;
	}

	public void setHora(int hora)
	{
		this.hora = hora;
	}

	public int getTipo()
	{
		return tipo;
	}

	public void setTipo(int tipo)
	{
		this.tipo = tipo;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public int getHoraReal()
	{
		return horaReal;
	}

	public void setHoraReal(int horaReal)
	{
		this.horaReal = horaReal;
	}

	public int getMinutoReal()
	{
		return minutoReal;
	}

	public void setMinutoReal(int minutoReal)
	{
		this.minutoReal = minutoReal;
	}
	
	
	
}
