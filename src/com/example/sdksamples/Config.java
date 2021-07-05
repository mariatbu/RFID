package com.example.sdksamples;
import com.mathworks.engine.MatlabEngine;

public class Config {

	public static void main(int angle, MatlabEngine matEng, String hostname) throws Exception {
		// TODO Auto-generated method stub
		
	
         if (hostname == null) {
             throw new Exception("Must specify the '"
                     + SampleProperties.hostname + "' property");
         }
         
         
         int [] puertos = new int [2];
         puertos[0] = 1;
         puertos[1]=1;
         double [] canales = new double [4];
         canales[0]=865.7;
         canales[1]=866.3;
         canales[2]=866.9;
         canales[3]=867.5;
         double tiempo_ms= 800;

         
         Start start = new Start();
         start.angle = angle;
         start.puertos=puertos;
         start.canales=canales;
         start.tiempo_ms= tiempo_ms;
         start.matEng=matEng;
         
         start.main(hostname);
         
	}

}
