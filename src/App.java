/*Patron Proxy o apoderado o agente que  para proteccion y ejecucion remota que controla el acceso al objeto original*/

import servicios.IServicioMensajeria;
import servicios.ServicioMensajeriaProxy;

public class App {
    public static void main(String[] args) throws Exception {
        IServicioMensajeria sm = new ServicioMensajeriaProxy();
        sm.enviarMensaje("pepito", "hola como esta");
    }
}
