public class Empleado5 {
    private static int contadorEmpleados = 0;
    private static int siguienteLegajo = 1;

    private int legajo;
    private String nombre;
    private double salario;
    private String motivoUltimoAumento;

    public Empleado5(String nombre, double salario) {
        this.legajo = siguienteLegajo++;
        this.nombre = nombre;
        this.salario = salario;
        this.motivoUltimoAumento = "Ninguno";
        contadorEmpleados++;
    }
    public void aumentarSalarioPorcentaje(double porcentaje, String motivo) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
            motivoUltimoAumento = motivo;
        } else {
            System.out.println("El porcentaje debe ser mayor que cero.");
        }
    }
    public void aumentarSalarioMonto(double monto, String motivo) {
        if (monto > 0) {
            salario += monto;
            motivoUltimoAumento = motivo;
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }
    public static int obtenerCantidadEmpleados() {
        return contadorEmpleados;
    }
    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Último aumento: " + motivoUltimoAumento);
        System.out.println();
    }
    public int getLegajo() {
        return legajo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
}
