package Practicas.practica_04_herencia_e_intefaces.src.Cuentas.derivadas;
import Practicas.practica_04_herencia_e_intefaces.src.Cuentas.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria{

    //atributos
    private double comision;

    //constructor
    public CuentaCorriente(double saldo, String numeroCuenta, double comision) {
        super(saldo, numeroCuenta);
        this.comision = comision;
    }

    //metodos

    public void girarCheque() {

    }

    public void cobrarComision() {
        double monto = getSaldo() * comision;
        retirar(monto);
    }

    //getters and setters
    public double getComision() {return comision;}
    public void setComision(double comision) {this.comision = comision;}

}
