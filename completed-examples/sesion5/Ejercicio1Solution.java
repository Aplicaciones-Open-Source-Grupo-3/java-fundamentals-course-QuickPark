// Definimos la clase Producto
class Producto {

    // Atributos privados (encapsulación)
    private String nombre;   // Nombre del producto
    private double precio;   // Precio del producto

    // Constructor para inicializar los atributos
    public Producto(String n, double p) {
        nombre = n;   // Asignación del nombre recibido
        precio = p;   // Asignación del precio recibido
    }

    // Método para mostrar información del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: S/ " + precio);
        System.out.println("--------------------------");
    }
}

// Clase principal donde se ejecuta el programa
public class Main {

    public static void main(String[] args) {

        // Crear el primer objeto Producto
        Producto prod1 = new Producto("Laptop Lenovo", 2500.50);

        // Crear el segundo objeto Producto
        Producto prod2 = new Producto("Mouse Gamer", 79.90);

        // Mostrar la información de ambos productos
        prod1.mostrarInfo();
        prod2.mostrarInfo();
    }
}

