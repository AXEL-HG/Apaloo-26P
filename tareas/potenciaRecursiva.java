package tareas;

public class potenciaRecursiva {

    public static long calcularPotencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser mayor o igual a cero.");
        }

        if (exponente == 0) {
            return 1;
        }

        return base * calcularPotencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 3;
        int exponente = 4;

        try {
            long resultado = calcularPotencia(base, exponente);
            System.out.println("Recursivo -> " + base + "^" + exponente + " = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}