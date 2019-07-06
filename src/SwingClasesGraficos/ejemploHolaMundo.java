package SwingClasesGraficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ejemploHolaMundo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemploHolaMundo window = new ejemploHolaMundo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejemploHolaMundo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBoton = new JButton("Boton");
		btnBoton.setBounds(12, 12, 114, 25);
		frame.getContentPane().add(btnBoton);
		
		
		JLabel lblEstoEsSolo = new JLabel("Esto es solo un texto");
		lblEstoEsSolo.setBounds(145, 22, 166, 25);
		frame.getContentPane().add(lblEstoEsSolo);
	}
	
	public void eventoBoton() {
		
	}
}
