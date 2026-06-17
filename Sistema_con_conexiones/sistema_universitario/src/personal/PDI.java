package Sistema_con_conexiones.sistema_universitario.src.personal;

import java.time.LocalDate;

public class PDI extends Trabajador{

    //?Atributos
    private String area;
    private int nivel;
    private String turno;

    //?Constructor
    public PDI(String nombre, String direccion, LocalDate fechaNacimiento, Double salario, String puesto,
        LocalDate fechaIngreso, String area, int nivel, String turno) {
            super(nombre, direccion, fechaNacimiento, salario, puesto, fechaIngreso);
            this.area = area;
            this.nivel = nivel;
            this.turno = turno;
        }


    //?Metodos
    public void administrarRecursos() {
        System.out.println("El trabajador: " + getNombre() + " perteneces al area: " + getArea());
    }

    public void generarReporte() {

    }

    //? Getters y settes
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
