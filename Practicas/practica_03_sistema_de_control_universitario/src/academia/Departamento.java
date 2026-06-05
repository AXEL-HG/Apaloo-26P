package academia;
import personal.PDI;

public class Departamento {

    private String nombre;
    private String codigo;
    private String ubicacion;

    private PDI[] profesores;
    private int contadorProfesores;

    public Departamento(String nombre, String codigo, String ubicacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.profesores = new PDI[capacidadMaxima]; 
        this.contadorProfesores = 0;
    }

    public void asignarProfesor(PDI profesor) {
        if (this.contadorProfesores < this.profesores.length) {
            this.profesores[this.contadorProfesores] = profesor;
            this.contadorProfesores++; 
            System.out.println("Profesor '" + profesor.getNombre() + "' asignado con éxito al departamento de " + this.nombre + ".");
        } else {
            System.out.println("Error: El departamento de " + this.nombre + " ya alcanzó el límite máximo de profesores.");
        }
    }

    public void listarPersonal() {
        System.out.println("\n=== Personal del Departamento de " + this.nombre + " ===");
        if (this.contadorProfesores == 0) {
            System.out.println("No hay personal asignado a este departamento todavía.");
        } else {
            for (int i = 0; i < this.contadorProfesores; i++) {
                System.out.println(this.profesores[i]);
            }
        }
    }

    //setters and getters

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getUbicacion() {return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

}