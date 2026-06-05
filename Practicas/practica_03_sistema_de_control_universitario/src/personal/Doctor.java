package personal;

public class Doctor {

    private String universidad;
    private String codigo;
    private int anioObtencion;

    public Doctor(String universidad, String codigo, int anioObtencion) {
        this.universidad = universidad;
        this.codigo = codigo;
        this.anioObtencion = anioObtencion;
    }

    //metods

    public boolean validarTitulo() {
        return true;
    }

    public void registrarTitulo() {
        System.out.println("El titulo ha sido registrado");
    }

    //getters and setters
    public String getUniversidad() { return universidad;}
    public void setUniversidad(String universidad) { this.universidad = universidad;} 

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {this.codigo = codigo; }

    public int getaAnioObtencion() {return anioObtencion;}
    public void setAnioObtencion(int anioObtencion) {this.anioObtencion = anioObtencion;}

}