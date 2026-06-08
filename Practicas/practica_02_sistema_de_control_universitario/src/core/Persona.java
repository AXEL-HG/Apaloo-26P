package core;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;

    public Persona(String nombre, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void actualizarDireccion(String nuevaDir) {
        this.direccion = nuevaDir;
    }

    public int obtenerEdad() {
        if (this.fechaNacimiento == null) return 0;
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esAdultoMayor() {
        return obtenerEdad() >= 60;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + obtenerEdad() + ", direccion='" + direccion + "'}";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
}
