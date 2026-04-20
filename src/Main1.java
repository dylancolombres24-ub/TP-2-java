public class Main1 {
    public static void main(String[] args) {


        Calculadora1 calculadora = new Calculadora1(9, 5);
        int suma = calculadora.sumar();
        System.out.println("La suma es:" + suma);
        System.out.println("la resta es:"+ calculadora.restar());
        System.out.println("la multiplicacion es:"+ calculadora.multiplicar());
        System.out.println("la division es:"+ calculadora.dividir());

    }
}
