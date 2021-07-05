package sockets.servidor;

import java.io.IOException;

import com.example.sdksamples.SampleProperties;
import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;

import sockets.servidor.Servidor;


//Clase principal que hará uso del servidor
public class MainServidor
{
    public static void main(String[] args) throws IOException, EngineException, InterruptedException
    {
    	String hostname = System.getProperty(SampleProperties.hostname);
    	String[] engines = MatlabEngine.findMatlab();
	    MatlabEngine matEng = MatlabEngine.connectMatlab(engines[0]);
        Servidor serv = new Servidor(); //Se crea el servidor

        System.out.println("Iniciando servidor\n");
        serv.startServer(matEng, hostname); //Se inicia el servidor
    }
}