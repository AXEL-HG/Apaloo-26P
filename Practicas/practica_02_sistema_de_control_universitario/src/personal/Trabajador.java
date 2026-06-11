package personal;
import core.Persona;
import java.time.LocalDate;
import java.time.Period;

// Conexión con el paquete de la práctica 4
import Practicas.practica_04_herencia_e_intefaces.src.Cuentas.derivadas.CuentaCorriente;

public class Trabajador extends Persona {

    private LocalDate fechaIngreso;
    private double salario;
    private String puesto;
    private CuentaCorriente cuentaCorriente;

    public Trabajador(String nombre, String direccion, LocalDate fechaNacimiento,
                      String puesto, double salario, LocalDate fechaIngreso) {
        super(nombre, direccion, fechaNacimiento);
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
        this.cuentaCorriente = null; // Inicializada como nula por defecto
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
        String estadoCuenta = (cuentaCorriente != null) ? "Asignada (No. " + cuentaCorriente.getNumeroCuenta() + ")" : "Ninguna";
        return "Trabajador{nombre='" + getNombre() + "', puesto='" + puesto +
               "', salario=" + salario + ", antiguedad=" + calcularAntiguedad() + " años, cuentaCorriente=" + estadoCuenta + "}";
    }

    // Métodos Getter y Setter para la cuenta corriente
    public CuentaCorriente getCuentaCorriente() { return cuentaCorriente; }
    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) { this.cuentaCorriente = cuentaCorriente; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
}