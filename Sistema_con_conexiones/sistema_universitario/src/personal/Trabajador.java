package Sistema_con_conexiones.sistema_universitario.src.personal;
import java.time.LocalDate;
import java.time.Period;
import Sistema_con_conexiones.sistema_universitario.src.core.Persona;

public class Trabajador extends Persona{

    //?Atributos -----------------------------
    private LocalDate fechaIngreso;
    private String puesto;
    private Double salario;
    
    //?Constructor ------------------------------
    public Trabajador(String nombre, String direccion, LocalDate fechaNacimiento, Double salario, String puesto, LocalDate fechaIngreso) {
        super(nombre, direccion, fechaNacimiento);
        
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.puesto = puesto;
        
    }

    //?Metodos

    public int calcularAntiguedad() {
        if (this.fechaIngreso == null) return 0;
        return Period.between(this.fechaIngreso, LocalDate.now()).getYears();
    }

    public void solicitarVacaciones() {
        System.out.println("El trabajador: " + getNombre() + " ha solicitado vacaciones");
    }

    //?to String
    public String toString() {
        return "Trabajador{Puesto: " + getPuesto() + " Salario: " + getSalario() + " Fecha de ingreso: " + getFechaIngreso() + super.toString() + "}";
    }

    //?Getters y setters -----------------
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
