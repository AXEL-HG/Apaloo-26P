package Sistema_con_conexiones.sistema_universitario.src.personal;
import java.time.Clock;
import java.time.LocalDate;

public class Doctor {

    //?Atributos

    private String especialidad;
    private int anioObtencion;
    private String universidad;

    //? Constructor
    public Doctor(String especialidad, String universidad, int anioObtencion) {
        this.especialidad = especialidad;
        this.universidad = universidad;
        this.anioObtencion = anioObtencion;
    }

    //?Metodos

    public boolean validarTitulo() {

        int anioActual = LocalDate.now(Clock.systemUTC()).getYear();

        if (this.anioObtencion <= anioActual && this.universidad != null && !this.universidad.isEmpty()) {
            System.out.println("Validación en proceso... El título expedido por " + this.universidad + " es auténtico.");
            return true;
        } else {
            System.out.println("Error de validación: Datos del título inconsistentes.");
            return false;
        }
    }

    public void registrarTitulo() {
        if (validarTitulo()) {
            System.out.println("ÉXITO: El título de Doctorado en " + this.especialidad + " ha sido registrado oficialmente en el sistema.");
        } else {
            System.out.println("OPERACIÓN DENEGADA: No se pudo registrar el título.");
        }
    }

    //?to String
    @Override
    public String toString() {
        return "Doctor{Especialidad: " + getEspecialidad() + " Universidad: " + getUniversidad() + " Año de obtención: " + getAnioObtencion() + "}";
    }
    
    //? Getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getAnioObtencion() {
        return anioObtencion;
    }

    public void setAnioObtencion(int anioObtencion) {
        this.anioObtencion = anioObtencion;
    }

    
}
