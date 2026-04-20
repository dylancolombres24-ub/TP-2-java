public class Main4 {
    public static void main(String[] args) {
        Libro4 miLibro = new Libro4("Los Alterados", "Colombres Dylan", "9789871997381");

        miLibro.mostrarInformacion();

        miLibro.prestar();
        miLibro.mostrarInformacion();

        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}
