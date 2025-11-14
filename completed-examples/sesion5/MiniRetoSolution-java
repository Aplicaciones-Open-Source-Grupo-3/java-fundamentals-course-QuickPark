// Definimos la clase Producto
class Producto {

    // PASO 2: Atributos privados (encapsulados)
    private String nombre;   // Nombre del producto
    private double precioPorKilo; // Precio por kilo del producto

    // PASO 3: Constructor para inicializar ambos atributos
    public Producto(String nombre, double precioPorKilo) {
        this.nombre = nombre;             // Asignamos el nombre
        this.precioPorKilo = precioPorKilo; // Asignamos el precio
    }

    // PASO 4: Método mostrarInfo() que imprime los datos del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio por kilo: S/ " + precioPorKilo);
        System.out.println("-------------------------------");
    }
}

// Clase principal donde se ejecuta el programa
public class Main {

    public static void main(String[] args) {

        // PASO 5: Crear dos objetos de Producto con datos diferentes
        Producto p1 = new Producto("Naranja", 4.50);
        Producto p2 = new Producto("Papa Blanca", 2.80);

        // Llamamos al método mostrarInfo() para cada producto
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
