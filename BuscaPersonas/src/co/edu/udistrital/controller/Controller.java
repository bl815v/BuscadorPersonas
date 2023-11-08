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
		vista.getPr().getBagregar().addActionListener(this);
		vista.getPr().getBeliminar().addActionListener(this);
		
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
			
			vista.getPr().getEnombre1().setVisible(false);
			vista.getPr().getEciudad1().setVisible(false);
			vista.getPr().getEtel1().setVisible(false);
			vista.getPr().getEmail1().setVisible(false);
			vista.getPr().getEnombre2().setText("");
			vista.getPr().getEciudad2().setText("");
			vista.getPr().getEtel2().setText("");
			vista.getPr().getEmail2().setText("");
			vista.getPf().CambiarImagen("");
			
			vista.getPd().getLista_nombres().addActionListener(this);
		}
		else if (comando.equals("LISTA2")){
			vista.getPd().getLista_nombres().removeItem(" ");
			String buscarNombre = (String) vista.getPd().getLista_nombres().getSelectedItem();
			
			if(!buscarNombre.equals(" ")) {
				// funcion buscar
				Persona encontrada = null;
				for(Persona x : datos.getDirectorio()) {
					if(x.getNombre().equals(buscarNombre)) {
						encontrada = x;
					}
				}
				//
				vista.getPr().getEnombre1().setVisible(true);
				vista.getPr().getEciudad1().setVisible(true);
				vista.getPr().getEtel1().setVisible(true);
				vista.getPr().getEmail1().setVisible(true);
				vista.getPr().getEnombre2().setText(encontrada.getNombre());
				vista.getPr().getEciudad2().setText(encontrada.getCiudad());
				vista.getPr().getEtel2().setText(encontrada.getTelefono());
				vista.getPr().getEmail2().setText(encontrada.getEmail());
				vista.getPf().CambiarImagen(encontrada.getArchivoFoto());
				vista.getPr().getBeliminar().setVisible(true);
			}
		}
		else if (comando.equals("AGREGAR")) {
			
			
		}
		
		else if (comando.equals("ELIMINAR")) {
			JOptionPane.showMessageDialog(null, "Esta seguro que desea eliminar a esta persona del programa?");
			vista.getPr().getEnombre1().setVisible(false);
			vista.getPr().getEciudad1().setVisible(false);
			vista.getPr().getEtel1().setVisible(false);
			vista.getPr().getEmail1().setVisible(false);
			vista.getPr().getEnombre2().setText("");
			vista.getPr().getEciudad2().setText("");
			vista.getPr().getEtel2().setText("");
			vista.getPr().getEmail2().setText("");
			vista.getPf().CambiarImagen("");
			// vista.getPd().getLista_nombres().removeItem( // el item en el que esta);
			// crear funcion de busqueda en publico
		}
	}
	
	
}





