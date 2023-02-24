package Ej3;

public class Tienda {
    public Producto crearProducto(String tipo){
        switch(tipo){
            case "PelotaFutbol":
                return new PelotaFutbol("5", "Blanco","1 año");
            case "Camiseta":
                return new Camiseta();
            case "Shorts":
                return new Shorts();
            default:
                return null;
        }
    }
}
