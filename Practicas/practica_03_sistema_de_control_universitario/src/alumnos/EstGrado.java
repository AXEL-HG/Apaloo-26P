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

        System.out.println("El estudiante esta desarrollando o ha concluido satisfactoriamente con su proyecto de titulacion");

    }

    public void solicitarTitulacion() {

        if ((getServicioSocial() == true) && (getCreditos() == 300 )) {
            System.out.println("El estudiante puede iniciar el tramite de titulacion");
        } else {
            System.out.println("El estudiante no cumple los requisitos para iniciar su tramite de titulacion");
        }

        
    }

    public String getTitulacion() { return titulacion; }
    public void setTitulacion(String titulacion) { this.titulacion = titulacion;}

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public boolean getServicioSocial() { return servicioSocial; }
    public void setServicioSocial(boolean servicioSocial) { this.servicioSocial = servicioSocial; }

}