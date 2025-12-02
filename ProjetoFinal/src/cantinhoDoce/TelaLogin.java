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
import javax.swing.ImageIcon;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField pfSenha;
	
	protected String user = "LaraCr";
	protected String senha = "1602";
	
	private Usuario usuario;
	private TelaCadastro cadastro;
	private TelaCompras telaCompras;
	private int tentativa = 0;
	
	

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\Logotipo200.png"));
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 412);
		
		
		setResizable(false); //Ele faz com ue travemos a tela e nao de pra redimensiona-la
		
		setLocationRelativeTo(null); //Abre a tela centralizada
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantinho Doce");
		lblNewLabel.setBackground(new Color(0, 64, 128));
		lblNewLabel.setForeground(new Color(37, 58, 250));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(10, 10, 129, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lbLogin = new JLabel("LOGIN");
		lbLogin.setForeground(new Color(0, 64, 128));
		lbLogin.setFont(new Font("Dialog", Font.BOLD, 20));
		lbLogin.setBounds(214, 79, 100, 19);
		contentPane.add(lbLogin);
		
		JButton btEntrar = new JButton("Entrar");
		btEntrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usuario = new Usuario(tfUsuario.getText(), pfSenha.getText());
				TelaCompras telaCompras = new TelaCompras();
				
				if(usuario.getUsuario().equals(user) && usuario.getSenha().equals(senha)) {
					JOptionPane.showMessageDialog(null,  "Acesso OK\n", "Tela de Acesso", 1);
					telaCompras.setVisible(true);
					tentativa = 0;
					
				} else {
					tentativa++;
					JOptionPane.showMessageDialog(null,  "Acesso negado.\n Tentativa " + tentativa + " de 3 ", "Tela de acesso", 0);
					tfUsuario.setText("");
					pfSenha.setText("");
					tfUsuario.requestFocus();
				}	
					if (tentativa >= 3) {
					JOptionPane.showMessageDialog(null, "Número máximo de tentativas atingido. Acesso bloqueado!");
					btEntrar.setEnabled(false); // desativa o botão
					tfUsuario.setEditable(false);
					pfSenha.setEditable(false);
				}
			}
		});
		
		btEntrar.setBackground(new Color(196, 255, 255));
		btEntrar.setBounds(223, 265, 91, 25);
		contentPane.add(btEntrar);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbUsuario.setForeground(new Color(0, 64, 128));
		lbUsuario.setBounds(41, 145, 82, 14);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbSenha.setForeground(new Color(0, 64, 128));
		lbSenha.setBounds(41, 203, 82, 19);
		contentPane.add(lbSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setForeground(new Color(0, 0, 0));
		tfUsuario.setBackground(new Color(196, 255, 255));
		tfUsuario.setBounds(149, 142, 301, 25);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setBackground(new Color(196, 255, 255));
		pfSenha.setBounds(149, 202, 301, 25);
		contentPane.add(pfSenha);
		pfSenha.setColumns(10);
		
		JLabel lbSemConta = new JLabel("Ainda não tem uma conta?");
		lbSemConta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbSemConta.setForeground(new Color(0, 64, 128));
		lbSemConta.setBackground(new Color(0, 124, 191));
		lbSemConta.setBounds(117, 333, 197, 14);
		contentPane.add(lbSemConta);
		
		JButton btCadastrase = new JButton("Cadastra-se");
		btCadastrase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btCadastrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastro cadastro = new TelaCadastro();
				cadastro.setVisible(true);
			}
		});
		btCadastrase.setBackground(new Color(196, 255, 255));
		btCadastrase.setBounds(329, 326, 121, 31);
		contentPane.add(btCadastrase);

	}
}
