package co.edu.udistrital.model;

import java.util.ArrayList;

public class Directorio {
	private ArrayList<Persona> directorio;
	
	public Directorio() {
		directorio = new ArrayList<Persona>();
		cargarDatosIniciales();
	}
	
	public void cargarDatosIniciales() {
		Persona x;
		x = new Persona("Nicki Nicole", "Femenino","Buenos Aires", "3223715340", "nickinicole@gmail.com", "m1");
		directorio.add(x);
		
		x = new Persona("Sofia Torres", "Femenino", "Bogota", "3227862085", "manuelitatitis@gmail.com", "m2");
		directorio.add(x);
		
		x = new Persona("Carol Rodriguez", "Femenino", "Bogota", "3114614393", "carolartemisa@gmail.com", "m3");
		directorio.add(x);
		
		x = new Persona("Juan Herran", "Masculino", "Bogota", "3183715230", "ju4npoloj@gmail.com", "h1");
		directorio.add(x);
		
		x = new Persona("Juan Bedoya", "Masculino", "Bogota", "3054728310", "bedoyalauterojuanesteban@gmail.com", "h2");
		directorio.add(x);
		
		x = new Persona("Gerardo Tole", "Masculino", "Bogota", "3143712356", "gtole@udistrital.edu.co", "h3");
		directorio.add(x);
		
	}
	
	public int obtenerLongitud() {
		return directorio.size();
	}

	public ArrayList<Persona> getDirectorio() {
		return directorio;
	}

	public void setDirectorio(ArrayList<Persona> directorio) {
		this.directorio = directorio;
	}
	
}
