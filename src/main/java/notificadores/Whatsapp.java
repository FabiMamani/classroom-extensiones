package notificadores;

import classroom.notifier.entity.Alumno;
import classroom.notifier.implement.MedioComunicacion;

import java.util.List;
import java.util.Map;

public class Whatsapp implements MedioComunicacion {

    public String name = "Whatsapp";
    @Override
    public void Notificar(String Materia, String Aula, List<Alumno> destinatarios) {
        String msj = "La materia: "+ Materia+" cambio a Aula"+ Aula;
        System.out.println(msj);
        System.out.println("Destinatarios" + destinatarios.toString());
    }

    @Override
    public String getMedio() {
        return name;
    }
}
