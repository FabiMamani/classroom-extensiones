package notificadores;

import classroom.notifier.entity.MedioNotificacion;

import java.util.Map;

public class Whatsapp implements MedioNotificacion {

    @Override
    public void Notificar(Map<String, String> cambiosANotificar) {
        String msj = cambiosANotificar.toString();
        System.out.println(msj);
        //return msj;
    }
}
