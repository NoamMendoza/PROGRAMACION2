package Competencia5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Total extends JFrame {

	
	private JPanel contentPane;
	static JTextField textCliente;
	static JTextField textPrecio;
	static JTextField textOtros;
	static JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Total frame = new Total();
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
	public Total() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDelCliente = new JLabel("Nombre Del Cliente");
		lblNombreDelCliente.setFont(new Font("The Breakdown", Font.PLAIN, 15));
		lblNombreDelCliente.setBounds(53, 25, 100, 14);
		contentPane.add(lblNombreDelCliente);
		
		JLabel lblPrecioDelArreglo = new JLabel("Precio Del Arreglo");
		lblPrecioDelArreglo.setFont(new Font("The Breakdown", Font.PLAIN, 15));
		lblPrecioDelArreglo.setBounds(53, 80, 100, 14);
		contentPane.add(lblPrecioDelArreglo);
		
		JLabel lblOtros = new JLabel("Otros");
		lblOtros.setFont(new Font("The Breakdown", Font.PLAIN, 15));
		lblOtros.setBounds(53, 128, 46, 14);
		contentPane.add(lblOtros);
		
		JLabel lblTotalAPagar = new JLabel("Total A Pagar");
		lblTotalAPagar.setFont(new Font("The Breakdown", Font.PLAIN, 15));
		lblTotalAPagar.setBounds(53, 178, 83, 14);
		contentPane.add(lblTotalAPagar);
		
		textCliente = new JTextField();
		textCliente.setBounds(187, 22, 207, 20);
		contentPane.add(textCliente);
		textCliente.setColumns(10);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(187, 77, 207, 20);
		contentPane.add(textPrecio);
		
		textOtros = new JTextField();
		textOtros.setColumns(10);
		textOtros.setBounds(187, 128, 207, 20);
		contentPane.add(textOtros);
		
		textTotal = new JTextField();
		textTotal.setColumns(10);
		textTotal.setBounds(187, 175, 207, 20);
		contentPane.add(textTotal);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
	}

}
