// importar del nombrePaquete.nombreClase
import Calculadora_edad.Calculadora_edad;
import Lista.ListaDeCompras;
import Paquete_almacenamiento.Baner;
import Paquete_almacenamiento.Lista_opciones;
import Programas.IMC;
import Matematicas.Mate;
import Farenheit_a_Centigrados.Grados;

import java.time.LocalDate;
import java.util.Scanner;

// importar de nomnreLibreria.NombrePaquete.NombreClase

public class Main {
    //Metodo Main
    public static void main(String[] args) {

        //Lista de Opciones
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Calcular edad",
                "Lista_compras", "Opcion6",
                "Opción7", "Opción_8",
                "Opción_9", "Salir" };

        boolean programa = true;

        do {
            Baner.Banner();
            //NombreClase.Nombre.Metodo
            Lista_opciones.cargarOpciones(listaDeOpciones);

            //Pedir un opcion
            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            System.out.println("------------------------------------");

            //Cargar opcion del usuariO
            switch (opcion) {
                case 1:
                    Mate.programa();
                    break;
                case 2:
                    IMC.ProgramaIMC();
                    break;
                case 3:
                    Grados.grados();
                    break;
                case 4:
                    LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
                    LocalDate fechaActual = LocalDate.now();
                    Calculadora_edad.calcular(fechaNacimiento, fechaActual);
                    programa = false;
                    break;
                case 5:
                    ListaDeCompras.Programa();
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                case 8:
                    System.out.println("Opcion8");
                    break;
                case 9:
                    System.out.println("Opcion9");
                    break;
                case 10:
                    programa = false;
                    break;
            }
        }while (programa);



        //@Scanner: creando un objeto
        //@System: Imprime en consola un mensaje
        //@int: Almacena el valor del scanner(intoOpcion) en formato int(numero entero)
        //@nextInt() convierte la salida de Scanner en un entero()
    }
    }