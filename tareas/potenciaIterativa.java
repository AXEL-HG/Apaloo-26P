package tareas;

public class potenciaIterativa {

    public static long calcularPotencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser mayor o igual a cero.");
        }

        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;

        try {
            long resultado = calcularPotencia(base, exponente);
            System.out.println("Iterativo -> " + base + "^" + exponente + " = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}