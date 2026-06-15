package Practicas.practica_05_comparacion_java;

public class App {

    public static void main(String[] args) {

        String nombre1 = "Ana";
        String nombre2 = "Ana";

        if (nombre1.equals(nombre2)) {
            System.out.println("Los nombres son iguales");
        }

        String nombre3 = null;

        if (nombre3.equals("Ana")) {
            System.out.println("Es Ana");
        }

        if ("Ana".equals(nombre1)) {
            System.out.println("El nombre es Ana");
        }
    }

        public class Persona {

            String nombre;
        
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
}
