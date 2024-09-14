import notificador.Notificador;
import notificadores.Telegram;
import notificadores.Whatsapp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotificadorTest {
    public Notificador notificador;
    @Test
    public void WhatsappTest(){
        notificador = new Whatsapp();
        String msj_esperado = "Notificación generada por Whatsapp";
        Assertions.assertEquals(msj_esperado,notificador.notificar());
    }

    @Test
    public void TelegramTest(){
        notificador =  new Telegram();
        String msj_esperado = "Notificación generada por Telegram";
        Assertions.assertEquals(msj_esperado,notificador.notificar());
    }
}
