package Ej2;

public class Main {
    public static void main(String [] args){
        Celular c1 = new Celular("A1", 10, 60, new Camara(10,5),1001,"Bolivia");
        Celular c2 = null;
        Celular c3 = null;
        Celular c4 = null;
        Celular c5 = null;
        try{
            c2 = c1.clone();
            c2.setImei(1002);
            c3 = c1.clone();
            c3.setImei(1003);
            c4 = c1.clone();
            c4.setImei(1004);
            c5 = c1.clone();
            c5.setImei(1005);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println("Celular 1: "+c1.getImei() );
        System.out.println("Celular 2: "+c2.getImei() );
        System.out.println("Celular 3: "+c3.getImei() );
        System.out.println("Celular 4: "+c4.getImei() );
        System.out.println("Celular 5: "+c5.getImei() );
    }
}
