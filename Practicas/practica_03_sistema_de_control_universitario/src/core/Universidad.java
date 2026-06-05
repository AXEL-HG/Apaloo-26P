package core;
import academia.Departamento;
import alumnos.Estudiante;
import personal.Trabajador;

public class Universidad {

    private String nombre;
    private String ciudad;
    private int fundacion;

    private Estudiante[] estudiantes;
    private Trabajador[] trabajadores;
    private Departamento[] departamentos;

    private int totalEstudiantes;
    private int totalTrabajadores;
    private int totalDepartamentos;

    public Universidad(String nombre, String ciudad, int fundacion,
                       int maxEstudiantes, int maxTrabajadores, int maxDepartamentos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estudiantes = new Estudiante[maxEstudiantes];
        this.trabajadores = new Trabajador[maxTrabajadores];
        this.departamentos = new Departamento[maxDepartamentos];
        this.totalEstudiantes = 0;
        this.totalTrabajadores = 0;
        this.totalDepartamentos = 0;
    }

    public void registrarEstudiante(Estudiante e) {
        if (totalEstudiantes < estudiantes.length) {
            estudiantes[totalEstudiantes++] = e;
            System.out.println("Estudiante registrado: " + e.getNombre());
        } else {
            System.out.println("No hay cupo para más estudiantes.");
        }
    }

    public void contratarTrabajador(Trabajador t) {
        if (totalTrabajadores < trabajadores.length) {
            trabajadores[totalTrabajadores++] = t;
            System.out.println("Trabajador contratado: " + t.getNombre());
        } else {
            System.out.println("No hay plazas disponibles.");
        }
    }

    public void agregarDepartamento(Departamento d) {
        if (totalDepartamentos < departamentos.length) {
            departamentos[totalDepartamentos++] = d;
            System.out.println("Departamento agregado: " + d.getNombre());
        } else {
            System.out.println("No se pueden agregar más departamentos.");
        }
    }

    @Override
    public String toString() {
        return "Universidad{nombre='" + nombre + "', ciudad='" + ciudad +
               "', fundacion=" + fundacion + ", estudiantes=" + totalEstudiantes +
               ", trabajadores=" + totalTrabajadores + ", departamentos=" + totalDepartamentos + "}";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public int getFundacion() { return fundacion; }
    public void setFundacion(int fundacion) { this.fundacion = fundacion; }

    public int getTotalEstudiantes() { return totalEstudiantes; }
    public int getTotalTrabajadores() { return totalTrabajadores; }
    public int getTotalDepartamentos() { return totalDepartamentos; }

    public void registrarDepartamento(Departamento deptoSistemas) {
        // delegate to agregarDepartamento which implements the add logic
        agregarDepartamento(deptoSistemas);
    }

}
