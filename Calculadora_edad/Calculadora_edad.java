package Calculadora_edad;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calculadora_edad {
    public static void calcular(LocalDate fechaNacimiento, LocalDate fechaActual) {

        // Calcula el período entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        // Obtiene la diferencia de años del período
        int edad = periodo.getYears();

        // Ajusta la edad si la fecha de nacimiento es posterior a la fecha actual en este año
        if (fechaNacimiento.getMonthValue() > fechaActual.getMonthValue() ||
                (fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() &&
                        fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth())) {
            edad--;
        }

        // Imprime la fecha de nacimiento, la fecha actual y la edad
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Edad: " + edad);
    }

}
