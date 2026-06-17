package Sistema_con_conexiones.sistema_universitario.src.alumnos;
import java.time.LocalDate;

import Sistema_con_conexiones.sistema_universitario.src.core.Persona;

public class Estudiante extends Persona{

    private String matricula;
    private double promedio;
    private LocalDate fechaIngreso;
    
    //?Constructor
    public Estudiante(String matricula, double promedio, LocalDate fechaIngreso, String nombre, String direccion, LocalDate fechaNacimiento) {
        super(nombre, direccion, fechaNacimiento);
        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaIngreso = fechaIngreso;
    }

    //?Metodos
    public void inscribirMateria(String materia) {
        System.out.println("El estudiante a inscrito la materia: " + materia + " Correctamente");
    }

    public double calcularBeca() {
        if (getPromedio() >= 9.0) {return 3000;}
        else if (getPromedio() >= 8) { return 2000;} 
        else { return 1000; }
    }

    //?toString
    @Override
    public String toString() {
        return "Estudiante{" + "matricula='" + matricula + '\'' + ", promedio=" + promedio + ", fechaIngreso=" + fechaIngreso + "} " + super.toString();
    }

    //?getters y setters
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
