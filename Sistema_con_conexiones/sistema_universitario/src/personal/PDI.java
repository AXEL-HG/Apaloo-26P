package Sistema_con_conexiones.sistema_universitario.src.personal;
import java.time.LocalDate;

public class PDI extends Trabajador {

    //?Atributos
    private int horasDocencia;
    private String categoria;
    private String especilidad;

    
    //?Constructor
    public PDI(String nombre, String direccion, LocalDate fechaNacimiento, Double salario, String puesto,
            LocalDate fechaIngreso, String categoria, String especialidad, int horasDocencia) {
        super(nombre, direccion, fechaNacimiento, salario, puesto, fechaIngreso);
        
        this.categoria = categoria;
        this.especilidad = especialidad;
        this.horasDocencia = horasDocencia;
    }

    //?to String
    @Override
    public String toString() {
        return "PDI{Especialidad: " + getEspecilidad() + "Categoria:" + getCategoria() + " Horas de docencia: " + getHorasDocencia() + super.toString() +"}";
    }
    
    //?Getters y setters
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getEspecilidad() {
        return especilidad;
    }
    
    public void setEspecilidad(String especilidad) {
        this.especilidad = especilidad;
    }
    
    public int getHorasDocencia() {
        return horasDocencia;
    }
    
    public void setHorasDocencia(int horasDocencia) {
        this.horasDocencia = horasDocencia;
    }
}