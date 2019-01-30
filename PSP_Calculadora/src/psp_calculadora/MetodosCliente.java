package psp_calculadora;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

public class MetodosCliente {

    public void haceralgo(String cadena) throws IOException{
            
        boolean recibido = false;

        InterfazCalculadora IC = new InterfazCalculadora();
        

        // Se crea el socket del cliente:
        System.out.println("Creando socket cliente");
        Socket clienteSocket = new Socket();

        // Se estable la dirección del socket:
        System.out.println("Estableciendo la conexión");
        InetSocketAddress addr = new InetSocketAddress("localhost", 6666);
        clienteSocket.connect(addr);

        InputStream is = clienteSocket.getInputStream();
        OutputStream os = clienteSocket.getOutputStream();

        JOptionPane.showMessageDialog(null, "Enviando Operacion Al Servidor");
//        String mensaje = cadena;
        System.out.println("Cadena desde el mentodo: "+cadena);
//        System.out.println(cadena);
        os.write(cadena.getBytes());
        System.out.println("Mensaje enviado.");

//        byte[] mensajeRecibido = new byte[25];
//        is.read(mensajeRecibido);
//        System.out.println("Mensaje recibido: " + new String(mensajeRecibido));

        //Cerramos el socket
        System.out.println("Cerrando el socket cliente");
        clienteSocket.close();

        System.out.println("Terminado");
    }

    public MetodosCliente() {
        
    }
}
