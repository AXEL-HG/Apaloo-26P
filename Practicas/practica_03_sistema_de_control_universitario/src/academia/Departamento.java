package academia;
import personal.PDI;

public class Departamento {

    private String nombre;
    private String codigo;
    private String ubicacion;
    private PDI[] profesores;
    private int totalProfesores;

    public Departamento(String nombre, String codigo, String ubicacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.profesores = new PDI[capacidadMaxima];
        this.totalProfesores = 0;
    }

    public void asignarProfesor(PDI profesor) {
        if (totalProfesores < profesores.length) {
            profesores[totalProfesores++] = profesor;
            System.out.println("Profesor " + profesor.getNombre() + " asignado al departamento " + nombre);
        } else {
            System.out.println("El departamento " + nombre + " no tiene cupo para más profesores.");
        }
    }

    public void listarPersonal() {
        System.out.println("=== Personal del Departamento: " + nombre + " (" + codigo + ") ===");
        if (totalProfesores == 0) {
            System.out.println("  Sin profesores asignados.");
            return;
        }
        for (int i = 0; i < totalProfesores; i++) {
            System.out.println("  " + profesores[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Departamento{nombre='" + nombre + "', codigo='" + codigo +
               "', ubicacion='" + ubicacion + "', profesores=" + totalProfesores + "}";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public int getTotalProfesores() { return totalProfesores; }
}
