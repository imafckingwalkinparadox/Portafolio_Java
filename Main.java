// importar del nombrePaquete.nombreClase
import calculadora.Calculadora_edad;
import Lista.ListaDeCompras;
import Paquete_almacenamiento.Banner;
import conversor.Longitudes;
import escuela.Escuela;
import libros.Biblioteca;
import mis_metodos.Lista_opciones;
import Programas.IMC;
import calculadora.Mate;
import conversor.Grados;
import conversor.conversor_moneda;
import mis_metodos.MisMetodos;

import javax.swing.*;
import java.awt.*;
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
                "Lista_compras", "Longitudes",
                "Conversor_Monedas", "Biblioteca",
                "Escuela", "Salir" };

        JFrame ventana = new JFrame("Ejercicio");
        ventana.setSize(500,500);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0,0,500,150);
        panel_1.setBackground(Color.BLACK);

        JLabel name_profe_favorito = new JLabel("Rockemita");
        name_profe_favorito.setForeground(Color.WHITE);
        name_profe_favorito.setBounds(200,0,100,100);

        panel_1.add(name_profe_favorito);
        panel_1.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0,150,500,150);
        panel_2.setBackground(Color.WHITE);

        JLabel texto1 = new JLabel("[1]___");
        texto1.setBounds(100,-20,500,200);
        texto1.setForeground(Color.BLACK);

        JLabel texto2 = new JLabel("[2]___");
        texto2.setBounds(150,-20,500,200);
        texto2.setForeground(Color.BLACK);

        JLabel texto3 = new JLabel("[3]___");
        texto3.setBounds(200,-20,500,200);
        texto3.setForeground(Color.BLACK);

        JLabel texto4 = new JLabel("[4]___");
        texto4.setBounds(250,-20,500,200);
        texto4.setForeground(Color.BLACK);

        JLabel texto5 = new JLabel("[5]___");
        texto5.setBounds(300,-20,500,200);
        texto5.setForeground(Color.BLACK);

        panel_2.add(texto1);
        panel_2.add(texto2);
        panel_2.add(texto3);
        panel_2.add(texto4);
        panel_2.add(texto5);
        panel_2.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(0,300,500,165);
        panel_3.setBackground(Color.BLACK);

        JButton bttn = new JButton();
        bttn.setBounds(400,100,70,40);
        bttn.setBackground(Color.WHITE);

        panel_3.add(bttn);
        panel_3.setLayout(null);
        
        ventana.add(panel_1);
        ventana.add(panel_2);
        ventana.add(panel_3);
        ventana.setLayout(null);
        ventana.setVisible(true);


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
                    Longitudes.cargarOperaciones();
                    break;
                case 7:
                    conversor_moneda.conversor();
                case 8:
                    Biblioteca.programa();
                    break;
                case 9:
                    Escuela.segundoPrimaria();
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