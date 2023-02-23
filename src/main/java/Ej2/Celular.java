package Ej2;

public class Celular implements Cloneable {
    private String modelo, paisCreado;
    private int tamano, peso, imei;
    private Camara camara;

    public Celular (String modelo, int tamano, int peso, Camara camara, int imei, String paisCreado){
        this.modelo = modelo;
        this.tamano = tamano;
        this.peso = peso;
        this.camara = camara;
        this.imei = imei;
        this.paisCreado = paisCreado;

    }
    public String getModelo(){
        return modelo;
    }
    public int getTamano(){
        return tamano;
    }
    public int getPeso(){
        return peso;
    }
    public int getImei(){
        return imei;
    }
    public Camara getCamara() {
        return camara;
    }
    public String getPais(){
        return paisCreado;
    }
    public void setImmei(int imei){
        this.imei = imei;
    }
    public Celular clone() throws CloneNotSupportedException {
        return (Celular) super.clone();
    }
}
