package co.edu.udistrital.view;

public class Tema {
	
	public static int[] colorFondo(String genero) {
	    int[] color = new int[3];
	    
	    if (genero.equals("Femenino")) {
	        color[0] = 199;
	        color[1] = 125;
	        color[2] = 255;
	    } else if (genero.equals("Masculino")) {
	        color[0] = 163;
	        color[1] = 255;
	        color[2] = 172;
	    } else if (genero.equals("Otro")) {
	        color[0] = 252;
	        color[1] = 248;
	        color[2] = 157;
	    } else {
	        color[0] = 105;
	        color[1] = 105;
	        color[2] = 105;
	    }
	    
	    return color;
	}	

	public static int[] colorPanel(String genero) {
	    int[] color = new int[3];
	    try {
	    if (genero.equals("Femenino")) {
	        color[0] = 189;
	        color[1] = 111;
	        color[2] = 247;
	    } else if (genero.equals("Masculino")) {
	        color[0] = 151;
	        color[1] = 252;
	        color[2] = 161;
	    } else if (genero.equals("Otro")) {
	        color[0] = 242;
	        color[1] = 238;
	        color[2] = 141;
	    } 
	    }
	    catch(NullPointerException e){
	        color[0] = 128;
	        color[1] = 128;
	        color[2] = 128;
	    }

	    return color;
	}

	public static int[] colorFoto(String genero) {
	    int[] color = new int[3];
	    
	    if (genero.equals("Femenino")) {
	        color[0] = 203;
	        color[1] = 141;
	        color[2] = 252;
	    } else if (genero.equals("Masculino")) {
	        color[0] = 173;
	        color[1] = 255;
	        color[2] = 181;
	    } else if (genero.equals("Otro")) {
	        color[0] = 255;
	        color[1] = 252;
	        color[2] = 181;
	    } else {
	        color[0] = 128;
	        color[1] = 128;
	        color[2] = 128;
	    }

	    return color;
	}	
}
