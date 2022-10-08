package Front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Vendedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendedor frame = new Vendedor();
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
	public Vendedor() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(102, 102, 204));
		panel.setBounds(0, 0, 611, 381);
		contentPane.add(panel);
		
		JLabel lblVendedorId = new JLabel("Vendedor ID:");
		lblVendedorId.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblVendedorId.setBounds(36, 53, 89, 24);
		panel.add(lblVendedorId);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblGenero.setBounds(36, 170, 62, 24);
		panel.add(lblGenero);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO", "FEMENINO", "OTROS"}));
		comboBox.setBounds(152, 174, 110, 20);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(152, 57, 110, 20);
		panel.add(textField);
		
		JLabel lblAdministradorDeVendedores = new JLabel("ADMINISTRADOR DE VENDEDORES");
		lblAdministradorDeVendedores.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblAdministradorDeVendedores.setBounds(196, 7, 196, 24);
		panel.add(lblAdministradorDeVendedores);
		
		JLabel label_4 = new JLabel("Nombre:");
		label_4.setFont(new Font("Agency FB", Font.PLAIN, 20));
		label_4.setBounds(36, 93, 62, 24);
		panel.add(label_4);
		
		JLabel lblConstrasea = new JLabel("Constrase\u00F1a:");
		lblConstrasea.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblConstrasea.setBounds(36, 128, 89, 24);
		panel.add(lblConstrasea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 132, 110, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 97, 110, 20);
		panel.add(textField_3);
		
		JButton button = new JButton("Agregar");
		button.setBackground(Color.WHITE);
		button.setBounds(36, 277, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Editar");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(155, 277, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Borrar");
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(36, 323, 89, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Limpiar");
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(155, 323, 89, 23);
		panel.add(button_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "NOMBRE", "CONSTRASE\u00D1A", "GENERO"
			}
		));
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setBounds(336, 93, 236, 230);
		panel.add(table);
		
		JButton button_4 = new JButton("X");
		button_4.setFocusable(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorder(null);
		button_4.setBounds(531, 12, 89, 23);
		panel.add(button_4);
		
		JLabel lblListaDeVendedores = new JLabel("LISTA DE VENDEDORES");
		lblListaDeVendedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeVendedores.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblListaDeVendedores.setBounds(363, 62, 188, 24);
		panel.add(lblListaDeVendedores);
	}
}
