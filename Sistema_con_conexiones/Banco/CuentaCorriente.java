package Sistema_con_conexiones.Banco;

public class CuentaCorriente extends CuentaBancaria{

    //? Constructor
    public CuentaCorriente(double saldo, String numeroCuenta) {
        super(saldo, numeroCuenta);
    }
    
    public void girarCheque(double monto) {
        if (monto > 0 && monto <= consultarSaldo()) {
            retirar(monto);
            System.out.println("Se ha girado un cheque por: " + monto + " de la cuenta: " + obtenerNumero());
        } else {
            System.out.println("Error: el monto a girar debe ser mayor a cero y menor o igual al saldo disponible");
        }
    }

    public void cobrarComision() {
        double comision = consultarSaldo() * 0.01;
        if (comision <= consultarSaldo()) {
            retirar(comision);
            System.out.println("Se ha cobrado una comisión de: " + comision + " de la cuenta: " + obtenerNumero());
        } else {
            System.out.println("Error: no hay suficiente saldo para cobrar la comisión");
        }
    }

}
