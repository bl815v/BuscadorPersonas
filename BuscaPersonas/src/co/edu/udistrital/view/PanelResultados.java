package co.edu.udistrital.view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{

	private JLabel eblanco;
	private JLabel enombre1, enombre2;
	private JLabel eciudad1, eciudad2;
	private JLabel etel1, etel2;
	private JLabel email1, email2;
	private JButton bagregar, beliminar;
	
	public PanelResultados() {
		setLayout(new GridLayout(8,2));
		setBackground(new Color(128, 128, 128));
		setBorder(new TitledBorder("Modulo de informacion"));
		setPreferredSize(new Dimension(400, 300));
		
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		eblanco = new JLabel();
		add(eblanco);
		eblanco = new JLabel();
		add(eblanco);
		eblanco = new JLabel();
		add(eblanco);
		eblanco = new JLabel();
		add(eblanco);
		
		enombre1 = new JLabel("Nombre: ");
		add(enombre1);
		enombre1.setVisible(false);
		enombre2 = new JLabel();
		add(enombre2);
		
		eciudad1 = new JLabel("Ciudad: ");
		add(eciudad1);
		eciudad1.setVisible(false);
		eciudad2 = new JLabel();
		add(eciudad2);
		
		etel1 = new JLabel("Telefono: ");
		add(etel1);
		etel1.setVisible(false);
		etel2 = new JLabel();
		add(etel2);
		
		email1 = new JLabel("Email: ");
		add(email1);
		email1.setVisible(false);
		email2 = new JLabel();
		add(email2);
		
		
		eblanco = new JLabel();
		add(eblanco);
		eblanco = new JLabel();
		add(eblanco);
		
		bagregar = new JButton("Agregar persona");
		bagregar.setBackground(new Color(37, 230, 120));
		bagregar.setActionCommand("AGREGAR");
		add(bagregar);
		
		beliminar = new JButton("Eliminar persona");
		beliminar.setBackground(new Color(247, 112, 96));
		beliminar.setActionCommand("ELIMINAR");
		beliminar.setVisible(false);
		add(beliminar);

	}

	public JLabel getEblanco() {
		return eblanco;
	}

	public void setEblanco(JLabel eblanco) {
		this.eblanco = eblanco;
	}

	public JLabel getEnombre1() {
		return enombre1;
	}

	public void setEnombre1(JLabel enombre1) {
		this.enombre1 = enombre1;
	}

	public JLabel getEnombre2() {
		return enombre2;
	}

	public void setEnombre2(JLabel enombre2) {
		this.enombre2 = enombre2;
	}

	public JLabel getEciudad1() {
		return eciudad1;
	}

	public void setEciudad1(JLabel eciudad1) {
		this.eciudad1 = eciudad1;
	}

	public JLabel getEciudad2() {
		return eciudad2;
	}

	public void setEciudad2(JLabel eciudad2) {
		this.eciudad2 = eciudad2;
	}

	public JLabel getEtel1() {
		return etel1;
	}

	public void setEtel1(JLabel etel1) {
		this.etel1 = etel1;
	}

	public JLabel getEtel2() {
		return etel2;
	}

	public void setEtel2(JLabel etel2) {
		this.etel2 = etel2;
	}

	public JLabel getEmail1() {
		return email1;
	}

	public void setEmail1(JLabel email1) {
		this.email1 = email1;
	}

	public JLabel getEmail2() {
		return email2;
	}

	public void setEmail2(JLabel email2) {
		this.email2 = email2;
	}

	public JButton getBagregar() {
		return bagregar;
	}

	public void setBagregar(JButton bagregar) {
		this.bagregar = bagregar;
	}

	public JButton getBeliminar() {
		return beliminar;
	}

	public void setBeliminar(JButton beliminar) {
		this.beliminar = beliminar;
	}

}
