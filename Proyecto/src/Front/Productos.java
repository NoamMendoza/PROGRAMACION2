package Front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Productos extends JFrame {

	private JPanel contentPane;
	private JTextField textProducto;
	private JTextField textCantidad;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
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
	public Productos() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Producto:");
		label.setFont(new Font("Agency FB", Font.PLAIN, 20));
		label.setBounds(36, 53, 62, 24);
		contentPane.add(label);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblCantidad.setBounds(36, 163, 62, 24);
		contentPane.add(lblCantidad);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblCategoria.setBounds(36, 198, 62, 24);
		contentPane.add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BEBIDAS", "CARNES", "FRUTAS Y VERDURAS", "CEREALES", "LACTEOS"}));
		comboBox.setBounds(108, 204, 110, 20);
		contentPane.add(comboBox);
		
		textProducto = new JTextField();
		textProducto.setBounds(108, 59, 110, 20);
		contentPane.add(textProducto);
		textProducto.setColumns(10);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(108, 169, 110, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblAdministradorDeProductos = new JLabel("ADMINISTRADOR DE PRODUCTOS");
		lblAdministradorDeProductos.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblAdministradorDeProductos.setBounds(206, 11, 188, 24);
		contentPane.add(lblAdministradorDeProductos);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblNombre.setBounds(36, 93, 62, 24);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblPrecio.setBounds(36, 128, 62, 24);
		contentPane.add(lblPrecio);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 134, 110, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 99, 110, 20);
		contentPane.add(textField_1);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setBounds(36, 277, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBackground(Color.WHITE);
		btnEditar.setBounds(155, 277, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(Color.WHITE);
		btnBorrar.setBounds(36, 323, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(155, 323, 89, 23);
		contentPane.add(btnLimpiar);
		
		table = new JTable();
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "NOMBRE", "CANTIDAD", "PRECIO", "CATEGORIA"
			}
		));
		table.setBounds(336, 93, 236, 230);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(531, 12, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblListaDeProductos = new JLabel("LISTA DE PRODUCTOS");
		lblListaDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeProductos.setFont(new Font("Agency FB", Font.PLAIN, 20));
		lblListaDeProductos.setBounds(363, 62, 188, 24);
		contentPane.add(lblListaDeProductos);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
