public class Main2 {
    public static void main(String[] args) {
        Reloj2 miReloj = new Reloj2();
        miReloj.establecerHora(12, 30, 32);
        miReloj.mostrarHora();
        miReloj.avanzarSegundo();
        miReloj.mostrarHora();
    }
}