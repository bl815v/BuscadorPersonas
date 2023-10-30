package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel egenero;
	private JLabel enombre;
	private JComboBox<String> lista_genero;
	private JComboBox<String> lista_nombres;
	
	
	
	public PanelDatos() {
		setLayout(new GridLayout(1, 4));
		setBackground(new Color(199, 145, 141));
		setBorder(new TitledBorder("Modulo de datos "));
		setPreferredSize(new Dimension(100, 50));
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		egenero = new JLabel("Genero a buscar: ");
		add(egenero);
		
		lista_genero = new JComboBox<String>();
		lista_genero.addItem("Femenino");
		lista_genero.addItem("Masculino");
		lista_genero.addItem("Otro");
		lista_genero.setActionCommand("LISTA1");
		add(lista_genero);
		
		enombre = new JLabel("Nombres de las personas: ");
		add(enombre);
		
		lista_nombres = new JComboBox<String>();
		lista_nombres.setActionCommand("LISTA2");
		add(lista_nombres);
		
		
	}

	public JLabel getEgenero() {
		return egenero;
	}

	public void setEgenero(JLabel egenero) {
		this.egenero = egenero;
	}

	public JLabel getEnombre() {
		return enombre;
	}

	public void setEnombre(JLabel enombre) {
		this.enombre = enombre;
	}

	public JComboBox<String> getLista_genero() {
		return lista_genero;
	}

	public void setLista_genero(JComboBox<String> lista_genero) {
		this.lista_genero = lista_genero;
	}

	public JComboBox<String> getLista_nombres() {
		return lista_nombres;
	}

	public void setLista_nombres(JComboBox<String> lista_nombres) {
		this.lista_nombres = lista_nombres;
	}


}
