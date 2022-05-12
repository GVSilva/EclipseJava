package criar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParImpar extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParImpar frame = new ParImpar();
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
	public ParImpar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValor = new JTextField();
		txtValor.setBounds(83, 28, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		
		btnNewButton.setBounds(54, 62, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(27, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblresultado = new JLabel("Resultado");
		lblresultado.setBounds(27, 96, 56, 14);
		contentPane.add(lblresultado);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(txtValor.getText());
				
				if (valor %2==0) {
					lblresultado.setText("Par");	
				} else {
					lblresultado.setText("ímpar");
				}		
			}
		});
	}
}