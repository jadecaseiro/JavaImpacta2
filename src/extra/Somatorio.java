package extra;

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

public class Somatorio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Somatorio frame = new Somatorio();
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
	public Somatorio() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNum1 = new JLabel("Num 1:");
		lblNum1.setBounds(29, 22, 46, 14);
		contentPane.add(lblNum1);

		JLabel lblNum2 = new JLabel("Num 2:");
		lblNum2.setBounds(29, 80, 46, 14);
		contentPane.add(lblNum2);

		txtNum1 = new JTextField();
		txtNum1.setBounds(131, 19, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		txtNum1.setText("0");

		txtNum2 = new JTextField();
		txtNum2.setBounds(131, 77, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		txtNum2.setText("0");

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(29, 139, 73, 14);
		contentPane.add(lblResultado);

		JLabel lblResult = new JLabel("");
		lblResult.setBounds(144, 139, 46, 14);
		contentPane.add(lblResult);

		JButton btnSomar = new JButton("Somar");
		btnSomar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					lblResult.setText(String.valueOf(Double.parseDouble(txtNum1
							.getText()) + Double.parseDouble(txtNum2.getText())));
				} catch (java.lang.NumberFormatException err) {
					JOptionPane.showMessageDialog(null, "Digite números");

				}
			}
		});
		btnSomar.setBounds(43, 196, 91, 23);
		contentPane.add(btnSomar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblResult.setText("");
				txtNum1.setText("");
				txtNum2.setText("");

			}
		});
		btnLimpar.setBounds(178, 196, 91, 23);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Saindo do programa.");
				System.exit(1);
			}
		});
		btnSair.setBounds(299, 196, 91, 23);
		contentPane.add(btnSair);
	}

}
