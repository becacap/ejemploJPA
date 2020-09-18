package cap.curso.jpa.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String dni;
	
	@Column
	private String identificador;
	
	@Column
	private Date fecha_alta;
	
	@Column
	private Date fecha_baja;

	@Column
	private String clave;
	
	@OneToOne
	@JoinColumn (name = "usuarios_id")
	private Usuario usuario;
	
}
