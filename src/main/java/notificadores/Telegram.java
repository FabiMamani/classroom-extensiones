package notificadores;

import notificador.Notificador;

public class Telegram implements Notificador {
    @Override
    public String notificar() {
        String msj =  "Notificación generada por Telegram";
        return msj;
    }
}
