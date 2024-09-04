package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Label;

public class JLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tF_usuario;
	private JTextField tF_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
					frame.setLocationRelativeTo(null);
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
	public JLogin() {
		setTitle("Gerador de Certificados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(195, 10, 229, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 57, 166, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(22, 103, 166, 14);
		panel.add(lblNewLabel_1);
		
		tF_senha = new JTextField();
		tF_senha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tF_senha.setBounds(22, 119, 185, 25);
		panel.add(tF_senha);
		tF_senha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEntrar.setBounds(22, 162, 185, 30);
		panel.add(btnEntrar);
		
		JLabel lblNewLabel_2 = new JLabel("Área Restrita");
		lblNewLabel_2.setBounds(32, 11, 166, 35);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 23));
		
		tF_usuario = new JTextField();
		tF_usuario.setBounds(22, 72, 185, 25);
		panel.add(tF_usuario);
		tF_usuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tF_usuario.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 175, 240);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Igreja Evangélica Cristã");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(16, 121, 142, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Jacarandá");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(57, 139, 61, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Lagoa Funda");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(46, 157, 82, 14);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Provérbios 16:3");
		lblNewLabel_3_3.setBounds(0, 215, 175, 14);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Tarcisio\\eclipse-workspace\\GeraCertificado\\img\\logo.png"));
		lblNewLabel_4.setBounds(23, 38, 122, 72);
		panel_1.add(lblNewLabel_4);
		
		
	}
}
