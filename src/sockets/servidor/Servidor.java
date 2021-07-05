package sockets.servidor;

import java.io.BufferedReader;

import com.example.sdksamples.Config;
import com.mathworks.engine.MatlabEngine;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import sockets.conexion.Conexion;

public class Servidor extends Conexion //Se hereda de conexión para hacer uso de los sockets y demás
{
    public Servidor() throws IOException{super("servidor");} //Se usa el constructor para servidor de Conexion

    public void startServer(MatlabEngine matEng, String hostname)//Método para iniciar el servidor
    {
        try
        {
        	int contador = 1;
        	
            System.out.println("Esperando..."); //Esperando conexión

            cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente

            System.out.println("Cliente en línea");

            //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream(cs.getOutputStream());

            //Se le envía un mensaje al cliente usando su flujo de salida
            salidaCliente.writeUTF("Petición recibida y aceptada");

            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            while((mensajeServidor = entrada.readLine()) != null) //Mientras haya mensajes desde el cliente
            {
                //Se muestra por pantalla el mensaje recibido
            	matEng.eval("pause('on')");
            	String angulo = String.valueOf(contador);
            	if (angulo.equals(mensajeServidor)) {
            		System.out.println("Estamos en el ángulo " + contador);
            		Config toma_datos = new Config();
            		toma_datos.main(contador, matEng, hostname);
            		matEng.eval("contador ="+angulo);
            		matEng.eval("pause('off')");
            		contador ++;
            	}
            	
            	
                
                
                	
                //Aquí Podemos crear el obejto Ejecucion y empezar todo nuestro proceso de las clases de Java
                // Cada vez que comience ejecucion, se correspondería con un ángulo distinto
                // El ángulo vendría desde el cliente (MATLAB), guardado en la variable mensajeServidor
                //Por lo que no haría falta ningún bucle en java para ir llamando a Ejecucion, el propio bucle de 
                //Matlab de la mesa ya llamaría a Java cada vez que se vaya a transmitir
                
                
                
                	
                
            }

            System.out.println("Fin de la conexión");

            ss.close();//Se finaliza la conexión con el cliente
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}