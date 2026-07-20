package Sistema_con_conexiones.sistema_universitario.src.academia;
import Sistema_con_conexiones.sistema_universitario.src.personal.PDI;
import java.util.List;
import java.util.ArrayList;

public class Departamento {
    
    //?Atributos
    private String nombre;
    private String codigo;
    private String ubicacion;
    private int capacidadMaxima;
    private List<PDI> profesores = new ArrayList<>();
    
    //?Constructor
    public Departamento(String nombre, String codigo, String ubicacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    //?Metodos
    public void asignarProfesor(PDI profesor) {

        if (profesores.size() < capacidadMaxima) {
            profesores.add(profesor);
            System.out.println("El profesor: " + profesor.getNombre() + " ha sido asignado al departamento: " + this.nombre);
        } else {
            System.out.println("El profesor: " + profesor.getNombre() + " no ha podido ser asignado al departamento: " + this.nombre + " debido a que el cupo ya esta lleno");
        }

    }

    public void listarPersonal(){

        System.out.println("------------------------Personal del departamento---------------------");
        for (PDI profesor : profesores) {
            System.out.println(profesor.toString());
        }
    }

    public int buscarProfesor(String nombre) {
        return busquedaRecursivaProfesor(nombre, 0);
    }

    private int busquedaRecursivaProfesor(String nombre, int indice) {
        if (indice >= profesores.size()) return -1;
        if (profesores.get(indice).getNombre().equalsIgnoreCase(nombre)) return indice;
        
        return busquedaRecursivaProfesor(nombre, indice + 1);
    }

    //? To String
    @Override
    public String toString() {
        return "Departamento{Nombre: " + getNombre() + ", Codigo: " + getCodigo() + ", Ubicacion: " + getUbicacion() + "}";
    }

    //?Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<PDI> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<PDI> profesores) {
        this.profesores = profesores;
    }

}
