package com.example.sdksamples;

import com.impinj.octane.AntennaConfigGroup;
import com.impinj.octane.AutoStartMode;
import com.impinj.octane.AutoStopMode;
import com.impinj.octane.ImpinjReader;
import com.impinj.octane.OctaneSdkException;
import com.impinj.octane.ReportConfig;
import com.impinj.octane.Settings;
import com.impinj.octane.TagReportListener;


import java.util.ArrayList;
import java.util.Scanner;


public class HelloOctaneSdk {
	
	

    public static void main(String hostname, int angle, double tiempo_ms, int  puerto, double  canal,TagReportListenerImplementation t) throws OctaneSdkException, InterruptedException {

   

            ImpinjReader reader = new ImpinjReader();

            // Connect
            System.out.println("Connecting to " + hostname);
            reader.connect(hostname);

            // Get the default settings
            Settings settings = reader.queryDefaultSettings();
            ArrayList<Double> list = new ArrayList<>();
	           list.add(canal);	    	           
	           //settings.setReducedPowerFrequenciesInMhz(list);
	           settings.setTxFrequenciesInMhz(list);	         
	           ReportConfig report = settings.getReport();
	           report.setIncludeAntennaPortNumber(true);
	           report.setIncludeChannel(true);
	           report.setIncludePeakRssi(true);
	           
	        // Antennas
	           AntennaConfigGroup ac = settings.getAntennas();
	           ac.disableAll();
	           ac.getAntenna((short) puerto).setEnabled(true);
	           
	           
            // Apply the new settings
	  
            reader.applySettings(settings);
             reader.setTagReportListener(t);
            // connect a listener
            
          //  if (canal == 867.5 && puerto==2) {tiempo_ms=10000;}
            // Start the reader
            reader.start();
            
            Thread.sleep((long) tiempo_ms);
            //System.out.println("Press Enter to exit.");
           // Scanner s = new Scanner(System.in);
          // s.nextLine();

         //   System.out.println("Stopping  " + hostname);
            reader.stop();

            //System.out.println("Disconnecting from " + hostname);
            reader.disconnect();

            System.out.println("Done");
        
    }
}
