package Competencia5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
public class Exception3 extends JFrame {

	private JPanel contentPane;
	private JTextField textTamaño;
	private JTextField textValores;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exception3 frame = new Exception3();
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
	public Exception3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVectores = new JLabel("Vectores");
		lblVectores.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblVectores.setHorizontalAlignment(SwingConstants.CENTER);
		lblVectores.setBounds(164, 11, 96, 42);
		contentPane.add(lblVectores);
		
		JLabel lblTamao = new JLabel("Valores");
		lblTamao.setHorizontalAlignment(SwingConstants.CENTER);
		lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTamao.setBounds(30, 113, 65, 28);
		contentPane.add(lblTamao);
		
		JLabel label = new JLabel("Tama\u00F1o");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(30, 64, 65, 28);
		contentPane.add(label);
		
		textTamaño = new JTextField();
		textTamaño.setBounds(131, 70, 139, 20);
		contentPane.add(textTamaño);
		textTamaño.setColumns(10);
		
		textValores = new JTextField();
		textValores.setText("");
		textValores.setBounds(131, 119, 139, 20);
		contentPane.add(textValores);
		textValores.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textResultado.setEditable(false);
		textResultado.setBounds(94, 199, 257, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JButton btnAsignar = new JButton("Asignar");
		btnAsignar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x[],tam,valor=0;
				
				if(textTamaño.getText().equals("")||textValores.getText().equals("")){
					JOptionPane.showMessageDialog(null, "La casilla esta vacia");
					textTamaño.requestFocus();
				}else{
					try{
						//obtenemos tamaño
						tam = Integer.parseInt(textTamaño.getText());
						
						x = new int[tam];
						
						//creamos un vector que recoja el texto del valores e identifique cada elemento separado por una coma
						String[] Valores = textValores.getText().split(",");
						
						//convertimos de string a int
						for(int i=0;i<tam;i++){
							x[i] = Integer.parseInt(Valores[i]);
						}
						
						//creamos un string builder para que vuelva a juntar los valores como un vector string y poder imprimirlo
						StringBuilder builder = new StringBuilder();
						for(int i = 0 ; i < x.length ; i++ ){
							if(i<(tam-1)){
						    builder.append(x[i]+",");
							}else if(i==(tam-1)){
								 builder.append(x[i]);
							}
						}
						textResultado.setText(builder.toString());
						
					}catch(ArrayIndexOutOfBoundsException ex){
						JOptionPane.showMessageDialog(null, "Los valores ingresados no coinciden con la longitud del vector");
					}catch(NumberFormatException ex){
						JOptionPane.showMessageDialog(null,"Ingrese valor valido");
						textTamaño.setText("");
						textValores.setText("");
						textResultado.setText("");
						textTamaño.requestFocus();
					}
				}
						
			}
		});
		btnAsignar.setBounds(293, 43, 89, 23);
		contentPane.add(btnAsignar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTamaño.setText("");
				textTamaño.requestFocus();
				textValores.setText("");
				textResultado.setText("");
			}
		});
		btnNuevo.setBounds(293, 94, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu_Excepciones m = new Menu_Excepciones();
				m.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(293, 142, 89, 23);
		contentPane.add(btnSalir);
	}
}
