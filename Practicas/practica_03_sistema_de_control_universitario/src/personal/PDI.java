package personal;
import java.time.LocalDate;

public class PDI extends Trabajador {

    private String categoria;
    private String especialidad;
    private int horasDocencia;

    public PDI(String nombre, String direccion, LocalDate fechaNacimiento, String puesto, double salario,
            LocalDate fechaIngreso, String categoria, String especialidad, int horasDocencia) {
        super(nombre, direccion, fechaNacimiento, puesto, salario, fechaIngreso);

        this.categoria = categoria;
        this.especialidad = especialidad;
        this.horasDocencia = horasDocencia;

    }

    //getters y setters
    public String getEspecialidad() {return especialidad;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria }

    public int getHorasDocencia() {return horasDocencia;}
    public void setHorasDocencia(int horasDocencia) {this.horasDocencia = horasDocencia}

}