package core;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    // Atributos limpitos y en minúsculas
    private String nombre;
    private String direccion;
    private LocalDate fechaNacimiento;

    // Constructor

    public Persona(String nombre, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos
    public void actualizarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public int obtenerEdad() {
        if (this.fechaNacimiento == null) return 0;
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esAdultoMayor() {
        return obtenerEdad() >= 60;
    }

    @Override
    public String toString(){
        return "Persona: " + nombre + ". Edad: " + obtenerEdad();
    }


    // --- GETTERS & SETTERS ---
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
}