package com.example.sdksamples;
import com.impinj.octane.TagReportListener;
import com.mathworks.engine.MatlabEngine;

public class Start {
	public static int angle;
	public static double [] canales;
	public static int [] puertos;
	public static double tiempo_ms;
	public static double [][] datos;
	public static String hostname;
	public static MatlabEngine matEng;
	

	public static void main(String   args) throws Exception {
		// TODO Auto-generated method stub
		
		// String hostname = getHostname();
	           String hostname = args;
		
	            HelloOctaneSdk hello = new HelloOctaneSdk();
	           
	            TagReportListenerImplementation t = new TagReportListenerImplementation();
	         int cuenta = t.cuenta;
	            
	            if (puertos[0]==1) {
	            	if (canales[0]==865.7) {
	            		hello.main(hostname,angle, tiempo_ms, puertos[0], canales[0],t);
		            }
		            
		            if(canales[1]==866.3) {
		            	hello.main(hostname,angle, tiempo_ms, puertos[0], canales[1],t);	
		            }
		            if(canales[2]==866.9) {
		            	hello.main(hostname,angle, tiempo_ms, puertos[0], canales[2],t);	
		            }
		            if(canales[3]==867.5) {
		            	hello.main(hostname,angle, tiempo_ms, puertos[0], canales[3],t);	
		            }	            
	            }
	            
	            if (puertos[1]==1) {
		            if (canales[0]==865.7) {
		            hello.main(hostname,angle, tiempo_ms, puertos[1]+1, canales[0],t);
		            }
		            if(canales[1]==866.3) {
		            	hello.main(hostname,angle, tiempo_ms, puertos[1]+1, canales[1],t);	
		            }
		            if(canales[2]==866.9) {
		            	hello.main(hostname,angle, tiempo_ms, puertos[1]+1, canales[2],t);	
		            }
		            if(canales[3]==867.5) {
		            	hello.main(hostname,angle, tiempo_ms, puertos[1]+1, canales[3],t);	
		            }	            
		        }
	            
	        
	            int size = 0;
	    		for (int i = 1; i<=t.puerto.length; i++) {if(t.puerto[i-1]==1 || t.puerto[i-1]==2) {size++;}}
	            
	    		short resultado_puertos[] = new short[size];
	    		String resultado_IDS[] = new String[size];
	    		double resultado_RSSI[] = new double[size];
	    		double resultado_f[] = new double [size];
	    		
	    		for(int i =1;i<=size;i++) {resultado_puertos[i-1]=t.puerto[i-1];}
	    		for(int i=1;i<=size;i++) {resultado_IDS[i-1]=t.IDS[i-1];}
	    		for(int i=1;i<=size;i++) {resultado_RSSI[i-1]=t.rssi[i-1];}
	    		for(int i=1;i<=size;i++) {resultado_f[i-1]=t.f[i-1];}
	            
	    		short resultado_puertos_canal1[] = new short[cuenta];
	    		String resultado_IDS_canal1[] = new String[cuenta];
	    		double resultado_RSSI_canal1[] = new double[cuenta];
	    		double resultado_f_canal1[] = new double [cuenta];
	    		
	    		short resultado_puertos_canal12[] = new short[cuenta];
	    		String resultado_IDS_canal12[] = new String[cuenta];
	    		double resultado_RSSI_canal12[] = new double[cuenta];
	    		double resultado_f_canal12[] = new double [cuenta];
	    		
	    		short resultado_puertos_canal2[] = new short[cuenta];
	    		String resultado_IDS_canal2[] = new String[cuenta];
	    		double resultado_RSSI_canal2[] = new double[cuenta];
	    		double resultado_f_canal2[] = new double [cuenta];
	    		
	    		short resultado_puertos_canal22[] = new short[cuenta];
	    		String resultado_IDS_canal22[] = new String[cuenta];
	    		double resultado_RSSI_canal22[] = new double[cuenta];
	    		double resultado_f_canal22[] = new double [cuenta];
	    		
	    		short resultado_puertos_canal3[] = new short[cuenta];
	    		String resultado_IDS_canal3[] = new String[cuenta];
	    		double resultado_RSSI_canal3[] = new double[cuenta];
	    		double resultado_f_canal3[] = new double [cuenta];
	    		
	    		short resultado_puertos_canal32[] = new short[cuenta];
	    		String resultado_IDS_canal32[] = new String[cuenta];
	    		double resultado_RSSI_canal32[] = new double[cuenta];
	    		double resultado_f_canal32[] = new double [cuenta];
	    		
	    		
	    		short resultado_puertos_canal4[] = new short[cuenta];
	    		String resultado_IDS_canal4[] = new String[cuenta];
	    		double resultado_RSSI_canal4[] = new double[cuenta];
	    		double resultado_f_canal4[] = new double [cuenta];
	    		
	    		short resultado_puertos_canal42[] = new short[cuenta];
	    		String resultado_IDS_canal42[] = new String[cuenta];
	    		double resultado_RSSI_canal42[] = new double[cuenta];
	    		double resultado_f_canal42[] = new double [cuenta];
	    		
	    		
	    		
	    		int cont1=0;
	    		int cont12=0;
	    		int cont2=0;
	    		int cont22=0;
	    		int cont3=0;
	    		int cont32=0;
	    		int cont4=0;
	    		int cont42=0;
	    		
	    		for(int i = 1; i<=size;i++) {
	    			
	    			if(resultado_f[i-1]==865.7 && resultado_puertos[i-1]==1) {
	    				if(cont1<cuenta) {
	    				resultado_puertos_canal1[cont1] = resultado_puertos[i-1];
	    				resultado_IDS_canal1[cont1]=resultado_IDS[i-1];
	    				resultado_RSSI_canal1[cont1]=resultado_RSSI[i-1];
	    				resultado_f_canal1[cont1]=resultado_f[i-1];
	    				cont1++;}}
	    			
	    			if(resultado_f[i-1]==865.7 &&  resultado_puertos[i-1]==2 ) {
	    				if(cont12<cuenta) {
	    				resultado_puertos_canal12[cont12] = resultado_puertos[i-1];
	    				resultado_IDS_canal12[cont12]=resultado_IDS[i-1];
	    				resultado_RSSI_canal12[cont12]=resultado_RSSI[i-1];
	    				resultado_f_canal12[cont12]=resultado_f[i-1];
	    				cont12++;
	    				}
	    				
	    			}
	    			
	    		}
	    		
	    		for(int i=1;i<=size;i++) {
	    			
	    			if(resultado_f[i-1]==866.3 && resultado_puertos[i-1]==1) {
	    				
	    				if(cont2<cuenta) {
	    					
	    					resultado_puertos_canal2[cont2] = resultado_puertos[i-1];
	    					resultado_IDS_canal2[cont2]=resultado_IDS[i-1];
	    					resultado_RSSI_canal2[cont2]=resultado_RSSI[i-1];
	    					resultado_f_canal2[cont2]=resultado_f[i-1];
	    					cont2++;
	    					
	    				}
	    				
	    			
	    				
	    				
	    			}
	    			
	    			if(resultado_f[i-1]==866.3 &&  resultado_puertos[i-1]==2 ) {
	    				if(cont22<cuenta) {
	    				resultado_puertos_canal22[cont22] = resultado_puertos[i-1];
	    				resultado_IDS_canal22[cont22]=resultado_IDS[i-1];
	    				resultado_RSSI_canal22[cont22]=resultado_RSSI[i-1];
	    				resultado_f_canal22[cont22]=resultado_f[i-1];
	    				cont22++;
	    				}
	    				
	    			}
	    			
	    			
	    		}
	    		
	    		for (int i=1;i<=size;i++) {
	    			
	    			
	    			if(resultado_f[i-1]==866.9 &&  resultado_puertos[i-1]==1) {
	    				
	    				if(cont3<cuenta) {
	    					
	    					resultado_puertos_canal3[cont3] = resultado_puertos[i-1];
	    					resultado_IDS_canal3[cont3]=resultado_IDS[i-1];
	    					resultado_RSSI_canal3[cont3]=resultado_RSSI[i-1];
	    					resultado_f_canal3[cont3]=resultado_f[i-1];
	    					cont3++;
	    					
	    				}
	    				
	    			
	    				
	    				
	    				
	    			}
	    			
	    			if(resultado_f[i-1]==866.9 &&  resultado_puertos[i-1]==2 ) {
	    				if(cont32<cuenta) {
	    				resultado_puertos_canal32[cont32] = resultado_puertos[i-1];
	    				resultado_IDS_canal32[cont32]=resultado_IDS[i-1];
	    				resultado_RSSI_canal32[cont32]=resultado_RSSI[i-1];
	    				resultado_f_canal32[cont32]=resultado_f[i-1];
	    				cont32++;
	    				}
	    				
	    			}
	    			
	    		}
	    	
	    		
	    		for (int i=1;i<=size;i++) {
	    			
	    			if(resultado_f[i-1]==867.5 && resultado_puertos[i-1]==1) {
	    				
	    				if(cont4<cuenta) {
	    					
	    					resultado_puertos_canal4[cont4] = resultado_puertos[i-1];
	    					resultado_IDS_canal4[cont4]=resultado_IDS[i-1];
	    					resultado_RSSI_canal4[cont4]=resultado_RSSI[i-1];
	    					resultado_f_canal4[cont4]=resultado_f[i-1];
	    					cont4++;
	    					
	    				}
	    				
	    			
	    				
	    			}
	    			
	    			if(resultado_f[i-1]==867.5 &&  resultado_puertos[i-1]==2 ) {
	    				if(cont42<cuenta) {
	    				resultado_puertos_canal42[cont42] = resultado_puertos[i-1];
	    				resultado_IDS_canal42[cont42]=resultado_IDS[i-1];
	    				resultado_RSSI_canal42[cont42]=resultado_RSSI[i-1];
	    				resultado_f_canal42[cont42]=resultado_f[i-1];
	    				cont42++;
	    				}
	    				
	    			}
	    			
	    		}
	    		
	    		
	            double [][] datosmedida = new double [2*cuenta][16];
	        
	            for (int j=0;j<15;j++) {
					for(int i = 0; i < cuenta; i++) {
					
					if (j==0) {
						
						datosmedida[i][j]=resultado_puertos_canal1[i];
					}
					
					if (j==1) {
						
						datosmedida[i][j]=resultado_f_canal1[i];
					}
					
					if (j==2) {
						datosmedida[i][j]=resultado_RSSI_canal1[i];
						
					}
										
					if(j==4) {
						datosmedida[i][j]=resultado_puertos_canal2[i];
						
					}
					
					if(j==5) {
						
						datosmedida[i][j]=resultado_f_canal2[i];
					}

					if(j==6) {
						datosmedida[i][j]=resultado_RSSI_canal2[i];
					}
					
					if(j==8) {
						datosmedida[i][j]=resultado_puertos_canal3[i];
						
                    }
					if(j==9) {
						datosmedida[i][j]=resultado_f_canal3[i];

						
                    }
					if(j==10) {
						
						datosmedida[i][j]=resultado_RSSI_canal3[i];
                    }
					
				if(j==12) {
					datosmedida[i][j]=resultado_puertos_canal4[i];

						
                    }

				if(j==13) {
					datosmedida[i][j]=resultado_f_canal4[i];


				}

				if(j==14) {
					datosmedida[i][j]=resultado_RSSI_canal4[i];


					}
					
				}
			}	
			
				
				//Estoy llenando todo lo referente a la antena 2

				
				for (int j=0;j<15;j++) {
					for(int i = cuenta; i < 2*cuenta; i++) {
					
					if (j==0) {
						
						datosmedida[i][j]=resultado_puertos_canal12[i-cuenta];
					}
					
					if (j==1) {
						
						datosmedida[i][j]=resultado_f_canal12[i-cuenta];
					}
					
					if (j==2) {
						datosmedida[i][j]=resultado_RSSI_canal12[i-cuenta];
						
					}
					
					if(j==4) {
						datosmedida[i][j]=resultado_puertos_canal22[i-cuenta];
						
					}
					
					if(j==5) {
						
						datosmedida[i][j]=resultado_f_canal22[i-cuenta];
					}

					if(j==6) {
						datosmedida[i][j]=resultado_RSSI_canal22[i-cuenta];

                }
					if(j==8) {
						datosmedida[i][j]=resultado_puertos_canal32[i-cuenta];
						
                    }
					if(j==9) {
						datosmedida[i][j]=resultado_f_canal32[i-cuenta];

						
                    }
					if(j==10) {
						
						datosmedida[i][j]=resultado_RSSI_canal32[i-cuenta];
                    }
					
				if(j==12) {
					datosmedida[i][j]=resultado_puertos_canal42[i-cuenta];

						
                    }

				if(j==13) {
					datosmedida[i][j]=resultado_f_canal42[i-cuenta];


				}

				if(j==14) {
					datosmedida[i][j]=resultado_RSSI_canal42[i-cuenta];


					}
					
				}
			}
				//ESTIMACIÓN DEL ÁNGULO EN TIEMPO REAL
				
				//matEng.putVariable("datos_medida"+String.valueOf(angle), datosmedida);
				matEng.putVariable("datos_medida", datosmedida);
				matEng.putVariable("tags_antena1_canal1", resultado_IDS_canal1);
				matEng.putVariable("tags_antena1_canal2", resultado_IDS_canal2);
				matEng.putVariable("tags_antena1_canal3", resultado_IDS_canal3);
				matEng.putVariable("tags_antena1_canal4", resultado_IDS_canal4);
				matEng.putVariable("tags_antena2_canal1", resultado_IDS_canal12);
				matEng.putVariable("tags_antena2_canal2", resultado_IDS_canal22);
				matEng.putVariable("tags_antena2_canal3", resultado_IDS_canal32);
				matEng.putVariable("tags_antena2_canal4", resultado_IDS_canal42);
				matEng.eval("[datos_obtenidos, tag1_a1, tag1_a2, tag2_a1, tag2_a2, tag3_a1, tag3_a2] = arregloMatriz(datos_medida, tags_antena1_canal1, tags_antena1_canal2, tags_antena1_canal3, tags_antena1_canal4, tags_antena2_canal1, tags_antena2_canal2, tags_antena2_canal3, tags_antena2_canal4);");
				matEng.eval("monopulso_tags(tag1_a1, tag1_a2, tag2_a1, tag2_a2, tag3_a1, tag3_a2, "+angle+");");
				
				
				//DIAGRAMAS DIGITALES
				
				/*matEng.eval("theta=-95:1:95;");
				matEng.eval("[Pot_antena1_canal1,Pot_antena1_canal2,Pot_antena1_canal3,Pot_antena1_canal4,Pot_antena2_canal1,Pot_antena2_canal2,Pot_antena2_canal3,Pot_antena2_canal4]=mediaRSSI_dBm(datos_medida"+String.valueOf(angle)+",theta("+angle+"),Pot_antena1_canal1,Pot_antena1_canal2,Pot_antena1_canal3,Pot_antena1_canal4,Pot_antena2_canal1,Pot_antena2_canal2,Pot_antena2_canal3,Pot_antena2_canal4);");
				matEng.eval("plot(theta,Pot_antena1_canal1,theta,Pot_antena2_canal1,theta,Pot_antena1_canal2,theta,Pot_antena2_canal2,theta,Pot_antena1_canal3,theta,Pot_antena2_canal3,theta,Pot_antena1_canal4,theta,Pot_antena2_canal4,'linewidth',0.7);");
				matEng.eval("xlabel('Theta(deg)')");
				matEng.eval("ylabel('Potencia en dB')");
				matEng.eval("legend('P_A_n_t_e_n_a_1 (865,7 MHz)','P_A_n_t_e_n_a_2 (865,7 MHz)','P_A_n_t_e_n_a_1 (866,3 MHz)','P_A_n_t_e_n_a_2 (866,3 MHz)','P_A_n_t_e_n_a_1 (866,9 MHz)','P_A_n_t_e_n_a_2 (866,9 MHz)','P_A_n_t_e_n_a_1 (867,5 MHz)','P_A_n_t_e_n_a_2 (867,5 MHz)','Location','Best')");
				matEng.eval("title('Diagramas de radiación digitales')");
				matEng.eval("axis([-95 95 -87 -40])");*/
				//función que mueve la mesa
				//matEng.eval("gira_mesa("+(angle-95)+",h)");
				//matEng.eval("gira_mesa("+(angle-95)+",h)");

				
				//Prueba de mostrar el valor actual de la posición de la mesa
				//matEng.eval("valor_mesa(h,"+(angle-90)+")");
				
				
		
	}
	
	public void setAngle (int a) {angle=a;}
	public void setChannels(double [] c) {canales=c;}
    public void setPorts(int [] p) {puertos=p;}
    public void setTime(double tiempo) {tiempo_ms=tiempo;}
    public void setHostname(String hostn) {hostname=hostn;}
    
    public static void setDatos(double [][]datosmedida) {datos=datosmedida;}
    public double[][] getDatos() {return datos;}
    public static String getHostname() {return hostname;}
    
    
    
}
