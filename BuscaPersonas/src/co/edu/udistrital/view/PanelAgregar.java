package co.edu.udistrital.view;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAgregar extends JPanel{

	private JLabel eblanco;
	private JLabel enombre, egenero, eciudad, etel, email, efoto;
	private JTextField cnombre, cciudad, ctel, cmail, cfoto;
	private JComboBox<String> lista_genero;
	private JButton bagregar, beliminar;

	public PanelAgregar() {
		setLayout(new GridLayout(8,2, 0, 10));
		setBackground(new Color(128, 128, 128));
		setBorder(new TitledBorder("Modulo de informacion para agregar"));
		
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		eblanco = new JLabel();
		add(eblanco);
		eblanco = new JLabel();
		add(eblanco);
		
		enombre = new JLabel("Escriba el nombre: ");
		add(enombre);
		cnombre = new JTextField();
		add(cnombre);
		
		egenero = new JLabel("Seleccione el genero: ");
		add(egenero);
		
		lista_genero = new JComboBox<String>();
		lista_genero.addItem(" ");
		lista_genero.addItem("Femenino");
		lista_genero.addItem("Masculino");
		lista_genero.addItem("Otro");
		lista_genero.setActionCommand("LISTAGENERO");
		add(lista_genero);
		
		eciudad = new JLabel("Escriba la ciudad: ");
		add(eciudad);
		cciudad = new JTextField();
		add(cciudad);
		
		etel = new JLabel("Digite el numero de telefono: ");
		add(etel);
		ctel = new JTextField();
		add(ctel);
		
		email = new JLabel("Escriba el email: ");
		add(email);
		cmail = new JTextField();
		add(cmail);
		
		efoto = new JLabel("Nombre del archivo de la foto (sin la extension): ");
		add(efoto);
		cfoto = new JTextField();
		add(cfoto);
		
		bagregar = new JButton("Agregar");
		bagregar.setBackground(new Color(37, 230, 120));
		bagregar.setActionCommand("AGREGARPERSONA");
		add(bagregar);
		
		beliminar = new JButton("Cancelar");
		beliminar.setBackground(new Color(247, 112, 96));
		beliminar.setActionCommand("CANCELAR");
		add(beliminar);

	}

	public JLabel getEblanco() {
		return eblanco;
	}

	public void setEblanco(JLabel eblanco) {
		this.eblanco = eblanco;
	}

	public JLabel getEnombre() {
		return enombre;
	}

	public void setEnombre(JLabel enombre) {
		this.enombre = enombre;
	}

	public JLabel getEgenero() {
		return egenero;
	}

	public void setEgenero(JLabel egenero) {
		this.egenero = egenero;
	}

	public JLabel getEciudad() {
		return eciudad;
	}

	public void setEciudad(JLabel eciudad) {
		this.eciudad = eciudad;
	}

	public JLabel getEtel() {
		return etel;
	}

	public void setEtel(JLabel etel) {
		this.etel = etel;
	}

	public JLabel getEmail() {
		return email;
	}

	public void setEmail(JLabel email) {
		this.email = email;
	}

	public JLabel getEfoto() {
		return efoto;
	}

	public void setEfoto(JLabel efoto) {
		this.efoto = efoto;
	}

	public JTextField getCnombre() {
		return cnombre;
	}

	public void setCnombre(JTextField cnombre) {
		this.cnombre = cnombre;
	}

	public JTextField getCciudad() {
		return cciudad;
	}

	public void setCciudad(JTextField cciudad) {
		this.cciudad = cciudad;
	}

	public JTextField getCtel() {
		return ctel;
	}

	public void setCtel(JTextField ctel) {
		this.ctel = ctel;
	}

	public JTextField getCmail() {
		return cmail;
	}

	public void setCmail(JTextField cmail) {
		this.cmail = cmail;
	}

	public JTextField getCfoto() {
		return cfoto;
	}

	public void setCfoto(JTextField cfoto) {
		this.cfoto = cfoto;
	}

	public JComboBox<String> getLista_genero() {
		return lista_genero;
	}

	public void setLista_genero(JComboBox<String> lista_genero) {
		this.lista_genero = lista_genero;
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
