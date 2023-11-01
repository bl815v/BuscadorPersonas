package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelFoto extends JPanel{

	private JLabel etiqueta;
	
	public PanelFoto() {
		setLayout(new FlowLayout());
		setBackground(new Color(173, 255, 181));
		setBorder(new TitledBorder("Foto de la persona: "));
		setPreferredSize(new Dimension(300, 300));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		etiqueta = new JLabel();
		add(etiqueta);
		
			
	}
	
	public void CambiarImagen(String elemento) {
		if(elemento.equals(""))
			etiqueta.setIcon(null);
		else {
			ImageIcon Fotografia = new ImageIcon(getClass().getResource("/fotos/"+elemento+".jpg"));
			ImageIcon FotoAjustada = new ImageIcon(Fotografia.getImage().getScaledInstance(this.getWidth()-30, this.getHeight()-30, Image.SCALE_DEFAULT));
			etiqueta.setIcon(FotoAjustada);
		}
	}

	public JLabel getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

}
