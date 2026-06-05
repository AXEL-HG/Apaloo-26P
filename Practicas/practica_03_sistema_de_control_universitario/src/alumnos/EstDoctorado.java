package alumnos;
import java.time.LocalDate;

public class EstDoctorado extends Estudiante {

    private String programa;
    private String temaTesis;
    private String directorTesis;

    public EstDoctorado(String nombre, String direccion, LocalDate fechaNacimiento, String matricula, double promedio,
                        LocalDate fechaIngreso, String programa, String temaTesis, String directorTesis) {
        super(nombre, direccion, fechaNacimiento, matricula, promedio, fechaIngreso);
        this.programa = programa;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
    }


    public void realizarTesis() {
        System.out.println("El doctorando " + getNombre() + " continúa trabajando en su investigación doctoral.");
        System.out.println("  Tema de tesis: " + temaTesis);
        System.out.println("  Director asignado: " + directorTesis);
    }

    /**
     * Simula la publicación de un artículo usando programa y temaTesis.
     */
    public void publicarArticulo() {
        System.out.println("El doctorando " + getNombre() + " ha enviado un artículo científico.");
        System.out.println("  Programa: " + programa);
        System.out.println("  Relacionado con: " + temaTesis);
    }

    @Override
    public String toString() {
        return "EstDoctorado{nombre='" + getNombre() + "', programa='" + programa +
               "', temaTesis='" + temaTesis + "', directorTesis='" + directorTesis + "'}";
    }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    public String getTemaTesis() { return temaTesis; }
    public void setTemaTesis(String temaTesis) { this.temaTesis = temaTesis; }

    public String getDirectorTesis() { return directorTesis; }
    public void setDirectorTesis(String directorTesis) { this.directorTesis = directorTesis; }
}
