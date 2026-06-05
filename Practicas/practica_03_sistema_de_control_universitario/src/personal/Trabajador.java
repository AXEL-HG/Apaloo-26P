package personal;
import core.Persona;
import java.time.LocalDate;
import java.time.Period;

public class Trabajador extends Persona {

    private LocalDate fechaIngreso;
    private double salario;
    private String puesto;

    public Trabajador(String nombre, String direccion, LocalDate fechaNacimiento,
                      String puesto, double salario, LocalDate fechaIngreso) {
        super(nombre, direccion, fechaNacimiento);
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public int calcularAntiguedad() {
        if (this.fechaIngreso == null) return 0;
        return Period.between(this.fechaIngreso, LocalDate.now()).getYears();
    }

    public void solicitarVacaciones() {
        System.out.println("El trabajador " + getNombre() + " ha solicitado vacaciones.");
    }

    @Override
    public String toString() {
        return "Trabajador{nombre='" + getNombre() + "', puesto='" + puesto +
               "', salario=" + salario + ", antiguedad=" + calcularAntiguedad() + " años}";
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
}
