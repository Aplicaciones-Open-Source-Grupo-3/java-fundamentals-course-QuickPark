import java.util.Scanner;

public class Main {

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + "!");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        saludar(nombre);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = sumar(num1, num2);

        System.out.println("La suma es: " + resultado);
    }
}
