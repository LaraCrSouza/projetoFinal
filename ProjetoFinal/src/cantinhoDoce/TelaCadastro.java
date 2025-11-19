package cantinhoDoce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEmail;
	private JTextField tfUsuario;
	private JTextField tfSenha;

	TelaLogin telaLogin = new TelaLogin();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setTitle("Tela de cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setResizable(false);
		
		setLocationRelativeTo(null); 
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem miInicio = new JMenuItem("Inicio");
		miInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaLogin.setVisible(true);
				dispose();
			}
		});
		menuBar.add(miInicio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.setBackground(new Color(152, 226, 254));
		tfEmail.setBounds(152, 57, 199, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbEmail.setForeground(new Color(0, 64, 128));
		lbEmail.setBackground(new Color(240, 240, 240));
		lbEmail.setBounds(96, 60, 46, 14);
		contentPane.add(lbEmail);
		
		tfUsuario = new JTextField();
		tfUsuario.setBackground(new Color(152, 226, 254));
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(152, 106, 199, 20);
		contentPane.add(tfUsuario);
		
		tfSenha = new JTextField();
		tfSenha.setBackground(new Color(152, 226, 254));
		tfSenha.setColumns(10);
		tfSenha.setBounds(152, 149, 199, 20);
		contentPane.add(tfSenha);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbUsuario.setForeground(new Color(0, 64, 128));
		lbUsuario.setBounds(96, 109, 46, 14);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setForeground(new Color(0, 64, 128));
		lbSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbSenha.setBackground(new Color(0, 64, 128));
		lbSenha.setBounds(96, 152, 46, 14);
		contentPane.add(lbSenha);
		
		JLabel lblNewLabel = new JLabel("Cantinho Doce");
		lblNewLabel.setForeground(new Color(37, 58, 250));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(22, 21, 93, 14);
		contentPane.add(lblNewLabel);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!tfUsuario.getText().isEmpty()) {
					telaLogin.action(null, btCadastrar);
					telaLogin.setVisible(true);
				}
			}
		});
		btCadastrar.setBounds(184, 199, 89, 23);
		contentPane.add(btCadastrar);

	}
}
