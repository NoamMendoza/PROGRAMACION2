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
import javax.swing.table.DefaultTableModel;

public class Categoria extends JFrame {

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
					Categoria frame = new Categoria();
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
	public Categoria() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(102, 102, 204));
		panel.setBounds(0, 0, 630, 426);
		contentPane.add(panel);
		
		JLabel lblCatid = new JLabel("CATID:");
		lblCatid.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblCatid.setBounds(40, 120, 62, 24);
		panel.add(lblCatid);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 126, 110, 20);
		panel.add(textField);
		
		JLabel label_3 = new JLabel("ADMINISTRADOR DE PRODUCTOS");
		label_3.setFont(new Font("Agency FB", Font.PLAIN, 20));
		label_3.setBounds(206, 11, 188, 24);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Nombre:");
		label_4.setFont(new Font("Agency FB", Font.PLAIN, 20));
		label_4.setBounds(40, 160, 62, 24);
		panel.add(label_4);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblDescripcion.setBounds(40, 195, 80, 24);
		panel.add(lblDescripcion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 201, 110, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 166, 110, 20);
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
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"ID", "NOMBRE", "DESCRIPCION"
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
		
		JLabel lblListaDeCategorias = new JLabel("LISTA DE CATEGORIAS");
		lblListaDeCategorias.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeCategorias.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblListaDeCategorias.setBounds(363, 62, 188, 24);
		panel.add(lblListaDeCategorias);
	}

}
