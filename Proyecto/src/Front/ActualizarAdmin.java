package Front;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ActualizarAdmin extends JFrame {

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
					ActualizarAdmin frame = new ActualizarAdmin();
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
	public ActualizarAdmin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblActualizarAdministrador = new JLabel("Actualizar Administrador");
		lblActualizarAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblActualizarAdministrador.setBounds(159, 11, 124, 14);
		contentPane.add(lblActualizarAdministrador);
		
		JLabel lblProdid = new JLabel("PRODID:");
		lblProdid.setBounds(92, 50, 46, 14);
		contentPane.add(lblProdid);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(92, 111, 46, 14);
		contentPane.add(lblNombre);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(Color.WHITE);
		btnActualizar.setBounds(79, 199, 89, 23);
		contentPane.add(btnActualizar);
		
		textField = new JTextField();
		textField.setBounds(174, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 108, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(235, 199, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnX.setContentAreaFilled(false);
		btnX.setFocusable(false);
		btnX.setBounds(308, 7, 89, 23);
		contentPane.add(btnX);
	}
}
