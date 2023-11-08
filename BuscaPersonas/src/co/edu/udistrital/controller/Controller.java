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
	private ControlAgregar vAgregar;
	private Directorio datos;
	private String buscarNombre;
	
	public Controller() {
		vista = new VentanaPrincipal();
		datos = new Directorio();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPd().getLista_genero().addActionListener(this);
		vista.getPr().getBeliminar().addActionListener(this);
		vista.getPr().getBagregar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("LISTA1")) {
			vista.getPd().getLista_genero().removeItem("Buscar...");
			vista.getPd().getLista_nombres().removeActionListener(this);
			vista.getPd().getLista_nombres().removeAllItems();
			vista.getPr().getBeliminar().setVisible(false);
		
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
			
			campoVacio();
			
			vista.getPd().getLista_nombres().addActionListener(this);
		}
		else if (comando.equals("LISTA2")){
			vista.getPd().getLista_nombres().removeItem(" ");
			buscarNombre = (String) vista.getPd().getLista_nombres().getSelectedItem();
				
			try {
				if(!buscarNombre.equals(" ")) {
					vista.getPr().getEnombre1().setVisible(true);
					vista.getPr().getEciudad1().setVisible(true);
					vista.getPr().getEtel1().setVisible(true);
					vista.getPr().getEmail1().setVisible(true);
					vista.getPr().getBeliminar().setVisible(true);
					vista.getPr().getEnombre2().setText(buscarPersona().getNombre());
					vista.getPr().getEciudad2().setText(buscarPersona().getCiudad());
					vista.getPr().getEtel2().setText(buscarPersona().getTelefono());
					vista.getPr().getEmail2().setText(buscarPersona().getEmail());
					try {
						vista.getPf().CambiarImagen(buscarPersona().getArchivoFoto());
					}catch (NullPointerException y) {
						vista.getPf().getEtiqueta().setIcon(null);
						vista.getPf().getEtiqueta().setText("No se encontro la foto, revise si el arhivo " +buscarPersona().getArchivoFoto()+ ".jpg esta en la carpeta");;
					}
				}
			}
			catch (NullPointerException w){
				campoVacio();
				vista.getPr().getBeliminar().setVisible(false);	
			}
		}
		else if (comando.equals("AGREGAR")) {
			vAgregar = new ControlAgregar(datos);
		}
		
		else if (comando.equals("ELIMINAR")) {
			Object[] opciones = {"Si, estoy seguro", "No, cancelar"}; 
			int opcion = JOptionPane.showOptionDialog(null, "Esta seguro que desea eliminar a esta persona del programa?", 
					"Eliminar persona", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]); 
			
			if(opcion == JOptionPane.YES_OPTION) {
			campoVacio();
			String temp = buscarPersona().getNombre();
			datos.getDirectorio().remove(buscarPersona());
			vista.getPd().getLista_nombres().removeItem(temp);
			}
		}
	}
	
	private void campoVacio() {
		vista.getPr().getEnombre1().setVisible(false);
		vista.getPr().getEciudad1().setVisible(false);
		vista.getPr().getEtel1().setVisible(false);
		vista.getPr().getEmail1().setVisible(false);
		vista.getPr().getEnombre2().setText("");
		vista.getPr().getEciudad2().setText("");
		vista.getPr().getEtel2().setText("");
		vista.getPr().getEmail2().setText("");
		vista.getPf().CambiarImagen("");
	}
	
	private Persona buscarPersona() {
		Persona encontrada = null;
		for(Persona x : datos.getDirectorio()) {
			if(x.getNombre().equals(buscarNombre)) {
				encontrada = x;
			}
		}
		return encontrada;
	}
	
	
}
