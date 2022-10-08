package Competencia5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Exception1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSueldo;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exception1 frame = new Exception1();
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
	public Exception1() {
		setTitle("CALCULADORA DE SUELDO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 222);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(122, 52, 148, 20);
		contentPane.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(122, 117, 148, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSueldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSueldo.setBounds(36, 52, 64, 14);
		contentPane.add(lblSueldo);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(20, 117, 92, 14);
		contentPane.add(lblTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(Color.WHITE);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					DecimalFormat decimal = new DecimalFormat("0.00");
				double sueldo = 0, total = 0;
				if(txtSueldo.getText().equals("")){
					JOptionPane.showMessageDialog(null, "La casilla esta vacia");
					txtSueldo.requestFocus();
				}else{
					try{
				sueldo = Double.parseDouble(txtSueldo.getText());
				
				if(sueldo>10000){
					total=sueldo*1.1;
				}else{
					total=sueldo*1.12;
				}
				txtTotal.setText("$"+decimal.format(total));
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, txtSueldo.getText()+" no es un sueldo valido");
					txtSueldo.setText("");
					txtSueldo.requestFocus();
				}catch(ArithmeticException e){
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
					txtSueldo.setText("");
					txtSueldo.requestFocus();
				}
				}
				
				
				
				
				
				
			}
		});
		btnCalcular.setBounds(306, 51, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtSueldo.setText("");
				txtSueldo.requestFocus();
				
				txtTotal.setText("");
				txtTotal.requestFocus();
			}
		});
		btnNuevo.setBounds(306, 85, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu_Excepciones m = new Menu_Excepciones();
				m.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(306, 116, 89, 23);
		contentPane.add(btnSalir);
	}
}
