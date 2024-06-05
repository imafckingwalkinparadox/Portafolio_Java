package Lista;

import Paquete_almacenamiento.Lista_opciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

    public static String[] opcion7= {"Lista de Compras", "Salir"};


    public static void Programa (){
        Lista_opciones.cargarOpciones(opcion7);

        Scanner scanner = new Scanner(System.in);
        System.out.print("[?]: ");
        int respuesta = scanner.nextInt();

        switch (respuesta) {
            case 1:
                crearLista();
                break;

            case 2:
                System.out.print("Salir");
                break;
        }
    }

    public static void crearLista() {
        List<String> ListaNombre = new ArrayList<>();
        List<Double> ListaPrecio = new ArrayList<>();
        System.out.print(ListaNombre);

        String rp;
        double rpc;

        for ( int i = 0; i <= 2; i++) {
        Scanner item = new Scanner(System.in);

        System.out.print("Producto: ");
        rp = item.nextLine();
        System.out.print("Precio: ");
        rpc = item.nextDouble();

            //Lista Vacia
            ListaNombre.add(rp);
            ListaPrecio.add(rpc);
        }

        //Mostar Lista
        System.out.println(ListaNombre + "--" + ListaPrecio);
    }
}
