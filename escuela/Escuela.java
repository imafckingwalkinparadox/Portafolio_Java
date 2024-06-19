package escuela;

import mis_metodos.MisMetodos;

public class Escuela {
    public static void segundoPrimaria(){
        System.out.println("Segundo de Primaria");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("");

        Estudiantes p1 = new Estudiantes("Jose", "jose@gmail.com", "seccion A", "8", "verdadero");
        Estudiantes p2 = new Estudiantes("Cesar", "cesar@gmail.com", "seccion B", "9", "verdadero");
        Estudiantes p3 = new Estudiantes("Maria", "maria@gmail.com", "seccion A", "8", "verdadero");
        Estudiantes p4 = new Estudiantes("Fernando", "fer@gmail.com", "seccion A", "8", "verdadero");
        Estudiantes p5 = new Estudiantes("Josue", "josue@gmail.com", "seccion B", "8", "verdadero");

        Cursos d1 = new Cursos("Matematicas", "pensamiento cientifico", "2");
        Cursos d2 = new Cursos("Ingles", "Lenguaje", "2");
        Cursos d3 = new Cursos("Artes plasticas", "Artes", "2");
        Cursos d4 = new Cursos("Computacion", "Tecnologia", "2");
        Cursos d5 = new Cursos("Caligrafia", "Aprendizaje", "2");

        //Estudiantes
        System.out.println("Estudiantes");
        System.out.println("--------------------");
        System.out.println(p1.getNombre());
        System.out.println(p1.getCorreo());
        System.out.println("--------------------");
        System.out.println(p2.getNombre());
        System.out.println(p2.getCorreo());
        System.out.println("--------------------");
        System.out.println(p3.getNombre());
        System.out.println(p3.getCorreo());
        System.out.println("--------------------");
        System.out.println(p4.getNombre());
        System.out.println(p4.getCorreo());
        System.out.println("--------------------");
        System.out.println(p5.getNombre());
        System.out.println(p5.getCorreo());
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("");

        //Cursos
        System.out.println("Cursos");
        System.out.println("--------------------");
        System.out.println(d1.getNombre());
        System.out.println(d1.getCategoria());
        System.out.println(d1.getPeriodo());
        System.out.println("--------------------");
        System.out.println(d2.getNombre());
        System.out.println(d2.getCategoria());
        System.out.println(d2.getPeriodo());
        System.out.println("--------------------");
        System.out.println(d3.getNombre());
        System.out.println(d3.getCategoria());
        System.out.println(d3.getPeriodo());
        System.out.println("--------------------");
        System.out.println(d4.getNombre());
        System.out.println(d4.getCategoria());
        System.out.println(d4.getPeriodo());
        System.out.println("--------------------");
        System.out.println(d5.getNombre());
        System.out.println(d5.getCategoria());
        System.out.println(d5.getPeriodo());
    }


}
