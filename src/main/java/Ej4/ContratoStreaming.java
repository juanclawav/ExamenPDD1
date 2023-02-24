package Ej4;


import java.util.List;

public abstract class ContratoStreaming {
    private double costo;
    private String empresa;
    private List<String> listaCanales;

    public ContratoStreaming(double costo, String empresa, List <String> listaCanales){
        this.costo = costo;
        this.empresa=empresa;
        this.listaCanales = listaCanales;

    }
    public double getCosto(){
        return costo;
    }
}
