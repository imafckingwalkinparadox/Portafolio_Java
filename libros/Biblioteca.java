package libros;

public class Biblioteca {
    public static void programa(){
        System.out.println("Biblioteca");

       Libros libro1 = new Libros("Don Quijote de la Mancha", "Miguel de Cervantes", "1605");
       Libros libro2 = new Libros("La Divina Comedia", "Homero", "Siglo VIII");
       Libros libro3 = new Libros("Cien años de soledad", "Gabriel García Márquez", "1967");
       Libros libro4 = new Libros("1984", "George Orwell", "1949");
       Libros libro5 = new Libros("Orgullo y prejuicio", "Jane Austen", "1813");
       Libros libro6 = new Libros("Crimen y castigo", "Fiódor Dostoyevski", "1866");
       Libros libro7 = new Libros("Matar a un ruiseñor", "Harper Lee", "1960");
       Libros libro8 = new Libros("La Odisea", "Homero", "Siglo VIII");
       Libros libro9 = new Libros("El gran Gatsby", " F. Scott Fitzgerald", "1925");
       Libros libro10 = new Libros("En busca del tiempo perdido", "Marcel Proust", "1913");

       //LIBROS
        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());


        //AUTORES
        libro1.setAutor("Hector");
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        System.out.println(libro6.toString());
        System.out.println(libro7.toString());
        System.out.println(libro8.toString());
        System.out.println(libro9.toString());
        System.out.println(libro10.toString());

    }
}
