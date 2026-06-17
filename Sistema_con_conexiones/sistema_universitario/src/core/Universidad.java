package Sistema_con_conexiones.sistema_universitario.src.core;
import Sistema_con_conexiones.sistema_universitario.src.academia.Departamento;
import Sistema_con_conexiones.sistema_universitario.src.alumnos.Estudiante;
import Sistema_con_conexiones.sistema_universitario.src.personal.Trabajador;

public class Universidad {
    
    //?Atributos
    private String nombre;
    private String ciudad;
    private int fundacion;

    private Departamento[] departamentos;
    private Estudiante[] estudiantes;
    private Trabajador[] trabajadores;
    

    //?Constructor
    public Universidad(String nombre, String ciudad, int fundacion, int capacidadMaxima) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.trabajadores = new Trabajador[capacidadMaxima];
        this.estudiantes = new Estudiante[capacidadMaxima];
        this.departamentos = new Departamento[capacidadMaxima];
    }
    
    //?Metodos

    public void registrarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println("El estudiante: " + estudiante.getNombre() + "a sido registrado EXITOSAMENTE");
                return;
            }
        }
        System.out.println("Error: El estuidante: " + estudiante.getNombre() + " no ha sido registrado debido a que el cupo a alcanzado su maximo");
    }

    public void contratarTrabajador(Trabajador trabajador) {
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] == null) {
                trabajadores[i] = trabajador;
                System.out.println("El trabajador: " + trabajador.getNombre() + " ha sido contratado EXITOSAMENTE");
                return;
            }
        }
        System.out.println("Error: El trabajador " + trabajador.getNombre() + " no pudo ser contratado, cupo máximo alcanzado.");
    }
    //?to String
    @Override
    public String toString() {
        return "Universidad{Nombre: " + getNombre() + ", Ciudad: " + getCiudad() + ", Fundacion: " + getFundacion() + "}";
    }

    //?Getters y setters
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
    
    public Departamento[] getDepartamentos() {
        return departamentos;
    }
    
    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajador) {
        this.trabajadores = trabajador;
    }
}
