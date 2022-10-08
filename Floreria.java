package Competencia5;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import Competencia5.Total;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Floreria extends JFrame {

	int ch,m,g,gl,tar,dom;
	
	private JPanel contentPane;
	private JTextField textNombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Floreria frame = new Floreria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Floreria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFloreriaOrquidea = new JLabel("Floreria Orquidea");
		lblFloreriaOrquidea.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 25));
		lblFloreriaOrquidea.setBounds(169, 6, 217, 34);
		contentPane.add(lblFloreriaOrquidea);
		
		JLabel lblNombreDeCliente = new JLabel("Nombre de cliente:");
		lblNombreDeCliente.setBounds(25, 54, 91, 14);
		contentPane.add(lblNombreDeCliente);
		
		textNombre = new JTextField();
		textNombre.setBounds(158, 51, 308, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblArreglo = new JLabel("Arreglo:");
		lblArreglo.setBounds(37, 106, 46, 14);
		contentPane.add(lblArreglo);
		
		JLabel lbltarjeta = new JLabel("New label");
		lbltarjeta.setBounds(340, 262, 46, 14);
		contentPane.add(lbltarjeta);
		
		JCheckBox tarjeta = new JCheckBox("Tarjeta");
		tarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tarjeta.isSelected()==true){
					tar = 10;
					lbltarjeta.setText("$"+tar);
				}else{
					tar = 0;
					lbltarjeta.setText("$"+tar);
				}
			}
		});
		tarjeta.setBackground(Color.ORANGE);
		tarjeta.setBounds(187, 258, 97, 23);
		contentPane.add(tarjeta);
		
		JLabel lblglobo = new JLabel("New label");
		lblglobo.setBounds(340, 284, 46, 14);
		contentPane.add(lblglobo);
		
		JCheckBox globo = new JCheckBox("Globo");
		globo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(globo.isSelected()==true){
					gl = 10;
					lblglobo.setText("$"+gl);
				}else{
					gl = 0;
					lblglobo.setText("$"+gl);
				}
			}
		});
		globo.setBackground(Color.ORANGE);
		globo.setBounds(187, 280, 97, 23);
		contentPane.add(globo);
		
		JLabel lblentrega = new JLabel("New label");
		lblentrega.setBounds(340, 307, 46, 14);
		contentPane.add(lblentrega);
		
		JCheckBox entrega = new JCheckBox("Entrega a domicilio");
		entrega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(entrega.isSelected()==true){
					dom = 10;
					lblentrega.setText("$"+dom);
				}else{
					dom = 0;
					lblentrega.setText("$"+dom);
				}
			}
		});
		entrega.setBackground(Color.ORANGE);
		entrega.setBounds(187, 303, 115, 23);
		contentPane.add(entrega);
		
		JLabel imagen = new JLabel("New label");
		imagen.setBounds(300, 106, 180, 145);
		contentPane.add(imagen);
		
		JComboBox arreglo = new JComboBox();
		arreglo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (arreglo.getSelectedItem().equals("LILIS")){
					ImageIcon foto = new ImageIcon("C://Users//noama//OneDrive//Escritorio//arreglos//lilis.jpg");
					ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),
							imagen.getHeight(), Image.SCALE_DEFAULT));
						    imagen.setIcon(icono);
				
				}
				if (arreglo.getSelectedItem().equals("LIRIOS")){
					ImageIcon foto = new ImageIcon("C://Users//noama//OneDrive//Escritorio//arreglos//lirios.jpg");
					ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),
							imagen.getHeight(), Image.SCALE_DEFAULT));
						    imagen.setIcon(icono);
				
				}
				if (arreglo.getSelectedItem().equals("ROMANTICO")){
					ImageIcon foto = new ImageIcon("C://Users//noama//OneDrive//Escritorio//arreglos//romantico.jpg");
					ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),
							imagen.getHeight(), Image.SCALE_DEFAULT));
						    imagen.setIcon(icono);
				
				}
				if (arreglo.getSelectedItem().equals("ROSAS")){
					ImageIcon foto = new ImageIcon("C://Users//noama//OneDrive//Escritorio//arreglos//rosas.jpg");
					ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),
							imagen.getHeight(), Image.SCALE_DEFAULT));
						    imagen.setIcon(icono);
				
				}
			}
		});
		arreglo.setModel(new DefaultComboBoxModel(new String[] {"LILIS", "LIRIOS", "ROMANTICO", "ROSAS"}));
		arreglo.setBounds(158, 103, 103, 20);
		contentPane.add(arreglo);
		
		JLabel lblPrecio = new JLabel("New label");
		lblPrecio.setBounds(114, 284, 46, 14);
		contentPane.add(lblPrecio);
		
		JRadioButton chico = new JRadioButton("Chico");
		chico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arreglo.getSelectedItem().equals("LILIS")){
					ch = 100;
					lblPrecio.setText("$"+ch);
				}
				if(arreglo.getSelectedItem().equals("LIRIOS")){
					ch = 110;
					lblPrecio.setText("$"+ch);
				}
				if(arreglo.getSelectedItem().equals("ROMANTICO")){
					ch = 120;
					lblPrecio.setText("$"+ch);
				}
				if(arreglo.getSelectedItem().equals("ROSAS")){
					ch = 130;
					lblPrecio.setText("$"+ch);
				}
			}
		});
		buttonGroup.add(chico);
		chico.setBackground(Color.ORANGE);
		chico.setBounds(25, 258, 57, 23);
		contentPane.add(chico);
		
		JRadioButton mediano = new JRadioButton("Mediano");
		mediano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arreglo.getSelectedItem().equals("LILIS")){
					m = 200;
					lblPrecio.setText("$"+m);
				}
				if(arreglo.getSelectedItem().equals("LIRIOS")){
					m = 210;
					lblPrecio.setText("$"+m);
				}
				if(arreglo.getSelectedItem().equals("ROMANTICO")){
					m = 220;
					lblPrecio.setText("$"+m);
				}
				if(arreglo.getSelectedItem().equals("ROSAS")){
					m = 230;
					lblPrecio.setText("$"+m);
				}
			}
		});
		buttonGroup.add(mediano);
		mediano.setBackground(Color.ORANGE);
		mediano.setBounds(25, 280, 65, 23);
		contentPane.add(mediano);
		
		JRadioButton grande = new JRadioButton("Grande");
		grande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(arreglo.getSelectedItem().equals("LILIS")){
					g = 300;
					lblPrecio.setText("$"+g);
				}
				if(arreglo.getSelectedItem().equals("LIRIOS")){
					g = 310;
					lblPrecio.setText("$"+g);
				}
				if(arreglo.getSelectedItem().equals("ROMANTICO")){
					g = 320;
					lblPrecio.setText("$"+g);
				}
				if(arreglo.getSelectedItem().equals("ROSAS")){
					g = 330;
					lblPrecio.setText("$"+g);
				}
			}
		});
		buttonGroup.add(grande);
		grande.setBackground(Color.ORANGE);
		grande.setBounds(25, 303, 75, 23);
		contentPane.add(grande);
		
		JButton btnPagar = new JButton("PAGAR");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int otros, to=0;
				Total t = new Total();
				t.setVisible(true);
				
				Total.textCliente.setText(textNombre.getText());
				Total.textPrecio.setText(lblPrecio.getText());
				otros = tar + gl + dom;
				Total.textOtros.setText("$"+otros);
				
				to=Integer.parseInt(Total.textPrecio.getText().substring(1))+Integer.parseInt(Total.textOtros.getText().substring(1));
				
				Total.textTotal.setText("$"+to);
			}
		});
		btnPagar.setBounds(417, 280, 89, 23);
		contentPane.add(btnPagar);
	}
}
