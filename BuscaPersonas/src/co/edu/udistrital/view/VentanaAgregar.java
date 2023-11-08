package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaAgregar extends JFrame{

	private PanelAgregar pa;
	private JLabel eblanco;
	public VentanaAgregar() {
		setTitle("Agregar persona");
		setSize(600, 400);
		getContentPane().setBackground(new Color(105, 105, 105));
		getContentPane().setLayout(new BorderLayout(10, 10));
		
		inicializarComponentes();
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		eblanco = new JLabel("");
		getContentPane().add(eblanco, BorderLayout.NORTH);
		eblanco = new JLabel("");
		getContentPane().add(eblanco, BorderLayout.WEST);
		eblanco = new JLabel("");
		getContentPane().add(eblanco, BorderLayout.EAST);
		eblanco = new JLabel("");
		getContentPane().add(eblanco, BorderLayout.SOUTH);
		
		pa = new PanelAgregar();
		getContentPane().add(pa, BorderLayout.CENTER);
	}

	public PanelAgregar getPa() {
		return pa;
	}

	public void setPa(PanelAgregar pa) {
		this.pa = pa;
	}
	
}
