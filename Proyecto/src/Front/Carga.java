package Front;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JProgressBar;
import java.awt.Color;

public class Carga extends JFrame {

	private JPanel contentPane;
	static JProgressBar Miprogreso;
	static JLabel Porcentaje;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		Carga MiCarga = new Carga();
		MiCarga.setVisible(true);
		
		try{
			for(int i =0;i<100;i++){
				Thread.sleep(1000);
				Miprogreso.setValue(i);
				Porcentaje.setText(Integer.toString(i)+"%");
			}
			}catch(Exception e){
				
			}
			new Registro().setVisible(true);
			MiCarga.dispose();
		
		
	}

	/**
	 * Create the frame.
	 */
	public Carga() {
		
		
		setUndecorated(true);
		setEnabled(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 566, 271);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 204));
		panel.setBounds(0, 0, 566, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPER LINCE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 11, 238, 29);
		panel.add(lblNewLabel);
		
		JLabel imagen = new JLabel("New label");
		imagen.setBounds(217, 67, 117, 102);
		panel.add(imagen);
		ImageIcon foto = new ImageIcon("C://Users//noama//OneDrive//Escritorio//arreglos//logo.png");
		ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),
				imagen.getHeight(), Image.SCALE_DEFAULT));
			    imagen.setIcon(icono);
		
		
		
		
		JLabel Porcentaje = new JLabel("si");
		Porcentaje.setHorizontalAlignment(SwingConstants.CENTER);
		Porcentaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Porcentaje.setBounds(156, 231, 238, 29);
		panel.add(Porcentaje);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
		
		JProgressBar Miprogreso = new JProgressBar();
		Miprogreso.setToolTipText("");
		Miprogreso.setForeground(Color.WHITE);
		Miprogreso.setBackground(Color.YELLOW);
		Miprogreso.setBounds(0, 257, 566, 14);
		panel.add(Miprogreso);
		
		
		
	}
}
