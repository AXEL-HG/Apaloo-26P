package Sistema_con_conexiones.sistema_universitario.src.academia;

import Sistema_con_conexiones.sistema_universitario.src.personal.PDI;

public class Departamento {
    
    //?Atributos
    private String nombre;
    private String codigo;
    private String ubicacion;
    private PDI[] profesores;
    
    //?Constructor
    public Departamento(String nombre, String codigo, String ubicacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.profesores = new PDI[capacidadMaxima];
    }

    //?Metodos
    public void asignarProfesor(PDI profesor) {

        for(int i = 0; i < profesores.length; i++) {
            if (profesores[i] == null) {
                profesores[i] = profesor;
                System.out.println("El profesor: " + profesor.getNombre() + " ha sido asignado al departamento: " + this.nombre);
                return;
            }
        }
        System.out.println("Error: el profersor: " + profesor.getNombre() + " no ha podido ser registrado al departamento departamento: " + this.nombre + " ya esta lleno");

    }

    public void listarPersonal(){

        System.out.println("------------------------Personal del departamento---------------------");
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] != null) {
                System.out.println(profesores[i].toString());
            }
        }
    }

    public int buscarProfesor(String nombre) {
        return busquedaRecursivaProfesor(nombre, 0);
    }

    private int busquedaRecursivaProfesor(String nombre, int indice) {
        if (indice >= profesores.length) return -1;
        if (profesores[indice] != null && profesores[indice].getNombre().equalsIgnoreCase(nombre)) return indice;
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

    public PDI[] getProfesores() {
        return profesores;
    }

    public void setProfesores(PDI[] profesores) {
        this.profesores = profesores;
    }

}
