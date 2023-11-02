package co.edu.udistrital.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.Tema;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal vista;
	private Directorio datos;
	
	
	public Controller() {
		vista = new VentanaPrincipal();
		datos = new Directorio();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPd().getLista_genero().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("LISTA1")) {
			vista.getPd().getLista_nombres().removeActionListener(this);
			vista.getPd().getLista_nombres().removeAllItems();
			vista.getPd().getLista_genero().removeItem("Buscar...");
		
			String buscarGenero = (String) vista.getPd().getLista_genero().getSelectedItem();
			vista.getPd().getLista_nombres().addItem(" ");
			
			//T e m a s
			int[] colorFondo = Tema.colorFondo(buscarGenero);
			vista.getContentPane().setBackground(new Color(colorFondo[0], colorFondo[1], colorFondo[2]));
			int[] colorPr = Tema.colorPanel(buscarGenero);
			vista.getPr().setBackground(new Color(colorPr[0], colorPr[1], colorPr[2]));
			int[] colorPd = Tema.colorPanel(buscarGenero);
			vista.getPd().setBackground(new Color(colorPd[0], colorPd[1], colorPd[2]));
			int[] colorPf = Tema.colorPanel(buscarGenero);
			vista.getPf().setBackground(new Color(colorPf[0], colorPf[1], colorPf[2]));
			
			for(Persona x : datos.getDirectorio()) {
				if(x.getGenero().equals(buscarGenero)) {
					vista.getPd().getLista_nombres().addItem(x.getNombre());
				}
			}
			
			vista.getPr().getEnombre2().setText("");
			vista.getPr().getEciudad2().setText("");
			vista.getPr().getEtel2().setText("");
			vista.getPr().getEmail2().setText("");
			vista.getPf().CambiarImagen("");
			
			vista.getPd().getLista_nombres().addActionListener(this);
		}
		else if (comando.equals("LISTA2")){
			String buscarNombre = (String) vista.getPd().getLista_nombres().getSelectedItem();
			
			vista.getPd().getLista_nombres().removeItem(" ");
			if(!buscarNombre.equals(" ")) {
				Persona encontrada = null;
				for(Persona x : datos.getDirectorio()) {
					if(x.getNombre().equals(buscarNombre)) {
						encontrada = x;
					}
				}
				vista.getPr().getEnombre2().setText(encontrada.getNombre());
				vista.getPr().getEciudad2().setText(encontrada.getCiudad());
				vista.getPr().getEtel2().setText(encontrada.getTelefono());
				vista.getPr().getEmail2().setText(encontrada.getEmail());
				vista.getPf().CambiarImagen(encontrada.getArchivoFoto());
			}
		}
	}
	
	
}





