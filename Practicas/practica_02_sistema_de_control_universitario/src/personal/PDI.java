package personal;
import java.time.LocalDate;

public class PDI extends Trabajador {

    private String categoria;
    private String especialidad;
    private int horasDocencia;
    private Doctor doctor;

    public PDI(String nombre, String direccion, LocalDate fechaNacimiento, String puesto, double salario,
               LocalDate fechaIngreso, String categoria, String especialidad, int horasDocencia) {
        super(nombre, direccion, fechaNacimiento, puesto, salario, fechaIngreso);
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.horasDocencia = horasDocencia;
    }

    public void investigar(String tema) {
        System.out.println("El profesor " + getNombre() + " está realizando una investigación sobre: " + tema);
    }

    public void impartirClase() {
        System.out.println("El profesor " + getNombre() + " impartió una clase. Horas de docencia asignadas: " + horasDocencia);
    }

    @Override
    public String toString() {
        return "PDI{nombre='" + getNombre() + "', categoria='" + categoria +
               "', especialidad='" + especialidad + "', horasDocencia=" + horasDocencia + "}";
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getHorasDocencia() { return horasDocencia; }
    public void setHorasDocencia(int horasDocencia) { this.horasDocencia = horasDocencia; }

    public void setDoctor(Doctor tituloDoctor) {
        this.doctor = tituloDoctor;
        System.out.println("Doctor asignado a " + getNombre() + ": " + tituloDoctor);
    }

    public Doctor getDoctor() { return doctor; }
}
