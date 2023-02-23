package Ej1;

public class Estudiante {
    private String nombre;
    private int ci;
    public Estudiante(String nombre, int ci){
        this.nombre=nombre;
        this.ci=ci;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCi(){
        return ci;
    }
}
