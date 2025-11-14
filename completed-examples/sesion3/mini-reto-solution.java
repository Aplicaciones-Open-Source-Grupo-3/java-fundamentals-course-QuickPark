// MINI RETO
// Pon a prueba tus conocimientos

// PASO 1: Crea la clase y declara las notas

    public class Main {
        public static void main(String[] args) {
            int n1 = 15;
            int n2 = 12;
            int n3 = 18;
    
    
//  PASO 2: Calcular el promedio

    int promedio = (n1 + n2 + n3) / 3;
    System.out.println("Tu promedio es: " + promedio);
    

//PASO 3: Usa if para ver si está aprobado / desaprobado

    if (promedio >= 11) {
        System.out.println("✔ Aprobado");
    } else {
        System.out.println("✘ Desaprobado");
    }


//PASO 4: Usa ELSE IF para mostrar la categoría

   if (promedio >= 18) {
        System.out.println("Categoría: Excelente");
    } else if (promedio >= 15) {
        System.out.println("Categoría: Muy bueno");
    } else if (promedio >= 11) {
        System.out.println("Categoría: Bueno");
    } else {
        System.out.println("Categoría: Necesita mejorar");
    }


//PASO 5: Usa FOR para mostrar las notas registradas

    System.out.println("\nNotas registradas:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Nota " + i + " registrada");
        }

  }
}



