package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelFoto extends JPanel {

    private JLabel etiqueta;

    public PanelFoto() {
        setLayout(new FlowLayout());
        setBackground(new Color(128, 128, 128));
        setBorder(new TitledBorder("Foto de la persona: "));

        inicializarComponentes();
        setVisible(true);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                adaptarImagen();
            }
        });
    }

    public void inicializarComponentes() {
        etiqueta = new JLabel();
        add(etiqueta);
    }

    public void CambiarImagen(String elemento) {
        if (!elemento.equals("")) {
        	ImageIcon Fotografia = new ImageIcon(getClass().getResource("/co/edu/udistrital/fotos/" + elemento + ".jpg"));
            etiqueta.setIcon(Fotografia);
            adaptarImagen();
        } else {
            etiqueta.setIcon(null);
        }
    }

    private void adaptarImagen() {
        if (etiqueta.getIcon() != null) {
            int panelWidth = getWidth() - 30;
            int panelHeight = getHeight() - 30;
            ImageIcon imagen = (ImageIcon) etiqueta.getIcon();
            Image img = imagen.getImage();
            ImageIcon imagenAjustada = new ImageIcon(img.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH));
            etiqueta.setIcon(imagenAjustada);
        }
        else {
        	etiqueta.setIcon(null);
        }
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }
}
