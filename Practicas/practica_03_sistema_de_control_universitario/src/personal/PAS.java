package personal;
import java.time.LocalDate;
import java.util.List;

public class PAS extends Trabajador {

    private String area;
    private int nivel;
    private String turno;
    
    public PAS(String nombre, String direccion, LocalDate fechaNacimiento, String puesto, double salario, LocalDate fechaIngreso, String area, int nivel, String turno) {
        super(nombre, direccion, fechaNacimiento, puesto, salario, fechaIngreso);
        this.area = area;
        this.nivel = nivel;
        this.turno = turno;
    }

    //Metodos

    public void administrarRecursos(List<PAS> listaPersonal) {
        System.out.println("Personal que pertenece al área de " + this.area + ":");
        for (PAS empleado : listaPersonal) {
            if (empleado.getArea().equals(this.area)) {
                System.out.println("- " + empleado.getNombre());
            }
        }
    }

    public void generarReporte(List<Trabajador> listaTodoElPersonal) {
        System.out.println("=== REPORTE GENERAL DE PERSONAL ===");
        for (Trabajador t : listaTodoElPersonal) {
            System.out.println("Nombre: " + t.getNombre() + " | Puesto: " + t.getPuesto() + " | Salario: $" + t.getSalario());
        }
    }

    //Getters y setters

    public String getArea() { return area;}
    public void setArea(String area) { this.area = area;}

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel;}

    public String getTurno() { return turno; }
    public void setTurno(String turno) {this.turno = turno;}

    

}
