package co.edu.udistrital.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.Tema;
import co.edu.udistrital.view.VentanaAgregar;

public class ControlAgregar implements ActionListener{

	private VentanaAgregar vista;
	private Directorio datos;
	
	public ControlAgregar(Directorio libro) {
		vista = new VentanaAgregar();
		datos = libro;
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPa().getLista_genero().addActionListener(this);
		vista.getPa().getBagregar().addActionListener(this);
		vista.getPa().getBeliminar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("LISTAGENERO")) {
			vista.getPa().getLista_genero().removeItem(" ");
			String buscarGenero = (String) vista.getPa().getLista_genero().getSelectedItem();
			//T e m a s
			int[] colorFondo = Tema.colorFondo(buscarGenero);
			vista.getContentPane().setBackground(new Color(colorFondo[0], colorFondo[1], colorFondo[2]));
			int[] colorPa = Tema.colorPanel(buscarGenero);
			vista.getPa().setBackground(new Color(colorPa[0], colorPa[1], colorPa[2]));
		}
		else if (comando.equals("AGREGARPERSONA")) {
			String nomb = vista.getPa().getCnombre().getText();
			String gene = (String) vista.getPa().getLista_genero().getSelectedItem();
			String city = vista.getPa().getCciudad().getText();
			String tel = vista.getPa().getCtel().getText();
			String mail = vista.getPa().getCmail().getText();
			String foto = vista.getPa().getCfoto().getText();
			if(!nomb.equals("") && !gene.equals("") && !city.equals("") && !tel.equals("") && !mail.equals("") && !foto.equals("")){
				Persona x = new Persona(nomb, gene, city, tel, mail, foto);
				datos.agregarPersona(x);	
				vista.dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "Faltan datos por rellenar!", "FALTAN DATOS", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		else if(comando.equals("CANCELAR")) {
			Object[] opciones = {"Si, estoy seguro", "No, cancelar"}; 
			int opcion = JOptionPane.showOptionDialog(null, "Sus datos no se guardaran. Esta seguro que desea salir?", 
					"No agregar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[1]); 
			
			if(opcion == JOptionPane.YES_OPTION) {
				vista.dispose();
			}
		}
	}
	
	
}
