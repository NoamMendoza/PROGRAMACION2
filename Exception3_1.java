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
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exception3_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textElem;
	private JTextField textMostrar;

	int v[]=new int[5];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exception3_1 frame = new Exception3_1();
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
	public Exception3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeElementos = new JLabel("Numero de elementos");
		lblNumeroDeElementos.setBounds(27, 28, 109, 14);
		contentPane.add(lblNumeroDeElementos);
		
		textElem = new JTextField();
		textElem.setBounds(192, 25, 86, 20);
		contentPane.add(textElem);
		textElem.setColumns(10);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setBackground(Color.WHITE);
		txtArea.setBounds(37, 75, 156, 156);
		contentPane.add(txtArea);
		
		JButton btnLlenar = new JButton("Llenar");
		btnLlenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<v.length;i++){
					v[i]= Integer.parseInt(JOptionPane.showInputDialog("Elemento en la posicion ["+(i+1)+"] del vector"));
				}
				for(int i=0;i<v.length;i++){
					txtArea.append(+v[i]+"\n");
				}
			}
		});
		btnLlenar.setBounds(312, 24, 89, 23);
		contentPane.add(btnLlenar);
		
		textMostrar = new JTextField();
		textMostrar.setBounds(312, 133, 86, 20);
		contentPane.add(textMostrar);
		textMostrar.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int p= Integer.parseInt(textMostrar.getText());

				try{
					JOptionPane.showMessageDialog(null, "El elemento de la posision ["+(p)+"] es "+v[p-1]);
				}catch(ArrayIndexOutOfBoundsException e){
					JOptionPane.showMessageDialog(null, "Debe ingresar un valor valido");
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		btnMostrar.setBounds(312, 164, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblPosicionQueDesea = new JLabel("Posicion que desea mostrar:");
		lblPosicionQueDesea.setBounds(284, 108, 140, 14);
		contentPane.add(lblPosicionQueDesea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu_Excepciones m = new Menu_Excepciones();
				m.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(312, 208, 89, 23);
		contentPane.add(btnSalir);
		
		
	}
}
