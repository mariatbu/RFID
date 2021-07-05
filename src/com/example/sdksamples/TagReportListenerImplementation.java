package com.example.sdksamples;

import com.impinj.octane.ImpinjReader;
import com.impinj.octane.Tag;
import com.impinj.octane.TagReport;
import com.impinj.octane.TagReportListener;

import java.util.List;

public class TagReportListenerImplementation implements TagReportListener {
	
	public double [] rssi = new double [2000];
	public double [] f = new double [2000];
	public short puerto[] = new short[2000];
	public String IDS[] = new String[2000];
	int count = 0;
	int count2=0;
	int cuenta = 20;


    @Override
    public void onTagReported(ImpinjReader reader, TagReport report) {
        List<Tag> tags = report.getTags();

        for (Tag t : tags) {
            System.out.print(" EPC: " + t.getEpc().toString());

            if (reader.getName() != null) {
                System.out.print(" Reader_name: " + reader.getName());
            } else {
                System.out.print(" Reader_ip: " + reader.getAddress());
            }

            if (t.isAntennaPortNumberPresent()) {
                System.out.print(" antenna: " + t.getAntennaPortNumber());
            }

            if (t.isFirstSeenTimePresent()) {
                System.out.print(" first: " + t.getFirstSeenTime().ToString());
            }

            if (t.isLastSeenTimePresent()) {
                System.out.print(" last: " + t.getLastSeenTime().ToString());
            }

            if (t.isSeenCountPresent()) {
                System.out.print(" count: " + t.getTagSeenCount());
            }

            if (t.isRfDopplerFrequencyPresent()) {
                System.out.print(" doppler: " + t.getRfDopplerFrequency());
            }

            if (t.isPeakRssiInDbmPresent()) {
                System.out.print(" peak_rssi: " + t.getPeakRssiInDbm());
            }

            if (t.isChannelInMhzPresent()) {
                System.out.print(" chan_MHz: " + t.getChannelInMhz());
            }

            if (t.isRfPhaseAnglePresent()) {
                System.out.print(" phase angle: " + t.getPhaseAngleInRadians());
            }

            if (t.isFastIdPresent()) {
                System.out.print("\n     fast_id: " + t.getTid().toHexString());

                System.out.print(" model: " +
                        t.getModelDetails().getModelName());

                System.out.print(" epcsize: " +
                        t.getModelDetails().getEpcSizeBits());

                System.out.print(" usermemsize: " +
                        t.getModelDetails().getUserMemorySizeBits());
            }

            System.out.println("");
        }
        
        rssi[count] = report.getTags().get(0).getPeakRssiInDbm();
        puerto[count]= report.getTags().get(0).getAntennaPortNumber();
	    IDS[count] = report.getTags().get(0).getEpc().toString();
	    f[count] = report.getTags().get(0).getChannelInMhz();
        count++;
  //      int paso=0;
        
     //   if (report.getTags().get(0).getAntennaPortNumber() == 2 && report.getTags().get(0).getChannelInMhz() == 867.5) {
        	
    //    	if (count2>=cuenta) {paso=1;}
    //    }
        
     //   if (paso==1) {e.main(rssi,puerto,IDS,f,cuenta,paso);}

        
        
    }
}
