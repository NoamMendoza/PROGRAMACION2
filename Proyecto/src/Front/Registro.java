package Front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 102));
		panel.setBounds(0, 0, 136, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("DOLOR");
		label.setBounds(10, 94, 64, 25);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(label);
		
		JLabel label_1 = new JLabel("SUFRIMIENTO");
		label_1.setBounds(10, 124, 125, 25);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(label_1);
		
		JLabel lblDolor = new JLabel("AMSIEDA");
		lblDolor.setBounds(10, 154, 82, 25);
		lblDolor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblDolor);
		
		JLabel imagen = new JLabel("New label");
		imagen.setBounds(10, 11, 116, 72);
		panel.add(imagen);
		ImageIcon foto = new ImageIcon("C://Users//noama//OneDrive//Escritorio//arreglos//logo.png");
		ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),
				imagen.getHeight(), Image.SCALE_DEFAULT));
			    imagen.setIcon(icono);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 102, 204));
		panel_1.setBounds(135, 0, 315, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(129, 5, 57, 25);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(161, 132, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 163, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ADMIN", "VENDEDOR"}));
		comboBox.setBounds(161, 79, 86, 20);
		panel_1.add(comboBox);
		
		JLabel lblRol = new JLabel("Seleccione Rol");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRol.setBounds(29, 71, 109, 25);
		panel_1.add(lblRol);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setBounds(29, 127, 109, 25);
		panel_1.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContrasea.setBounds(29, 158, 109, 25);
		panel_1.add(lblContrasea);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBorder(null);
		btnLogin.setBounds(49, 238, 89, 23);
		panel_1.add(btnLogin);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBorder(null);
		btnBorrar.setBounds(180, 238, 89, 23);
		panel_1.add(btnBorrar);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(Color.MAGENTA);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnX.setFocusable(false);
		btnX.setContentAreaFilled(false);
		btnX.setBorderPainted(false);
		btnX.setBorder(null);
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(266, 10, 39, 23);
		panel_1.add(btnX);
	}
}
