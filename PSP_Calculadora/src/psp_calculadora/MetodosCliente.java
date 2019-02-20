package psp_calculadora;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MetodosCliente {

    boolean recibido = false;

    static Socket clienteSocket;
    int conn;

    /**
     * Método que inicia la conexión del cliente con el servidor.
     *
     * @param port El número del puerto al que se va a conectar.
     * @param boton El boton con el que se confirmará el puerto.
     * @param field Donde figura el numero de puerto
     * @throws IOException Se recoge la excepción que podría generar.
     */
    public void crearConexion(JTextField port, JButton boton, JTextField field) throws IOException {
        clienteSocket = new Socket();
        // Se crea el socket del cliente:
        System.out.println("Creando socket cliente");
        // Se estable la dirección del socket:
        System.out.println("Estableciendo la conexión");
        conn = Integer.parseInt(port.getText());
        InetSocketAddress addr = new InetSocketAddress("localhost", conn);
        clienteSocket.connect(addr);
        boton.setEnabled(false);
        field.setEnabled(false);
    }

    public void connect() {
        try {
            //Creamos el socket
            clienteSocket = new Socket();
            //Establecemos conexión
            InetSocketAddress addr = new InetSocketAddress("localhost", conn);
            clienteSocket.connect(addr);
        } catch (IOException ex) {
            Logger.getLogger(MetodosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método que envía un mensaje al servidor.
     *
     * @param mensaje El mensaje que envía el cliente.
     * @param resultado Donde se mostrará el resultado de la operación.
     */
    public void enviarMensaje(String mensaje, JTextField resultado) {
        String result = "0";
        try {
            connect();
            OutputStream os = clienteSocket.getOutputStream();
            os.write(mensaje.getBytes());
            System.out.println("Mensaje enviado.");

            InputStream is = clienteSocket.getInputStream();
            byte[] mensajeRecibido = new byte[25];
            is.read(mensajeRecibido);
            resultado.setText(String.format("%.2f", Float.parseFloat(new String(mensajeRecibido))));
            System.out.println("Mensaje recibido: " + new String(mensajeRecibido));
            is.close();
            os.close();
        } catch (IOException ex) {
            System.out.println("Error:" + ex);
        } finally {
            cerrarConexion();
        }
    }

    public void cerrarConexion() {
        try {
            //Cerramos el socket
            System.out.println("Cerrando el socket cliente");
            clienteSocket.close();
            System.out.println("Terminado");
        } catch (IOException ex) {
            System.out.println("Error conexión");
        }
    }
}
