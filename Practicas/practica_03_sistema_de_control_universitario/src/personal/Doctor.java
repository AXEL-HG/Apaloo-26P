package personal;
public class Doctor {

    private String especialidad;
    private String universidad;
    private int anioObtencion;

    public Doctor(String especialidad, String universidad, int anioObtencion) {
        this.especialidad = especialidad;
        this.universidad = universidad;
        this.anioObtencion = anioObtencion;
    }


    public boolean validarTitulo() {
        boolean valido = universidad != null && !universidad.isBlank() && anioObtencion > 1900;
        if (valido) {
            System.out.println("El título de doctor en '" + especialidad + "' obtenido en " +
                               universidad + " (" + anioObtencion + ") es válido.");
        } else {
            System.out.println("Los datos del título doctoral no son válidos.");
        }
        return valido;
    }


    public void registrarTitulo() {
        if (validarTitulo()) {
            System.out.println("Título doctoral registrado: " + especialidad +
                               " — " + universidad + " (" + anioObtencion + ")");
        } else {
            System.out.println("No se puede registrar: los datos del título son inválidos.");
        }
    }

    @Override
    public String toString() {
        return "Doctor{especialidad='" + especialidad + "', universidad='" + universidad +
               "', anioObtencion=" + anioObtencion + "}";
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getUniversidad() { return universidad; }
    public void setUniversidad(String universidad) { this.universidad = universidad; }

    public int getAnioObtencion() { return anioObtencion; }
    public void setAnioObtencion(int anioObtencion) { this.anioObtencion = anioObtencion; }
}
