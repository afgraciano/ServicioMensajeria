package servicios;

public class ServicioMensajeriaProxy implements IServicioMensajeria {

    private IServicioMensajeria servicioMensajeria;

    public ServicioMensajeriaProxy() {
        super();
        this.servicioMensajeria = new ServicioMensajeria();
    }

    
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        servicioMensajeria.enviarMensaje(destinatario, mensaje);
        //hora 1:07 del video
       
    }

}
