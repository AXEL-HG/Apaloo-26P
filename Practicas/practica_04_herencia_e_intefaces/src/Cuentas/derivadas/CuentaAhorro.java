package Practicas.practica_04_herencia_e_intefaces.src.Cuentas.derivadas;
import Practicas.practica_04_herencia_e_intefaces.src.Cuentas.CuentaBancaria;

public class CuentaAhorro extends CuentaBancaria{

    //atributos
    private double montoLimite;

    //constructor
    public CuentaAhorro(double saldo, String numeroCuenta, double montoLimite) {
        super(saldo, numeroCuenta);
        this.montoLimite = montoLimite;
    }

    //metodos

    public double calcularIntereses(){
        return getSaldo()*0.05;
    }

    //getters and setters
    public double getMontoLimite() {return montoLimite;}
    public void setMontoLimite(double montoLimite) {this.montoLimite = montoLimite;}

}
