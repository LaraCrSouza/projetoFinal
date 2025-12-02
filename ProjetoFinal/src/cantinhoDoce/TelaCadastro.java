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
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEmail;
	private JTextField tfUsuarioC;
	private JTextField tfSenhaC;
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\Logotipo200.png"));
		setTitle("Tela de cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 529, 412);
		
		setResizable(false);
		
		setLocationRelativeTo(null); 
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem miInicio = new JMenuItem("Inicio");
		miInicio.setIcon(new ImageIcon("C:\\Users\\roger\\OneDrive\\Área de Trabalho\\casa.png"));
		miInicio.setForeground(new Color(0, 64, 128));
		miInicio.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		miInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaLogin.setVisible(true);
				
			}
		});
		menuBar.add(miInicio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.setBackground(new Color(196, 255, 255));
		tfEmail.setBounds(139, 96, 305, 23);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbEmail.setForeground(new Color(0, 64, 128));
		lbEmail.setBackground(new Color(240, 240, 240));
		lbEmail.setBounds(37, 96, 78, 23);
		contentPane.add(lbEmail);
		
		tfUsuarioC = new JTextField();
		tfUsuarioC.setBackground(new Color(196, 255, 255));
		tfUsuarioC.setColumns(10);
		tfUsuarioC.setBounds(139, 160, 305, 23);
		contentPane.add(tfUsuarioC);
		
		tfSenhaC = new JTextField();
		tfSenhaC.setBackground(new Color(196, 255, 255));
		tfSenhaC.setColumns(10);
		tfSenhaC.setBounds(139, 225, 305, 23);
		contentPane.add(tfSenhaC);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbUsuario.setForeground(new Color(0, 64, 128));
		lbUsuario.setBounds(37, 154, 91, 20);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setForeground(new Color(0, 64, 128));
		lbSenha.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbSenha.setBackground(new Color(0, 64, 128));
		lbSenha.setBounds(37, 219, 64, 21);
		contentPane.add(lbSenha);
		
		JLabel lblNewLabel = new JLabel("Cantinho Doce");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(10, 10, 144, 25);
		contentPane.add(lblNewLabel);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.setBackground(new Color(196, 255, 255));
		btCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaLogin = new TelaLogin();
				
				telaLogin.user= tfUsuarioC.getText();
				telaLogin.senha = tfSenhaC.getText();
				String texto = tfSenhaC.getText(); 
				
				
				if(texto.length() > 3) {
					JOptionPane.showMessageDialog(null, "Seu cadastro foi concluído com sucesso" , "Tela Bem vindo", 1);
					telaLogin.setVisible(true);
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Sua senha precisa ter mais de 4 caracteres" , "Tela de erro", JOptionPane.ERROR_MESSAGE);
					tfUsuarioC.setText("");
					tfSenhaC.setText("");
					tfEmail.setText("");
					tfUsuarioC.requestFocus();
				}
				
			}
		});
		btCadastrar.setBounds(209, 275, 125, 30);
		contentPane.add(btCadastrar);

	}
}
