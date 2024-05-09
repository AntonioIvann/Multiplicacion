import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class MainMultiplicacion { // Declara una clase pública llamada MainMultiplicacion
    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner mu = new Scanner(System.in); // Crea un objeto Scanner llamado mu para leer la entrada del usuario

        System.out.println("Dame el primer valor: "); // Solicita al usuario que ingrese el primer valor
        int n1 = mu.nextInt(); // Lee el primer valor proporcionado por el usuario

        System.out.println("Dame el segundo valor: "); // Solicita al usuario que ingrese el segundo valor
        int n2 = mu.nextInt(); // Lee el segundo valor proporcionado por el usuario

        Multiplicacion m1 = new Multiplicacion(); // Crea un objeto de la clase Multiplicacion llamado m1

        // Asigna los valores proporcionados por el usuario al objeto m1 utilizando métodos setter
        m1.setN1(n1);
        m1.setN2(n2);

        // Llama al método mostrarResultado() de m1 para mostrar el resultado de la multiplicación
        m1.mostrarResultado();

        // Muestra el resultado de la multiplicación utilizando el método mostrarResultado() de m1
        System.out.println("El resultado de la multiplicacion es: " + m1.mostrarResultado());

        // Utiliza el método toString() de m1 para obtener una representación en cadena del objeto y lo muestra
        System.out.println(m1.toString());
    }
}
