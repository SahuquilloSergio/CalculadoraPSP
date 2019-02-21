package psp_calculadora_servidor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;

import java.net.Socket;
import javax.swing.JOptionPane;
import static psp_calculadora_servidor.PSP_Calculadora_Servidor.*;

public class PSP_Calculadora_Servidor {

    public static void main(String[] args) {

        int port = Integer.parseInt(JOptionPane.showInputDialog("Puerto?"));

        try {
            //Creamos el socket del servidor:
            System.out.println("Creando socket servidor");
            ServerSocket serverSocket = new ServerSocket(port);

            // El servidor está operativo hasta que cambie el valor del boolean:
            while (true) {
                //El socket del servidor se queda escuchando en la direccion deseada.
                //En cuanto reciba una conexion se crea el objeto Socket
                System.out.println("Aceptando conexiones");
                Socket newSocket = serverSocket.accept();

                // Se crea un Thread:
                new Cliente(newSocket).start();
            }
        } catch (IOException ex) {
            System.out.println("Error al recibir conexiones");
        }
    }
}

/**
 * Hilo para cada cliente del servidor.
 */
class Cliente extends Thread {

    private Socket socket;
    private InputStream is;
    private OutputStream os;

    /**
     * Recibimos el socket de conexión con el cliente y abrimos las conexiones
     * de entrada y salida.
     *
     * @param socket socket de conexión con el cliente
     * @throws IOException
     */
    public Cliente(Socket socket) throws IOException {
        this.socket = socket;
        is = socket.getInputStream();
        os = socket.getOutputStream();
        System.out.println("Conexión recibida");
    }

    /**
     * Operación que suma los dos números recibidos.
     *
     * @param num1 El primer número que será sumada.
     * @param num2 El segundo número que será sumado.
     * @return El resultado de la operación.
     */
    public static double sumar(double num1, double num2) {
        System.out.println("Sumando: " + num1 + " + " + num2);
        return num1 + num2;
    }

    /**
     * Operación que resta los dos números recibidos.
     *
     * @param num1 El primer número que será restado.
     * @param num2 El segundo número que será restado.
     * @return El resultado de la operación.
     */
    public static double restar(double num1, double num2) {
        System.out.println("Restando: " + num1 + " - " + num2);
        return num1 - num2;
    }

    /**
     * Operación que multiplica los dos números recibidos.
     *
     * @param num1 El primer número que será multiplicado.
     * @param num2 El segundo número que será multiplicado.
     * @return El resultado de la operación.
     */
    public static double multiplicar(double num1, double num2) {
        System.out.println("Multiplicando: " + num1 + " * " + num2);
        return num1 * num2;
    }

    /**
     * Operación que divide los dos números recibidos.
     *
     * @param num1 El primer número que será dividido.
     * @param num2 El segundo número que será dividido.
     * @return El resultado de la operación.
     */
    public static double dividir(double num1, double num2) {
        System.out.println("Dividiendo: " + num1 + " / " + num2);
        return num1 / num2;
    }

    /**
     * Operación que hace la raiz cuadrada de un número:
     *
     * @param num1 El primer número que será operado.
     * @return El resultado de la operación.
     */
    public static double raizCuadrada(double num1) {
        System.out.println("Raiz cuadrada: " + num1 + "√");

        return Math.sqrt(num1);
    }

    @Override
    public void run() {
        try {
            // Se lee el mensaje recibido:
            byte[] mensajeRecibido = new byte[25];
            is.read(mensajeRecibido);
            System.out.println("Mensaje recibido: " + new String(mensajeRecibido));

            // Se forma un array de strings para manejar los datos individualmente:
            String[] cadena = new String(mensajeRecibido).split(" ");
            double resultado = 0;
            
                switch (cadena[1]) {
                    // Si el elemento encontrado es +:
                    case "+":
                        resultado = sumar(Double.valueOf(cadena[0]), Double.valueOf(cadena[2]));
                        break;
                    // Si el elemento encontrado es -:
                    case "-":
                        resultado = restar(Double.valueOf(cadena[0]), Double.valueOf(cadena[2]));
                        break;
                    // Si el elemento encontrado es *:
                    case "*":
                        resultado = multiplicar(Double.valueOf(cadena[0]), Double.valueOf(cadena[2]));
                        break;
                    // Si el elemento encontrado es /:
                    case "/":
                        resultado = dividir(Double.valueOf(cadena[0]), Double.valueOf(cadena[2]));
                        break;
                    // Si el elemento encontrado es ^2:
                    case ".":
                        resultado = raizCuadrada(Double.valueOf(cadena[0]));
                        break;
                }
            
            // Se trata el resultado y se envía al cliente:
            System.out.println("Enviando mensaje: " + resultado);
            String mensajeEnviado = String.valueOf(resultado);
            os.write(mensajeEnviado.getBytes());
            System.out.println("Mensaje enviado");
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                //Cerramos la conexión
                socket.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar la conexión");
            }
        }
    }
}