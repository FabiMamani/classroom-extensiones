
import classroom.notifier.implement.MedioComunicacion;
import notificadores.Whatsapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NotificadorTest {
    public MedioComunicacion notificador;
    @Test
    public void WhatsappTest(){
        notificador = new Whatsapp();
        Assertions.assertEquals(notificador.getMedio(), "Whatsapp");
    }


}
