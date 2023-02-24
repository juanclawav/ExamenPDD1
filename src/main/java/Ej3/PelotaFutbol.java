package Ej3;

public class PelotaFutbol implements Producto{
    private String tamano, color, garantia;
    public PelotaFutbol(String tamano, String color, String garantia){
        this.tamano=tamano;
        this.color=color;
        this.garantia=garantia;
    }
    @Override
    public void calcularPrecio(){
        System.out.println("Precio calculado de pelota de futbol");
    }
}
