package Ej2;

public class Camara {
    private int foco, lente;

    public Camara(int foco, int lente){
        this.foco = foco;
        this.lente=lente;
    }
    public int getFoco(){
        return foco;
    }
    public int getLente(){
        return lente;
    }
}
