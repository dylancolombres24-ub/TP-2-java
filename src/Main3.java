public class Main3 {
    public Main3() {
    }

    public static void main(String[] args) {
        CuentaBancaria3 miCuenta = new CuentaBancaria3("12345", "Miguel Angel", (double)2085);
        miCuenta.depositar((double)200);
        miCuenta.retirar((double)2000);
        double saldoActual = miCuenta.consultarSaldo();
        System.out.println("Saldo actual: " + saldoActual);
        miCuenta.retirar((double)3000);
    }
}
