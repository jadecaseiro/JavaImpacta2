package cap18;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Somatorio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtNum2;
	JLabel lblResult = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Somatorio2 frame = new Somatorio2();
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
	public Somatorio2() {
		setTitle("Somat\u00F3rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNm = new JLabel("N\u00FAm 1:");
		lblNm.setBounds(74, 66, 46, 14);
		contentPane.add(lblNm);

		txtNum = new JTextField();
		txtNum.setBounds(205, 63, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);

		JLabel lblNm_1 = new JLabel("N\u00FAm 2:");
		lblNm_1.setBounds(74, 129, 46, 14);
		contentPane.add(lblNm_1);

		txtNum2 = new JTextField();
		txtNum2.setBounds(205, 126, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(74, 189, 86, 14);
		contentPane.add(lblResultado);

		JButton btnSomar = new JButton("Somar");
		btnSomar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				try {
//					Double resultado = Double.parseDouble(txtNum.getText())
//							+ Double.parseDouble(txtNum.getText());
//					lblResult.setText(resultado.toString());
//				} catch (java.lang.NumberFormatException nfe) {
//					JOptionPane.showMessageDialog(null, "Digite o número");
//					limpar();
//				}

				somar();
			}
		});
		btnSomar.setBounds(74, 226, 91, 23);
		contentPane.add(btnSomar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(205, 226, 91, 23);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(341, 226, 91, 23);
		contentPane.add(btnSair);

		// JLabel lblResult = new JLabel("");
		lblResult.setBounds(205, 189, 91, 14);
		contentPane.add(lblResult);
	}

	void limpar() {
		txtNum.setText(null);
		txtNum2.setText(null);
		lblResult.setText("");
		txtNum.requestFocus();
	}

	void somar() {
		try {
			double num1 = Double.parseDouble(txtNum.getText());
			double num2 = Double.parseDouble(txtNum2.getText());
			Double resultado = num1 + num2;
			lblResult.setText(String.valueOf(resultado));
		} catch (java.lang.NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Digite o número");
			limpar();
		}
	}
}
