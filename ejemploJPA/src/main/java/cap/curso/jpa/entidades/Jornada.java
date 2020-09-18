package cap.curso.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jornadas")
public class Jornada
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	private String descripcion;
	
	@Column
	private int especial;

}
