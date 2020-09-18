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
@Table(name="accesos")
public class Acceso
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private int year;
	
	@ManyToOne
	@JoinColumn(name= "empleados_id")
	private Empleado empleado;
	
	@Column
	private int month;
	
	@Column
	private int day;
	
	@Column
	private int minuto;
	
	@Column
	private int hora;
	
	@Column
	private int tipo;
	
	@Column
	private String fecha;
	
	@Column
	private int horaReal;
	
	@Column
	private int minutoReal;
}
