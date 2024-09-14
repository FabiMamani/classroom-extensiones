package notificadores;

import notificador.Notificador;

public class Whatsapp implements Notificador {
    @Override
    public String notificar() {
        String msj = "Notificación generada por Whatsapp";
        return msj;
    }
}
