import java.util.Scanner;

public class MainMultiplicacion {
    public static void main(String[] args) {
        Scanner m1 = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = m1.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = m1.nextInt();
        Multiplicacion m2 = new Multiplicacion();
        m2.n1 = n1;
        m2.n2 = n2;
        System.out.println("El resultado es: " + m2.mostrarResultado());

    }
}