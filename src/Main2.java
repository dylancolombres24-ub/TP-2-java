public class Main2 {
    public static void main(String[] args) {
        Reloj2 miReloj = new Reloj2();
        miReloj.establecerHora(12, 30, 32);
        miReloj.mostrarHora(); // Muestra: 10:30:45
        miReloj.avanzarSegundo();
        miReloj.mostrarHora(); // Muestra: 10:30:46
    }
}