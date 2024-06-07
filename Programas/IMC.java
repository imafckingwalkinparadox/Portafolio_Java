package Programas;

import java.util.Scanner;

public class IMC {
    public static double CalcularIMC(double peso_Dato, double altura_Dato) {

        double resultado = peso_Dato / (altura_Dato * altura_Dato);
        return resultado;
    }

    public static void ProgramaIMC() {

        Scanner entradaDeDato = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = entradaDeDato.nextDouble();
        System.out.print("Altura: ");
        double altura = entradaDeDato.nextDouble();

        //PROCESO
        double IMC = CalcularIMC(peso,altura);

        //RESULTADO
        System.out.print("IMC: " + IMC);

        System.out.println("--------------------------");
        if (IMC < 18.5) {
            System.out.println("---> IMC Bajo");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("---> IMC Normal");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("---> IMC Sobre peso");
        } else if (IMC > 30 && IMC < 34.9) {
            System.out.println("---> IMC Obesidad I");
        } else if (IMC > 35 && IMC < 39.9) {
            System.out.println("---> IMC Obesidad II");
        } else if (IMC > 40 && IMC < 49.9) {
            System.out.println("---> IMC Obesidad III");
        } else if (IMC > 50) {
            System.out.println("---> IMC Obesidad IV");
        }
    }

}

