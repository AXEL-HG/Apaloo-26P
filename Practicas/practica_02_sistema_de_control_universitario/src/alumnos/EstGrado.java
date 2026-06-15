package alumnos;
import java.time.LocalDate;

public class EstGrado extends Estudiante {

    private String titulacion;
    private int creditos;
    private boolean servicioSocial;

    public EstGrado(String nombre, String direccion, LocalDate fechaNacimiento, String matricula, double promedio,
                    LocalDate fechaIngreso, String titulacion, int creditos, boolean servicioSocial) {
        super(nombre, direccion, fechaNacimiento, matricula, promedio, fechaIngreso);
        this.titulacion = titulacion;
        this.creditos = creditos;
        this.servicioSocial = servicioSocial;
    }

    public void realizarProyecto() {
        System.out.println("El estudiante " + getNombre() + " está desarrollando / ha concluido " +
                        "satisfactoriamente su proyecto de titulación modalidad: " + titulacion);
    }

    public void solicitarTitulacion() {
        boolean tieneServicio = getServicioSocial();
        boolean tieneCreditios = getCreditos() >= 300;

        if (tieneServicio && tieneCreditios) {
            System.out.println("El estudiante " + getNombre() + " puede iniciar el trámite de titulación.");
        } else {
            System.out.println("El estudiante " + getNombre() + " NO cumple los requisitos:");
            if (!tieneServicio) System.out.println("  ✗ Falta completar el servicio social.");
            if (!tieneCreditios) System.out.println("  ✗ Faltan créditos (tiene " + creditos + " de 300 requeridos).");
        }
    }

    @Override
    public String toString() {
        return "EstGrado{nombre='" + getNombre() + "', titulacion='" + titulacion +
            "', creditos=" + creditos + ", servicioSocial=" + servicioSocial + "}";
    }

    public String getTitulacion() { return titulacion; }
    public void setTitulacion(String titulacion) { this.titulacion = titulacion; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public boolean getServicioSocial() { return servicioSocial; }
    public void setServicioSocial(boolean servicioSocial) { this.servicioSocial = servicioSocial; }
}
