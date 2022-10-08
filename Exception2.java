package Competencia5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Exception2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exception2 frame = new Exception2();
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
	public Exception2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero 1");
		lblNumero.setBounds(117, 70, 46, 14);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2");
		lblNumero_1.setBounds(117, 119, 46, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(117, 179, 53, 14);
		contentPane.add(lblResultado);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(247, 67, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(247, 116, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setBounds(247, 176, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DecimalFormat decimal = new DecimalFormat("0.00");
				int num1=0, num2=0,total=0;
				
				if(txtNum1.getText().equals("")||txtNum2.getText().equals("")){
					JOptionPane.showMessageDialog(null, "La casilla esta vacia");
					txtNum1.requestFocus();
				}else{
					try{
						num1 = Integer.parseInt(txtNum1.getText());
						num2 = Integer.parseInt(txtNum2.getText());
						
						total=num1/num2;
						
						txtTotal.setText(decimal.format(total));
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null,"Ingrese valor valido");
						txtNum1.setText("");
						txtNum2.setText("");
						txtTotal.setText("");
						txtNum1.requestFocus();
						
						
					}catch(ArithmeticException e){
						JOptionPane.showMessageDialog(null,"No se puede dividir entre 0");
						txtNum1.setText("");
						txtNum2.setText("");
						txtTotal.setText("");
						txtNum1.requestFocus();
						
					}
				}
				
				
			}
		});
		btnCalcular.setBounds(30, 207, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNum1.setText("");
				txtNum1.requestFocus();
				txtNum2.setText("");
				txtTotal.setText("");
				
			}
		});
		btnNuevo.setBounds(172, 207, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu_Excepciones m = new Menu_Excepciones();
				m.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(302, 207, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblDivision = new JLabel("DIVISION");
		lblDivision.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDivision.setBackground(new Color(255, 255, 255));
		lblDivision.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivision.setBounds(115, 11, 197, 34);
		contentPane.add(lblDivision);
	}
}
