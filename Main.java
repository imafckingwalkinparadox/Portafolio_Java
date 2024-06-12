// importar del nombrePaquete.nombreClase
import calculadora.Calculadora_edad;
import Lista.ListaDeCompras;
import Paquete_almacenamiento.Banner;
import conversor.Longitudes;
import mis_metodos.Lista_opciones;
import Programas.IMC;
import calculadora.Mate;
import conversor.Grados;
import conversor.conversor_moneda;
import mis_metodos.MisMetodos;

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
                "Conversor_Monedas", "Opción_8",
                "Opción_9", "Salir" };

        boolean programa = true;

        do {
            MisMetodos.limpiarConsola();
            Banner.Banner();
            MisMetodos.imprimirLinea();

            //NombreClase.Nombre.Metodo
            Lista_opciones.cargarOpciones(listaDeOpciones);

            //Pedir un opcion
            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();

            MisMetodos.limpiarConsola();

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
                    conversor_moneda.conversor();
                case 8:
                    Longitudes.cargarOperaciones();
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