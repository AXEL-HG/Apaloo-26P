package alumnos;
import java.time.LocalDate;
import core.Persona;
import Practicas.practica_04_herencia_e_intefaces.src.Cuentas.derivadas.CuentaAhorro;

public class Estudiante extends Persona {

    //atributos

    private String matricula;
    private double promedio;
    private LocalDate fechaIngreso;
    private CuentaAhorro cuentaAhorro;

    public Estudiante(String nombre, String direccion, LocalDate fechaNacimiento, String matricula, double promedio, LocalDate fechaIngreso) {
        super(nombre, direccion, fechaNacimiento);

        this.fechaIngreso = fechaIngreso;
        this.promedio = promedio;
        this.matricula = matricula;
        this.cuentaAhorro = null; 
    
    }

    //metodos 

    public void inscribirMateria(String materia) {
        System.out.println("El estudiante }: " + getNombre() + " Inscribio la materia: " + materia);
    }

    public double calcularBeca() {

        if (this.promedio >= 9) {
            return 3000;
        } else if (this.promedio >= 8) { 
            return 2000;
        } else {
            return 1000;
        }

    }

    //getters y setters
    public CuentaAhorro getCuentaAhorro() { return cuentaAhorro; }
    public void setCuentaAhorro(CuentaAhorro cuentaAhorro) { this.cuentaAhorro = cuentaAhorro; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) {this.matricula = matricula;}
    
    public double getPromedio() {return promedio;}
    public void setPromedio(double promedio) {this.promedio = promedio;}

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

}