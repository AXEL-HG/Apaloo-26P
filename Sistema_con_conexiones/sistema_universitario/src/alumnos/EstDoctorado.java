package Sistema_con_conexiones.sistema_universitario.src.alumnos;
import java.time.LocalDate;

public class EstDoctorado extends Estudiante{

    //?Atributos
    private String directorTesis;
    private String programa;
    private String temaTesis;
    
    //?Constructor
    public EstDoctorado(String matricula, double promedio, LocalDate fechaIngreso, String nombre, String direccion, LocalDate fechaNacimiento, String programa, String temaTesis, String directorTesis) {
        super(matricula, promedio, fechaIngreso, nombre, direccion, fechaNacimiento);
        this.programa = programa;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
    }

    //?Metodos

    public void publicarArticulo() {

        System.out.println("El estudiante: " + getNombre() + "ha publicado el tema de un articulo: " + getTemaTesis() + " del programa: " + getPrograma());

    }

    public void realizarTesis() {
        System.out.println("El estudiante: " + getNombre() + " esta realizando su tesis con el tema: " + getTemaTesis() + " Con el director asignado: " + getDirectorTesis());
    }

    //?Getters y setters
    public String getDirectorTesis() {
        return directorTesis;
    }

    public void setDirectorTesis(String directorTesis) {
        this.directorTesis = directorTesis;
    }

    public String getTemaTesis() {
        return temaTesis;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
