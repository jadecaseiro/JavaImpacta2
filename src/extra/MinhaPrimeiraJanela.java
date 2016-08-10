package extra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MinhaPrimeiraJanela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaPrimeiraJanela frame = new MinhaPrimeiraJanela();
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
	public MinhaPrimeiraJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblNome.setBounds(32, 48, 65, 21);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(144, 47, 112, 22);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblTelefone.setBounds(32, 109, 65, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(144, 106, 112, 21);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnClicar = new JButton("Clicar");
		btnClicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Teste teste");
				JOptionPane.showMessageDialog(null, "Você me clicou");
			}
		});
		btnClicar.setBounds(155, 174, 91, 23);
		contentPane.add(btnClicar);
	}
}
