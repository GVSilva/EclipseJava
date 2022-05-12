package criar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuperCalculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperCalculadora frame = new SuperCalculadora();
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
	public SuperCalculadora() {
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JSpinner txtNum = new JSpinner();
		txtNum.setModel(new SpinnerNumberModel(1, -50, 50, 1));
		txtNum.setBounds(145, 52, 50, 20);
		contentPane.add(txtNum);

		JButton BtnCalc = new JButton("Calcule");
		BtnCalc.setBounds(205, 51, 89, 23);
		contentPane.add(BtnCalc);

		JLabel lblNewLabel = new JLabel("Informe o Valor:");
		lblNewLabel.setBounds(29, 55, 80, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Super Calculadora");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(97, 11, 154, 20);
		contentPane.add(lblNewLabel_1);

		JPanel panPainel = new JPanel();
		panPainel.setBounds(39, 85, 226, 132);
		contentPane.add(panPainel);
		panPainel.setLayout(null);
		panPainel.setVisible(false);

		JLabel lblNewLabel_2_2 = new JLabel("Resto da Divid\u00E3o por 2");
		lblNewLabel_2_2.setBounds(10, 11, 130, 14);
		panPainel.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_1 = new JLabel("Elevado ao Cubo");
		lblNewLabel_2_1.setBounds(10, 36, 107, 14);
		panPainel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_3 = new JLabel("Raiz C\u00FAbica");
		lblNewLabel_2_3.setBounds(10, 86, 107, 14);
		panPainel.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2 = new JLabel("Raiz Quadrada");
		lblNewLabel_2.setBounds(10, 61, 107, 14);
		panPainel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_3_1 = new JLabel("Valor Absoluto");
		lblNewLabel_2_3_1.setBounds(10, 111, 107, 14);
		panPainel.add(lblNewLabel_2_3_1);

		JLabel lblAbs = new JLabel("0");
		lblAbs.setBounds(170, 111, 46, 14);
		panPainel.add(lblAbs);
		lblAbs.setForeground(Color.BLUE);
		lblAbs.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblCub = new JLabel("0");
		lblCub.setBounds(170, 86, 46, 14);
		panPainel.add(lblCub);
		lblCub.setHorizontalAlignment(SwingConstants.CENTER);
		lblCub.setForeground(Color.BLUE);

		JLabel lblQuad = new JLabel("0");
		lblQuad.setBounds(170, 61, 46, 14);
		panPainel.add(lblQuad);
		lblQuad.setForeground(Color.BLUE);
		lblQuad.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblcubo = new JLabel("0");
		lblcubo.setBounds(170, 36, 46, 14);
		panPainel.add(lblcubo);
		lblcubo.setForeground(Color.BLUE);
		lblcubo.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblresto = new JLabel("0");
		lblresto.setBounds(170, 11, 46, 14);
		panPainel.add(lblresto);
		lblresto.setForeground(Color.BLUE);
		lblresto.setHorizontalAlignment(SwingConstants.CENTER);

		BtnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());

				int r = num % 2;
				lblresto.setText(Integer.toString(r));

				double  c= Math.pow(num, 3);
				
				lblcubo.setText(Double.toString(c));
				
				double rq = Math.sqrt(num);
				lblQuad.setText(String.format("%.2f",rq));
				
				double rc = Math.cbrt(num);
				lblCub.setText(String.format("%.2f",rc));
				
				int abs = Math.abs(num);
				lblAbs.setText(Integer.toString(abs));
				
				
				panPainel.setVisible(true);
			}
		});

	}
}
