package Ej1;

public class Main {
    public static void main(String[] args){
        RegistroTesis registro = RegistroTesis.getInstance();

        Tesis t1 = new Tesis("tema1","mencion1",new Estudiante ("Juan", 1234567));
        Tesis t2 = new Tesis("tema2","mencion2",new Estudiante ("Pedro", 2345678));
        Tesis t3 = new Tesis("tema3","mencion3",new Estudiante ("Jose", 345679));
        Tesis t4 = new Tesis("tema4","mencion4",new Estudiante ("María", 4567890));

        Tesis t5 = new Tesis("tema1","mencion5",new Estudiante ("Roberto", 4564330));

        registro.registrarTesis(t1);
        registro.registrarTesis(t2);
        registro.registrarTesis(t3);
        registro.registrarTesis(t4);
        registro.registrarTesis(t5);

        registro.mostrarTesisRegistradas();

        System.out.println("Total tesis registradas:"+registro.getCount());
    }
}
