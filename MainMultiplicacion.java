import java.util.Scanner;

public class MainMultiplicacion {
    public static void main(String[] args) {
        Scanner mu = new Scanner(System.in);
        System.out.println("Dame el primer valor: ");
        int n1 = mu.nextInt();
        System.out.println("Dame el segundo valor: ");
        int n2 = mu.nextInt();

        Multiplicacion m1 = new Multiplicacion();
        m1.setN1(n1);
        m1.setN2(n2);
        m1.mostrarResultado();
        System.out.println("El resultado de la multiplicacion es: " + m1.mostrarResultado());
        System.out.println(m1.toString());
    }
}
