import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura en °C: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");

        sc.close();
    }
}
