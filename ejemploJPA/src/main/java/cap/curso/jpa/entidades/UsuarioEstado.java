package cap.curso.jpa.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UsuarioEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "EMPLEADOS_ID", referencedColumnName = "id")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "ESTADOS_ID", referencedColumnName = "id")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "CALENDARIOS_ID", referencedColumnName = "id")
    private Calendario calendario;

    @ManyToOne
    @JoinColumn(name = "JORNADAS_ID", referencedColumnName = "id")
    private Jornada jornada;

}
