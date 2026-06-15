package Practicas.practica_05_comparacion_java;

public class Persona {

    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    @Override 
    public boolean equals(Object obj) {

        if(obj == null) {
            return false;
        }        
        if(!(obj instanceof Persona)) {
            Persona otra = (Persona) obj;
            return this.nombre.equals(otra.nombre);
    }
        return false;

}
}