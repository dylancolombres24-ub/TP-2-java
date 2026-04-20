public class Main5 {
    public static void main(String[] args) {
        Empleado5 emp1 = new Empleado5("Tomas Ferreyra", 5000000);
        Empleado5 emp2 = new Empleado5("Dylan Clombres", 6000000);

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        emp1.aumentarSalarioPorcentaje(10, "Aumento anual");
        emp2.aumentarSalarioMonto(500000, "Bono de desempeño");

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        System.out.println("Cantidad total de empleados: " + Empleado5.obtenerCantidadEmpleados());
    }
}
