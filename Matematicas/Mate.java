package Matematicas;
import Paquete_almacenamiento.Lista_opciones;
import jdk.jfr.internal.tool.Main;

import java.util.Scanner;

public class Mate {

    public static void programa() {
        //LISTA
        String[] operaciones = {
                "Suma", "Resta",
                "Division", "Multiplicacion"
        };


        //IMPRIMIR LISTA
        for (int i = 0; i < operaciones.length; i++) {
            System.out.printf("[%d] %s", i + 1, operaciones[i]);

            for (int j = 0; j < 14 - operaciones[i].length(); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }
        //IMRPIMIR POR CONSOLA
        Scanner mateBasica = new Scanner(System.in);
        System.out.print("[?]: ");
        int basic = mateBasica.nextInt();

        //IMPRIMIR NUMEROS
        System.out.print("Ingresar numero: ");
        int num1 = mateBasica.nextInt();
        System.out.print("Ingresar numero: ");
        int num2 = mateBasica.nextInt();

        //4 CASOS
        switch (basic) {
            case 1:
                System.out.println("Respuesta: " + SUMA(num1, num2));
                break;

            case 2:
                System.out.println("Respuesta: " + RESTA(num1, num2));
                break;
            case 3:
                System.out.println("Respuesta: " + DIVISION(num1, num2));

            case 4:
                System.out.println("Respuesta: " + MULTIPLICAR(num1, num2));
        }
    }

    public static int SUMA(int num1, int num2) {
        return num1 + num2;
    }

    public static int RESTA(int num1, int num2) {
        return num1 - num2;
    }

    public static int DIVISION(int num1, int num2) {
        return num1 / num2;
    }

    public static int MULTIPLICAR(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return num1 * num2;
    }
}