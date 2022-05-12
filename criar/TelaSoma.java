package criar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSoma extends JFrame {

	private JPanel contentPane;
	private JTextField n1;
	private JTextField n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSoma frame = new TelaSoma();
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
	public TelaSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int v1 = Integer.parseInt(n1.getText());
			int v2 = Integer.parseInt(n2.getText());
			
			int soma = v1 + v2;
			
			btnIgual.setText(Integer.toString(soma));
			}
		});
		btnIgual.setBounds(216, 83, 80, 23);
		contentPane.add(btnIgual);
		
		n1 = new JTextField();
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBounds(10, 84, 80, 20);
		contentPane.add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBounds(126, 84, 80, 20);
		contentPane.add(n2);
		n2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 87, 16, 14);
		contentPane.add(lblNewLabel);
	}
}
