package Practicas.practica_04_herencia_e_intefaces.src.Cuentas;

public class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;

    //constructor
    public CuentaBancaria(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public void retirar(double monto) { saldo -= monto;}
    public void depositar(double monto) { saldo += monto;}

    public double ConsultarSaldo() { return saldo;}
    public String ConsultarNumero() { return numeroCuenta;}

    //getters and setters
    public String getNumeroCuenta() { return numeroCuenta;}
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta;}

    public double getSaldo() { return saldo;}
    public void setSaldo(double saldo) { this.saldo = saldo;}
}
