
import classroom.notifier.entity.MedioNotificacion;
import notificadores.Whatsapp;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class NotificadorTest {
    public MedioNotificacion notificador;
    @Test
    public void WhatsappTest(){
        notificador = new Whatsapp();
        Map<String, String> map = new HashMap<>();
        map.put("ALD334", "1");
        notificador.Notificar(map);
    }


}
