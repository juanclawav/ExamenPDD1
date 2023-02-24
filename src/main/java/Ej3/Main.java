package Ej3;

public class Main {
    public static void main (String[]args){
        Tienda tienda = new Tienda();

        PelotaFutbol pelota = (PelotaFutbol) tienda.crearProducto("PelotaFutbol)");
        pelota.calcularPrecio();

        Camiseta camiseta = (Camiseta) tienda.crearProducto("Camiseta)");
        camiseta.calcularPrecio();
    }
}
