package Competencia5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Menu_Excepciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Excepciones frame = new Menu_Excepciones();
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
	public Menu_Excepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXCEPTIONS");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
		lblNewLabel.setBounds(119, 11, 228, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNumberformat = new JButton("NumberFormat");
		btnNumberformat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exception1 m = new Exception1();
				m.setVisible(true);
				dispose();
			}
		});
		btnNumberformat.setForeground(new Color(0, 0, 0));
		btnNumberformat.setBounds(23, 72, 191, 23);
		contentPane.add(btnNumberformat);
		
		JButton btnAritmeticexception = new JButton("AritmeticException");
		btnAritmeticexception.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exception2 m = new Exception2();
				m.setVisible(true);
				dispose();
			}
		});
		btnAritmeticexception.setForeground(new Color(0, 0, 0));
		btnAritmeticexception.setBounds(234, 72, 170, 23);
		contentPane.add(btnAritmeticexception);
		
		JButton btnArrayindex = new JButton("ArrayIndexOutOfBounds");
		btnArrayindex.setForeground(new Color(0, 0, 0));
		btnArrayindex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Exception3_1 m = new Exception3_1();
				m.setVisible(true);
				dispose();
			}
		});
		btnArrayindex.setBounds(119, 145, 200, 23);
		contentPane.add(btnArrayindex);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
	}
}
