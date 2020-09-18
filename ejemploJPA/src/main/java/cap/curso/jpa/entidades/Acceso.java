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
@Table(name="accesos")
public class Acceso
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private Integer year;
	@Column
	private Integer month;
	@Column
	private Integer day;
	@Column
	private Integer minuto;
	@Column
	private Integer hora;
	@Column
	private Integer tipo;
	@Column
	private Date fecha;
	@Column
	private Integer horaReal;
	@Column
	private Integer minutoReal;
	@ManyToOne
	@JoinColumn(name="empleados_id")
	private Empleado empleado;
	
	
	public Integer getId()
	{
		return id;
	}
	public Integer getYear()
	{
		return year;
	}
	public Integer getMonth()
	{
		return month;
	}
	public Integer getDay()
	{
		return day;
	}
	public Integer getMinuto()
	{
		return minuto;
	}
	public Integer getHora()
	{
		return hora;
	}
	public Integer getTipo()
	{
		return tipo;
	}

	public Date getFecha()
	{
		return fecha;
	}
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}
	public Integer getHoraReal()
	{
		return horaReal;
	}
	public Integer getMinutoReal()
	{
		return minutoReal;
	}
	public Empleado getEmpleado()
	{
		return empleado;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setYear(Integer year)
	{
		this.year = year;
	}
	public void setMonth(Integer month)
	{
		this.month = month;
	}
	public void setDay(Integer day)
	{
		this.day = day;
	}
	public void setMinuto(Integer minuto)
	{
		this.minuto = minuto;
	}
	public void setHora(Integer hora)
	{
		this.hora = hora;
	}
	public void setTipo(Integer tipo)
	{
		this.tipo = tipo;
	}
	public void setHoraReal(Integer horaReal)
	{
		this.horaReal = horaReal;
	}
	public void setMinutoReal(Integer minutoReal)
	{
		this.minutoReal = minutoReal;
	}
	public void setEmpleado(Empleado empleado)
	{
		this.empleado = empleado;
	}
}
