package notificadores;

import classroom.notifier.entity.Alumno;
import classroom.notifier.implement.MedioComunicacion;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Telegram implements MedioComunicacion {
    String name = "Telegram";
    private static final String BOT_TOKEN = "7834829611:AAHBM2XOqC0F5dYFFqVlxENXNlgLYMq032w";
    private static final String CHAT_ID = "953342229";
    @Override
    public void Notificar(String Materia, String Aula, List<Alumno> destinatarios) {
        String msj = "La materia: "+ Materia+" cambio a Aula -> "+ Aula;
        try {
            sendMessage(msj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void sendMessage(String message) throws Exception {
        String urlString = "https://api.telegram.org/bot" + BOT_TOKEN + "/sendMessage?chat_id=" + CHAT_ID + "&text=" + message;
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Leer la respuesta
        int responseCode = conn.getResponseCode();
        if (responseCode == 200) {
            System.out.println("Mensaje enviado con éxito!");
        } else {
            System.out.println("Error al enviar el mensaje: " + responseCode);
        }
        conn.disconnect();
    }

    @Override
    public String getMedio() {
        return name;
    }

    //953342229

}
