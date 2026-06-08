package alumnos;
import java.time.LocalDate;

import core.Persona;

public class Estudiante extends Persona {

    //atributos

    private String matricula;
    private double promedio;
    private LocalDate fechaIngreso;

    public Estudiante(String nombre, String direccion, LocalDate fechaNacimiento, String matricula, double promedio, LocalDate fechaIngreso) {
        super(nombre, direccion, fechaNacimiento);

        this.fechaIngreso = fechaIngreso;
        this.promedio = promedio;
        this.matricula = matricula;
    
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

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) {this.matricula = matricula;}
    
    public double getPromedio() {return promedio;}
    public void setPromedio(double promedio) {this.promedio = promedio;}

    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

}