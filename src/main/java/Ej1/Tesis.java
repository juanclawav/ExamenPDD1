package Ej1;

public class Tesis {
    private String titulo, mencion;
    private Estudiante e;
    public Tesis(String titulo, String mencion, Estudiante e){
        this.titulo = titulo;
        this.mencion=mencion;
        this.e=e;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getMencion(){
        return mencion;
    }
    public Estudiante getEstudiante(){
        return e;
    }
}

