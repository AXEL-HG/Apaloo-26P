package Sistema_con_conexiones.sistema_universitario.src.core;
import Sistema_con_conexiones.sistema_universitario.src.academia.Departamento;
import Sistema_con_conexiones.sistema_universitario.src.alumnos.Estudiante;
import Sistema_con_conexiones.sistema_universitario.src.personal.Trabajador;

import java.util.List;
import java.util.ArrayList;

public class Universidad {
    
    //? Atributos
    private String nombre;
    private String ciudad;
    private int fundacion;
    private int capacidadMaxima; 

    private List<Departamento> departamentos = new ArrayList<>();
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Trabajador> trabajadores = new ArrayList<>();
    

    //? Constructor
    public Universidad(String nombre, String ciudad, int fundacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.capacidadMaxima = capacidadMaxima; 
        }
    
    //? Metodos

    public void registrarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < capacidadMaxima) {
            estudiantes.add(estudiante);
            System.out.println("El estudiante: " + estudiante.getNombre() + " ha sido registrado EXITOSAMENTE");
        } else {
            System.out.println("Error: El estudiante: " + estudiante.getNombre() + " no ha sido registrado debido a que el cupo ha alcanzado su máximo");
        }
    }

    public void contratarTrabajador(Trabajador trabajador) {
        if (trabajadores.size() < capacidadMaxima) {
            trabajadores.add(trabajador);
            System.out.println("El trabajador: " + trabajador.getNombre() + " ha sido contratado EXITOSAMENTE");
        } else {
            System.out.println("Error: El trabajador " + trabajador.getNombre() + " no pudo ser contratado, cupo máximo alcanzado.");
        }
    }

    public int buscarEstudiante(String nombre) {
        return busquedaRecursivaEstudiante(nombre, 0);
    }

    private int busquedaRecursivaEstudiante(String nombre, int indice) {
        if (indice >= estudiantes.size()) return -1;
        
        if (estudiantes.get(indice).getNombre().equalsIgnoreCase(nombre)) return indice;
        
        return busquedaRecursivaEstudiante(nombre, indice + 1);
    }

    public int buscarTrabajador(String nombre) {
        return busquedaRecursivaTrabajador(nombre, 0);
    }

    private int busquedaRecursivaTrabajador(String nombre, int indice) {
        if (indice >= trabajadores.size()) return -1;
        if (trabajadores.get(indice).getNombre().equalsIgnoreCase(nombre)) return indice;
        
        return busquedaRecursivaTrabajador(nombre, indice + 1);
    }

    //? to String
    @Override
    public String toString() {
        return "Universidad{Nombre: " + getNombre() + ", Ciudad: " + getCiudad() + ", Fundacion: " + getFundacion() + "}";
    }

    //? Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getFundacion() {
        return fundacion;
    }
    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }
    
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}