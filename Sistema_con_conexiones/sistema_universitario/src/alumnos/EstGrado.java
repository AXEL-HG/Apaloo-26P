package Sistema_con_conexiones.sistema_universitario.src.alumnos;

import java.time.LocalDate;

public class EstGrado extends Estudiante{

    //?Atributos
    private String titulacion;
    private int creditos;
    private boolean servicioSocial;


    //?Constructor
    public EstGrado(String matricula, double promedio, LocalDate fechaIngreso, String nombre, String direccion,
            LocalDate fechaNacimiento, String titulacion, int creditos, boolean servicioSocial) {
        super(matricula, promedio, fechaIngreso, nombre, direccion, fechaNacimiento);

        this.titulacion = titulacion;
        this.creditos = creditos;
        this.servicioSocial = servicioSocial;

    }

    //?Metodos

    public void realizarProyecto() {
        System.out.println("El estudiante esta realizando o ha concluido satisfactoriamente su proyecto de titulacion un proyecto academico");
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

    //? toString

    


    //?getters y setters
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    public boolean getServicioSocial() {
        return servicioSocial;
    }

    public void setServicioSocial(boolean servicioSocial) {
        this.servicioSocial = servicioSocial;
    }
    
}
