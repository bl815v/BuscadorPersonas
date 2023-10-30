package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelDatos pd;
	private PanelResultados pr;
	private PanelFoto pf;
	
	public VentanaPrincipal() {
		setTitle("Buscador de personas");
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(89, 46, 46));
		getContentPane().setLayout(new BorderLayout(10,10));
		
		inicializarComponentes();
		
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		pd = new PanelDatos();
		getContentPane().add(pd, BorderLayout.NORTH);
		
		pr = new PanelResultados();
		getContentPane().add(pr, BorderLayout.WEST);
		

		pf = new PanelFoto();
		getContentPane().add(pf, BorderLayout.CENTER);
	}

	public PanelDatos getPd() {
		return pd;
	}

	public void setPd(PanelDatos pd) {
		this.pd = pd;
	}

	public PanelResultados getPr() {
		return pr;
	}

	public void setPr(PanelResultados pr) {
		this.pr = pr;
	}

	public PanelFoto getPf() {
		return pf;
	}

	public void setPf(PanelFoto pf) {
		this.pf = pf;
	}

	
}
