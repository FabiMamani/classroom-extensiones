package notificadores;

import classroom.notifier.entity.implement.MedioNotificacion;
import classroom.notifier.entity.implement.NotifierListeners;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Whatsapp implements MedioNotificacion {

    Set<NotifierListeners> listeners;

    public Whatsapp(){
        this.listeners = new HashSet<>();
    }

    @Override
    public void Notificar(Map<String, String> cambiosANotificar) {
        String msj = cambiosANotificar.toString();
        System.out.println(msj);

        listeners.forEach(e -> e.enviarNotificaciones("Se envio mensaje por Whatsapp"));
        //return msj;
    }

    @Override
    public void AddListener(NotifierListeners notifierListeners) {
        if(notifierListeners != null) listeners.add(notifierListeners);
    }
}
