package libros;

public class Libros {
    private String titulo;
    private String autor;
    private String fecha;

    public Libros(String titulo, String autor, String fecha) {

        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    //Metodo de tipo set

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        return "titulo: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
    }
}