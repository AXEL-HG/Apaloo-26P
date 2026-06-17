package Sistema_con_conexiones.Banco;

public class CuentaAhorro extends CuentaBancaria {

    //?Atributos
    private double montoLimite;

    //?Constructor
    public CuentaAhorro(double saldo, String numeroCuenta, double montoLimite) {
        super(saldo, numeroCuenta);
        this.montoLimite = montoLimite;
    }

    //?Metodos
    public double calcularInteres() {
        double interes = consultarSaldo() * 0.02;
        if (interes <= montoLimite) {
            depositar(interes);
            System.out.println("Se ha calculado un interés de: " + interes + " a la cuenta: " + obtenerNumero());
        } else {
            System.out.println("Error: el interés calculado supera el monto límite de la cuenta");
        }
        return interes;
    }

    //?to String
    @Override
    public String toString() {
        return "CuentaAhorro{Monto Limite: " + getMontoLimite() + super.toString() + "}";
    }
    
    //?Getters y setters
    public double getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(double montoLimite) {
        this.montoLimite = montoLimite;
    }

}