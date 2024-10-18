package notificadores;

import classroom.notifier.entity.Alumno;
import classroom.notifier.implement.MedioComunicacion;

import java.util.List;

public class Telegram implements MedioComunicacion {
    String name = "Telegram";
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
