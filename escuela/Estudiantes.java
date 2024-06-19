package escuela;

public class Estudiantes {
    private String nombre ;
    private String correo;
    private String carrera;
    private String edad;
    private String solvencia;

    Estudiantes(String nombre, String correo, String carrera, String edad, String solvencia){
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;

    }

    //Metodo Get


    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
