package Sistema_con_conexiones.Banco;

public class CuentaBancaria implements Transaccionable{
    
    //?Atributos
    private double saldo;
    private String numeroCuenta;

    //?Constructor
    public CuentaBancaria(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    //?Metodos

    public double consultarSaldo() {
        return saldo;
    }

    public String obtenerNumero() {
        return numeroCuenta;
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se ha depositado: " + monto + " a la cuenta: " + numeroCuenta);
        } else {
            System.out.println("Error: el monto a depositar debe ser mayor a cero");
        }

    }
    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Se ha retirado: " + monto + " de la cuenta: " + numeroCuenta);
        } else {
            System.out.println("Error: el monto a retirar debe ser mayor a cero y menor o igual al saldo disponible");
        }

    }

    //? To String
    @Override
    public String toString() {
        return "CuentaBancaria{Numero de Cuenta: " + obtenerNumero() + ", Saldo Actual: $" + consultarSaldo() + "}";
    }

    //?Getters y settes
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

}
