public class CuentaBancaria3 {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria3(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > (double)0.0F) {
            this.saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }

    }

    public void retirar(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else if (cantidad <= (double)0.0F) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else {
            this.saldo -= cantidad;
        }

    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public String getTitular() {
        return this.titular;
    }
}
