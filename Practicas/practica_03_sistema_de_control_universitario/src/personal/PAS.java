package personal;
import java.time.LocalDate;
import java.util.List;

public class PAS extends Trabajador {

    private String area;
    private int nivel;
    private String turno;

    private Trabajador[] personalGeneral;
    private int totalPersonal;

    public PAS(String nombre, String direccion, LocalDate fechaNacimiento, String puesto, double salario,
               LocalDate fechaIngreso, String area, int nivel, String turno) {
        super(nombre, direccion, fechaNacimiento, puesto, salario, fechaIngreso);
        this.area = area;
        this.nivel = nivel;
        this.turno = turno;
        this.personalGeneral = new Trabajador[50];
        this.totalPersonal = 0;
    }

    public void administrarRecursos() {
        System.out.println("Personal que pertenece al área '" + this.area + "':");
        boolean hayAlguien = false;
        for (int i = 0; i < totalPersonal; i++) {
            if (personalGeneral[i] instanceof PAS) {
                PAS p = (PAS) personalGeneral[i];
                if (p.getArea().equals(this.area)) {
                    System.out.println("  - " + p.getNombre());
                    hayAlguien = true;
                }
            }
        }
        if (!hayAlguien) System.out.println("  (Sin personal registrado en esta área)");
    }

    /**
     * Muestra un listado de todo el personal registrado.
     */
    public void generarReporte() {
        System.out.println("=== REPORTE GENERAL DE PERSONAL ===");
        if (totalPersonal == 0) { System.out.println("Sin personal registrado."); return; }
        for (int i = 0; i < totalPersonal; i++) {
            Trabajador t = personalGeneral[i];
            System.out.println("  Nombre: " + t.getNombre() + " | Puesto: " + t.getPuesto() + " | Salario: $" + t.getSalario());
        }
    }

    public void agregarPersonal(Trabajador t) {
        if (totalPersonal < personalGeneral.length) {
            personalGeneral[totalPersonal++] = t;
        }
    }

    @Override
    public String toString() {
        return "PAS{nombre='" + getNombre() + "', area='" + area + "', nivel=" + nivel + ", turno='" + turno + "'}";
    }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public void administrarRecursos(List<Trabajador> asList) {
        if (asList == null || asList.isEmpty()) {
            System.out.println("No hay trabajadores en la lista proporcionada.");
            return;
        }
        for (Trabajador t : asList) {
            agregarPersonal(t);
        }
        System.out.println("Recursos administrados. Total personal registrado: " + totalPersonal);
    }

    public void administrarRecursos(PAS[] listaPas, int i) {
        if (listaPas == null || listaPas.length == 0) return;
        int limit = Math.min(listaPas.length, i);
        for (int idx = 0; idx < limit; idx++) {
            agregarPersonal(listaPas[idx]);
        }
    }
}
