package cap.curso.jpa.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "jornadas")
public class Jornada {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String lunes;
	
	@Column
	private String martes;
	
	@Column
	private String miercoles;
	
	@Column
	private String jueves;
	
	@Column
	private String viernes;
	
	@Column
	private String sabado;
	
	@Column
	private String doming;
	
	@Column
	private int especial;
	
	@ManyToMany
	@JoinTable (
			name 			   = "empleado_jornadas",
			joinColumns 	   = @JoinColumn (name = "jornadas_id"),
			inverseJoinColumns = @JoinColumn (name = "empleados_id")
	)
	private List<Empleado> empleados;
}
