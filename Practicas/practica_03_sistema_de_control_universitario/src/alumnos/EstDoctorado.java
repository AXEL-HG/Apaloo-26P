package alumnos;

import java.time.LocalDate;

public class EstDoctorado extends Estudiante {

    private String programa;
    private String temaTesis;
    private String directorTesis;
    
    
    public EstDoctorado(String nombre, String direccion, LocalDate fechaNacimiento, String matricula, double promedio,
            LocalDate fechaIngreso, String progrma, String TemaTesis, String DirectorTesis) {
        super(nombre, direccion, fechaNacimiento, matricula, promedio, fechaIngreso);
    }

    public void realizarTesis() {
        System.out.println("El estudiante a estado trabajando en la tesis del tema" + getTemaTesis() + " Con el director de tesis asignado" + directorTesis );
    }

    public void publicarArticulo() {
        System.out.println("El estudiante a enviado su investigacion con el tema de:" + getTemaTesis() + " y el programa: " + getPrograma() );
    }


    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    public String getTemaTesis() { return temaTesis; }
    public void setTemaTeis(String temaTesis) { this.temaTesis = temaTesis; }

    public String getDirectorTesis() { return directorTesis; }
    public void setDirectorTesis(String directorTesis) { this.directorTesis = directorTesis; }

}