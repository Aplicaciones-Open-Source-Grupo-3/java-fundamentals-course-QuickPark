import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tres números (separados por enter): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double suma = a + b + c;
        double promedio = suma / 3.0;

        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + promedio);

        sc.close();
    }
}
