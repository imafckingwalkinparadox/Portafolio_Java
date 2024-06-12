package conversor;

import java.util.Scanner;

public class Grados {
    public static void grados(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertidor de Temperatura");
        System.out.println("Opciones:");
        System.out.println("1. Fahrenheit a Celsius");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Temperatura en Celsius es: " + celsius);
        } else if (opcion == 2) {
            System.out.print("Temperatura en Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura en Fahrenheit es: " + fahrenheit);
        } else {
            System.out.println("Opción no válida. 1 o 2");
        }

        scanner.close();
}
}


