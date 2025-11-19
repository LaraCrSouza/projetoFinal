package cantinhoDoce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import cantinhoDoce.Usuario;

import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JProgressBar;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField pfSenha;
	private String user = "abc";
	private String senha = "123";
	private Usuario usuario;

	TelaCompras telaCompras = new TelaCompras();
	TelaCadastro telaCadastro = new TelaCadastro();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\aluno\\Downloads\\Logotipo (1).png"));
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 331);
		
		
		setResizable(false); //Ele faz com ue travemos a tela e nao de pra redimensiona-la
		
		setLocationRelativeTo(null); //Abre a tela centralizada
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantinho Doce");
		lblNewLabel.setForeground(new Color(37, 58, 250));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(10, 11, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbLogin = new JLabel("LOGIN");
		lbLogin.setForeground(new Color(0, 64, 128));
		lbLogin.setFont(new Font("Noto Sans Lao", Font.BOLD, 14));
		lbLogin.setBounds(194, 38, 66, 19);
		contentPane.add(lbLogin);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario(tfUsuario.getText(), pfSenha.getText());
				
				if (usuario.getUsuario().equals(user) && usuario.getSenha().equals(senha) || usuario.getUsuario().equals(tfUsuario) && usuario.getSenha().equals(pfSenha)); {
					JOptionPane.showMessageDialog(null, "Acesso OK\n" + usuario.getMsg());
					
//					telaCompras.setVisible(true);
//					dispose();
					} 
//				else {
//					JOptionPane.showMessageDialog(null, "Acesso negado");
//				} 
			}
		});
		btEntrar.setBackground(new Color(152, 226, 254));
		btEntrar.setBounds(187, 182, 89, 23);
		contentPane.add(btEntrar);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbUsuario.setForeground(new Color(0, 64, 128));
		lbUsuario.setBounds(71, 86, 46, 14);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbSenha.setForeground(new Color(0, 64, 128));
		lbSenha.setBounds(71, 135, 46, 14);
		contentPane.add(lbSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setForeground(new Color(0, 0, 0));
		tfUsuario.setBackground(new Color(152, 226, 254));
		tfUsuario.setBounds(127, 83, 230, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBackground(new Color(152, 226, 254));
		pfSenha.setBounds(127, 132, 230, 20);
		contentPane.add(pfSenha);
		pfSenha.setColumns(10);
		
		JLabel lbSemConta = new JLabel("Ainda não tem uma conta?");
		lbSemConta.setForeground(new Color(0, 64, 128));
		lbSemConta.setBackground(new Color(0, 124, 191));
		lbSemConta.setBounds(89, 252, 151, 14);
		contentPane.add(lbSemConta);
		
		JButton btCadastrase = new JButton("Cadastra-se");
		btCadastrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaCadastro.setVisible(true);
				dispose();
			}
		});
		btCadastrase.setBackground(new Color(152, 226, 254));
		btCadastrase.setBounds(250, 248, 117, 23);
		contentPane.add(btCadastrase);

	}
}
