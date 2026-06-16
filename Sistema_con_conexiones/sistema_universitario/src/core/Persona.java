package Sistema_con_conexiones.sistema_universitario.src.core;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private LocalDate fechaNacimiento;
    private String direccion;
    private String nombre;

    //constructor
    public Persona(String direccion, String nombre, LocalDate fechaNacimiento) {

        this.direccion = direccion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    //metodos
    public void actualizarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public int obtenerEdad(){
        if (this.fechaNacimiento == null) return 0;
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    //to String
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + obtenerEdad() + ", direccion='" + direccion + "'}";
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
