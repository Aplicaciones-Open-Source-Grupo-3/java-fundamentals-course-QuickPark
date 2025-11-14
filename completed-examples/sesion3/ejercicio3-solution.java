// ESTRUCTURAS DE DECISION
public class Main {
    public static void main(String[] args) {

       int nota=19;
       if(nota>=11){
           System.out.println("Aprobado");
       } else {
           System.out.println("Desaprobado");
       }

        if (nota >= 18) {
            System.out.println("Excelente");
        } else if (nota >= 15) {
            System.out.println("Muy bueno");
        } else if (nota >= 11) {
            System.out.println("Bueno");
        } else {
            System.out.println("Necesita mejorar");
        }

        int opcion = 1;

        switch (opcion) {
            case 1:
                System.out.println("Mostrando información de notas...");
                break;
            case 2:
                System.out.println("Mostrando recomendaciones...");
                break;
            case 3:
                System.out.println("Salir del programa...");
            default:
                System.out.println("Opción inválida");
        }
    }
}
