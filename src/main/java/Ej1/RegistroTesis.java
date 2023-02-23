package Ej1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroTesis {
    private static RegistroTesis instanciaUnica = null;
    private List <Tesis> tesisRegistradas;
    private int count;
    private Date horaRegistro;

    private RegistroTesis() {
        tesisRegistradas = new ArrayList<>();
        count = 0;
    }

    public static RegistroTesis getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new RegistroTesis();
        }
        return instanciaUnica;
    }
    public void registrarTesis(Tesis tesis){
        if (!tesisRegistradas.contains(tesis)) {
            tesisRegistradas.add(tesis);
            count++;
            horaRegistro = new Date();
            System.out.println("Tesis registrada con éxito");
        }else {
            System.out.println("Ya existe una teis con ese título");
        }
    }
    public void mostrarTesisRegistradas(){
        if(tesisRegistradas.size() == 0) {
            System.out.println("No hay tesis registradas");
        }else{
            for(Tesis t : tesisRegistradas){
                System.out.println("Tíyulo: "+t.getTitulo() + " | Mención:" + t.getMencion()
                + " | Estudiante: "+t.getEstudiante().getNombre() + " (CI: "+t.getEstudiante().getCi()+")"+ " | Hora de registro: " + horaRegistro);
            }
        }
    }
    public int getCount(){
        return count;
    }
}
