package servicios;

public class ServicioMensajeria implements IServicioMensajeria {

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
      System.out.println("Enviando mensaje a: " + destinatario);
      System.out.println("Mensaje: " + mensaje);
    }

    
}
