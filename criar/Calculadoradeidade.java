package criar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadoradeidade extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadoradeidade frame = new Calculadoradeidade();
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
	public Calculadoradeidade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(31, 35, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbl12 = new JLabel("Idade");
		lbl12.setBounds(31, 111, 46, 14);
		contentPane.add(lbl12);
		
		JLabel lblSituao = new JLabel("Situa\u00E7\u00E3o");
		lblSituao.setBounds(31, 147, 57, 14);
		contentPane.add(lblSituao);
		
		JLabel lblidade = new JLabel("0");
		lblidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblidade.setBounds(110, 111, 46, 14);
		contentPane.add(lblidade);
		
		JLabel lblsituacao = new JLabel("<vazio>");
		lblsituacao.setBounds(110, 147, 46, 14);
		contentPane.add(lblsituacao);
		
		txtAno = new JTextField();
		txtAno.setBounds(144, 32, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JButton BtnCalc = new JButton("Calcular Idade");
		BtnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int ano = Integer.parseInt(txtAno.getText());
			int idade = 2022 - ano;
			
			lblidade.setText(Integer.toString(ano)); 
			
			String sit = (idade > 18 ) ? "Maior":"Menor";
			lblsituacao.setText(sit);
			
			}
		});
		BtnCalc.setBounds(76, 60, 101, 23);
		contentPane.add(BtnCalc);
	}
}
