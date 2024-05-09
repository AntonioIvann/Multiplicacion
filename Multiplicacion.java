public class Multiplicacion { // Define una clase pública llamada Multiplicacion
    private int n1, n2, res; // Declara tres variables de tipo entero: n1, n2 y res

    // Método para realizar la multiplicación y devolver el resultado
    public int mostrarResultado() {
        res = n1 * n2; // Realiza la multiplicación y asigna el resultado a la variable res
        return res; // Devuelve el resultado de la multiplicación
    }

    // Métodos getter y setter para la variable n1
    public int getN1() {
        return n1; // Devuelve el valor de n1
    }

    public void setN1(int n1) {
        this.n1 = n1; // Establece el valor de n1 con el valor proporcionado
    }

    // Métodos getter y setter para la variable n2
    public int getN2() {
        return n2; // Devuelve el valor de n2
    }

    public void setN2(int n2) {
        this.n2 = n2; // Establece el valor de n2 con el valor proporcionado
    }

    // Métodos getter y setter para la variable res
    public int getRes() {
        return res; // Devuelve el resultado de la multiplicación
    }

    public void setRes(int res) {
        this.res = res; // Establece el resultado de la multiplicación con el valor proporcionado
    }

    // Método toString para representar el objeto en forma de cadena de texto
    @Override
    public String toString() {
        return "Multiplicacion [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]"; // Devuelve una cadena que representa el objeto
    }
}
